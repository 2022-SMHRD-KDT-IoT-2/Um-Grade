package kr.smhrd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.smhrd.domain.Board;
import kr.smhrd.mapper.BoardMapper;
import kr.smhrd.mapper.CouponMapper;

@Service
public class BoardService {

	@Autowired
	private BoardMapper mapper;
	
	public List<Board> selectBoard(){
		List<Board> list = mapper.selectBoard();
		return list;
	}
	
	// 커뮤니티 게시글 개별 조회
	public Board selectOneBoard(int article_seq) {
		return mapper.selectOneBoard(article_seq);
	}
		  
	// 게시글 추가
	public void insertBoard(Board vo) {
		mapper.insertBoard(vo);
	}
		
	// 게시글 조회수 증가
	public void updateBoardCnt(int article_seq) {
		mapper.updateBoardCnt(article_seq);
	}
		  
	// 게시글 내용, 첨부파일 수정
	public void updateBoard(Board vo) {
		mapper.updateBoard(vo);
	}
	 
	// 게시글 삭제
	public void deleteBoard(int article_seq) {
		mapper.deleteBoard(article_seq);
	}
}
