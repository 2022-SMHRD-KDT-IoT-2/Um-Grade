package kr.smhrd.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import kr.smhrd.domain.Umbrella;


public interface UmbrellaMapper {

	// 우산 전체조회
	@Select("select * from t_umbrella")
	public List<Umbrella> selectUmb();
	
	// 우산 추가
	public void insertUmb();
	
	// 파손정보 수정
	public void updateUmbBroken();
	
	// 점검일자 수정
	public void updateUmbCheck();
	
	// RFID UID 수정
	public void updateUmbRfid();
	
	// 우산 삭제
	public void deleteUmb();
	
	// 우산 개별 정보 조회
	public void selectOneUmb();
}
