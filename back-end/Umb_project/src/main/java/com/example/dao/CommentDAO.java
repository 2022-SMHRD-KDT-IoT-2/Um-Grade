package com.example.dao;

import java.util.List;

import com.example.dto.CommentVO;

public interface CommentDAO {

	public List<CommentVO> selectComment() throws Exception; // 댓글 전체 출력
}
