package com.example.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;

import com.example.dto.QnaVO;

public class QnaDAOImpl implements QnaDAO {

	@Inject
	private SqlSession sqlSession;
	
	private static final String Namespace = "com.example.mapper.qnaMapper";

	@Override
	public List<QnaVO> selectQna() throws Exception {
		return sqlSession.selectList(Namespace+".selectQna");
	}
	

}
