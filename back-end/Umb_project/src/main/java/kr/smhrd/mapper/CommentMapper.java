package kr.smhrd.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import kr.smhrd.domain.Comment;

public interface CommentMapper {

	@Select("select * from t_comment")
	public List<Comment> selectCmt();
	
	// 댓글 게시글별 조회
	public List<Comment> selectListCmt(int article_seq);
	  
	// 댓글 추가
	public void insertCmt(Comment vo);
	 
	// 댓글 수정
	public void updateCmt(Comment vo);
	  
	// 댓글 좋아요 증가
	public void updateCmtLikes(int cmt_seq);
 
	// 댓글 삭제
	public void deleteCmt(int cmt_seq);
	
}
