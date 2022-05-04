package kr.smhrd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.smhrd.domain.Comment;
import kr.smhrd.mapper.CommentMapper;

@Service
public class CommentService {

	@Autowired
	private CommentMapper mapper;
	
	public List<Comment> selectCmt(){
		List<Comment> list = mapper.selectCmt();
		return list;
	}
	
	// 댓글 게시글별 조회
	public List<Comment> selectListCmt(int article_seq){
		return mapper.selectListCmt(article_seq);
	}
	  
	// 댓글 추가
	public void insertCmt(Comment vo) {
		mapper.insertCmt(vo);
	}
	 
	// 댓글 수정
	public void updateCmt(Comment vo) {
		mapper.updateCmt(vo);
	}
	  
	// 댓글 좋아요 증가
	public void updateCmtLikes(int cmt_seq) {
		mapper.updateCmtLikes(cmt_seq);
	}
 
	// 댓글 삭제
	public void deleteCmt(int cmt_seq) {
		mapper.deleteCmt(cmt_seq);
	}
	
}
