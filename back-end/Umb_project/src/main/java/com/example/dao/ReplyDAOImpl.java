package com.example.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;

import com.example.dto.ReplyVO;

public class ReplyDAOImpl implements ReplyDAO {

	@Inject
	private SqlSession sqlSession;
	
	private static final String Namespace = "com.example.mapper.replyMapper";
	
	@Override
	public List<ReplyVO> selectReply() throws Exception {
		return sqlSession.selectList(Namespace+".selectReply");
	}

}
