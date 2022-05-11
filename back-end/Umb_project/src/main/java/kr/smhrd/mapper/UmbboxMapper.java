package kr.smhrd.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import kr.smhrd.domain.Umbbox;

public interface UmbboxMapper {
	
	// 보관함 전체조회
	@Select("select * from t_umbbox")
	public List<Umbbox> selectUbox();
	
	// 보관함 개별 정보 조회
	public Umbbox selectOneUbox(int ubox_seq);
	
	// 보관함 상태 정보 조회
	public String selectUboxStatus(int ubox_seq);
	
	// 보관함 추가
	public void insertUbox(Umbbox vo);
	
	// 보관함 상태 수정
	public void updateUboxStatus(String status);

	// 보관함 세부내용(설치장소명, 위도, 경도, 수량) 일괄 수정
	public void updateUbox(Umbbox vo);
	
	// 보관함 관리자 수정
	public void updateUboxAdmin(Umbbox vo);
	
	// 보관함 점검일자 수정
	public void updateUboxCheck(int ubox_seq);
	
	// 보관함 삭제
	public void deleteUbox(int ubox_seq);
	
	// 보관함 대여/반납신호 전송
	public void updateUboxID(Umbbox vo);
	
	// 보관함 대여취소신호/대여-반납 종료신호(보관함 사용자 아이디 초기화) 전송
	public void updateUboxID2(String ubox_id);
	
}
