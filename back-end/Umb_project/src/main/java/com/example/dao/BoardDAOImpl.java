package com.example.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;

import com.example.dto.BoardVO;

public class BoardDAOImpl implements BoardDAO {

	@Inject
	private SqlSession sqlSession;
	
	private static final String Namespace = "com.example.mapper.boardMapper";
	
	@Override
	public List<BoardVO> selectBoard() throws Exception {
		return sqlSession.selectList(Namespace+".selectBoard");
	}

}
