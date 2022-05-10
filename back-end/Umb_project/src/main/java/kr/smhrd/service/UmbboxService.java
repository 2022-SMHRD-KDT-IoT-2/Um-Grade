package kr.smhrd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.smhrd.domain.Umbbox;
import kr.smhrd.mapper.UmbboxMapper;

@Service
public class UmbboxService {

	@Autowired
	private UmbboxMapper mapper;
	
	public List<Umbbox> selectUbox() {
		List<Umbbox> list = mapper.selectUbox();
		return list;
	}
	
	// 보관함 세부정보 조회
	public Umbbox selectOneUbox(int ubox_seq) {
		return mapper.selectOneUbox(ubox_seq);
	}
	
	// 보관함 상태 정보 조회
	public String selectUboxStatus(int ubox_seq) {
		return mapper.selectUboxStatus(ubox_seq);
	}
		
	// 보관함 삭제
	public void deleteUbox(int ubox_seq) {
		mapper.deleteUbox(ubox_seq);
	}
	
	public void insertUbox(Umbbox vo) {
		mapper.insertUbox(vo);
	}
		
	// 보관함 점검일자 수정
	public void updateUboxCheck(int ubox_seq) {
		mapper.updateUboxCheck(ubox_seq);
	}

	// 보관함 상태 수정
	public void updateUboxStatus(String status) {
		mapper.updateUboxStatus(status);
	}
		
	// 보관함 세부내용(설치장소명, 위도, 경도, 수량) 일괄 수정
	public void updateUbox(Umbbox vo) {
		mapper.updateUbox(vo);
	}
		
	// 보관함 관리자 수정
	public void updateUboxAdmin(Umbbox vo) {
		mapper.updateUboxAdmin(vo);
	}
}
