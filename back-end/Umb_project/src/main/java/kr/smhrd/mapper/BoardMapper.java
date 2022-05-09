package kr.smhrd.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import kr.smhrd.domain.Board;


public interface BoardMapper {

	@Select("select * from t_board")
	public List<Board> selectBoard();
	

	// 커뮤니티 게시글 개별 조회
	public Board selectOneBoard(int article_seq);
	  
	// 게시글 추가
	public void insertBoard(Board vo);
	 
	// 게시글 조회수 증가
	public void updateBoardCnt(int article_seq);
	  
	// 게시글 내용, 첨부파일 수정
	public void updateBoard(Board vo);
 
	// 게시글 삭제
	public void deleteBoard(int article_seq);
	
	
}
