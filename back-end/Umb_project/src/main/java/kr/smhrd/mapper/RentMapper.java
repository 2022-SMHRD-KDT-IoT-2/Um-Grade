package kr.smhrd.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import kr.smhrd.domain.Rent;


public interface RentMapper {

	@Select("select * from t_rent")
	public List<Rent> selectRent();
	
	// 개별 대여정보 조회
	public Rent selectOneRent(int rent_seq);
	
	// 현재 대여시간 조회 (반납 이전)
	public int selectRentTime(int rent_seq);
	
	// 대여시간 조회 (반납 이후)
	public int selectRentTime2(Rent vo);
	
	// 대여정보 추가
	public void insertRent(Rent vo);
	
	// 반납 시 반납일자 수정
	public void updateRentReturn(int rent_seq);
	
	// 결제금액 수정
	public void updateRentPayAmount(Rent vo);
	
	// 결제수단 수정
	public void updateRentPayMethod(Rent vo);
	
	// 결제여부 수정
	public void updateRentPayDone(Rent vo);
	
	// 대여정보 삭제
	public void deleteRent(int rent_seq);
	
}
