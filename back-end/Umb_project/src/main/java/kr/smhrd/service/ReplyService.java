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
}
