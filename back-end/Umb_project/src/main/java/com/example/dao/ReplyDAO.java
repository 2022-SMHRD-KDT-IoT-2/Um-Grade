package com.example.dao;

import java.util.List;

import com.example.dto.ReplyVO;

public interface ReplyDAO {
	public List<ReplyVO> selectReply() throws Exception;
}
