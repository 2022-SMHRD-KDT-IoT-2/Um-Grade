package kr.smhrd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.smhrd.domain.Rent;
import kr.smhrd.mapper.RentMapper;

@Service
public class RentService {

	@Autowired
	private RentMapper mapper;
	
	public List<Rent> selectRent(){
		List<Rent> list = mapper.selectRent();
		return list;
	}
	
	// 개별 대여정보 조회
	public Rent selectOneRent(int rent_seq) {
		return mapper.selectOneRent(rent_seq);
	}
	
	// 현재 대여시간 조회 (반납 이전)
	public int selectRentTime(int rent_seq) {
		return mapper.selectRentTime(rent_seq);
	}

	// 대여시간 조회 (반납 이후)
	public int selectRentTime2(Rent vo) {
		return mapper.selectRentTime2(vo);
	}
	
	// 대여정보 추가
	public void insertRent(Rent vo) {
		mapper.insertRent(vo);
	}
	
	// 반납 시 반납일자 수정
	public void updateRentReturn(Rent vo) {
		mapper.updateRentReturn(vo);
	}
	
	
	// 대여정보 삭제
	public void deleteRent(int rent_seq){
		mapper.deleteRent(rent_seq);
	}
	
}
