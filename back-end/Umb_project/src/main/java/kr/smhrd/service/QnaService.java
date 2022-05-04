package kr.smhrd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.smhrd.domain.Qna;
import kr.smhrd.mapper.QnaMapper;

@Service
public class QnaService {

	@Autowired
	private QnaMapper mapper;
	
	public List<Qna> selectQna() {
		List<Qna> list = mapper.selectQna();
		return list;
	}
	
	// 질의응답 게시글 개별 조회
	public Qna selectOneQna(int qna_seq) {
		return mapper.selectOneQna(qna_seq);
	}
		  
	// 게시글 추가
	public void insertQna(Qna vo) {
		mapper.insertQna(vo);
	}
		 	  
	// 게시글 내용, 첨부파일 수정
	public void updateQna(Qna vo) {
		mapper.updateQna(vo);
	}
	 
	// 게시글 삭제
	public void deleteQna(int qna_seq) {
		mapper.deleteQna(qna_seq);
	}
}
