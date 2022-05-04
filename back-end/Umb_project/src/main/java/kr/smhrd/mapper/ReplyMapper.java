package kr.smhrd.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import kr.smhrd.domain.Reply;


public interface ReplyMapper {

	@Select("select * from t_reply")
	public List<Reply> selectReply();
	
	// 답변글 게시글별 조회
	public List<Reply> selectListReply(int qna_seq);
	
	// 답변글 추가
	public void insertReply(Reply vo);
	 
	// 답변글 수정
	public void updateReply(Reply vo);

	// 답변글 삭제
	public void deleteReply(int reply_seq);
	
}
