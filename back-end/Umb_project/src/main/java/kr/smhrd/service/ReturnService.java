package kr.smhrd.service;

import java.io.IOException;
import java.net.ConnectException;
import java.net.NoRouteToHostException;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.smhrd.domain.Rent;
import kr.smhrd.domain.Umbbox;
import kr.smhrd.mapper.RentMapper;
import kr.smhrd.mapper.RfidBackMapper;
import kr.smhrd.mapper.RfidFrontMapper;
import kr.smhrd.mapper.UmbboxMapper;
import kr.smhrd.mapper.UmbrellaMapper;
import kr.smhrd.mapper.UserMapper;

@Service
public class ReturnService {

	@Autowired
	private RaspService rpService;
	
	@Autowired
	private PayService pService;
	
	@Autowired
	private UmbboxMapper ubMapper;
	
	@Autowired
	private RentMapper rMapper;
	
	@Autowired
	private UserMapper uMapper;
	
	@Autowired
	private RfidBackMapper rbMapper;
	
	@Autowired
	private RfidFrontMapper rfMapper;
	
	// 우산 반납을 시작
	public void return1(String uid, String umbbox_seq) throws NoRouteToHostException, ConnectException, IOException, Exception{
		rfMapper.insertLog(uid); 				// RFID 로그 입력
		Rent rvo = rMapper.selectOneRfid(uid); 	// 우산 uid로 렌트 VO 호출
		Umbbox bvo = null; 						// 보관함 VO 생성, updateUboxID(bvo)로 쓰기 위함
		bvo.setUbox_id(rvo.getRent_id()); 		// 보관함 VO에 우산 
		bvo.setUbox_seq(Integer.parseInt(umbbox_seq));
		rpService.getRequestApiGet("http://172.30.1.49:8082/soleOFF");
		ubMapper.updateUboxID(bvo);
	}
	
	// 우산 반납을 마무리
	public void return2(String uid, String umbbox_seq) throws NoRouteToHostException, ConnectException, IOException, Exception{
		rbMapper.insertLog(uid);
		rpService.getRequestApiGet("http://172.30.1.49:8082/soleON");
		Rent vo = rMapper.selectOneRfid(uid);
		int time = rMapper.selectRentTime(vo.getRent_seq());
		int pay = (time!=0)?((time/24)+1)*700:0;
		HashMap<String, Object> pc = new HashMap<>();
		pc.put("user_id", vo.getRent_id());
		pc.put("amount", pay);
		if(uMapper.isExistUserPoint(pc)) {
			pc.replace("amount", -pay);
			uMapper.updateUserPoint(pc);
			vo.setPay_method("P");
		}else {
			pService.auto(vo.getRent_id(), pay, Integer.toString(vo.getRent_seq()));
			vo.setPay_method("C");
		}
		
		// 대여기록 수정
		vo.setPay_done("Y");
		vo.setPay_amount(pay);
		rMapper.updateRentReturn(vo);
		
		// 보관함 사용자 초기화
		ubMapper.updateUboxID2(umbbox_seq);
		
	}
}
