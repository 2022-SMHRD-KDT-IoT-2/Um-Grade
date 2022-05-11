package kr.smhrd.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.smhrd.domain.Rfid;
import kr.smhrd.domain.Umbbox;
import kr.smhrd.mapper.RfidFrontMapper;



@Service
public class RfidFrontService {

	@Autowired
	private RfidFrontMapper mapper;
	
	public List<Rfid> selectRfid() {
		List<Rfid> list = mapper.selectRfid();
		return list;
	}
}
