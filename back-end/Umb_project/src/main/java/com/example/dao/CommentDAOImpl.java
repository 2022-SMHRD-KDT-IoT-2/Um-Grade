package com.example.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;

import com.example.dto.CommentVO;

public class CommentDAOImpl implements CommentDAO {

	@Inject
	private SqlSession sqlSession;
	
	private static final String Namespace = "com.example.mapper.commentMapper";
	
	@Override
	public List<CommentVO> selectComment() throws Exception {
		return sqlSession.selectList(Namespace+".selectComment");
	}

}
