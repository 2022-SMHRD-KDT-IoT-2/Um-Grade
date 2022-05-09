package kr.smhrd.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import kr.smhrd.domain.Board;
import kr.smhrd.domain.Qna;

public interface QnaMapper {

	@Select("select * from t_qna")
	public List<Qna> selectQna();
	
	// 질의응답 게시글 개별 조회
	public Qna selectOneQna(int qna_seq);
		  
	// 게시글 추가
	public void insertQna(Qna vo);
		 	  
	// 게시글 내용, 첨부파일 수정
	public void updateQna(Qna vo);
	 
	// 게시글 삭제
	public void deleteQna(int qna_seq);
}
