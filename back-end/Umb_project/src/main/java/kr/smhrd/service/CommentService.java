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
}
