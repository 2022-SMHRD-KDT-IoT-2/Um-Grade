package kr.smhrd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.smhrd.domain.Reply;
import kr.smhrd.mapper.ReplyMapper;

@Service
public class ReplyService {

	@Autowired
	private ReplyMapper mapper;
	
	public List<Reply> selectReply(){
		List<Reply> list = mapper.selectReply();
		return list;
	}
	
	// 답변글 게시글별 조회
	public List<Reply> selectListReply(int qna_seq){
		return mapper.selectListReply(qna_seq);
	}
	
	// 답변글 추가
	public void insertReply(Reply vo) {
		mapper.insertReply(vo);
	}
	 
	// 답변글 수정
	public void updateReply(Reply vo) {
		mapper.updateReply(vo);
	}

	// 답변글 삭제
	public void deleteReply(int reply_seq) {
		mapper.deleteReply(reply_seq);
	}
}
