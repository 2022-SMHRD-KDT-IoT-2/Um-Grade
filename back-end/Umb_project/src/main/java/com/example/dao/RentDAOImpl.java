package com.example.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;

import com.example.dto.RentVO;

public class RentDAOImpl implements RentDAO {

	@Inject
	private SqlSession sqlSession;
	
	private static final String Namespace = "com.example.mapper.rentMapper";
	
	@Override
	public List<RentVO> selectRent() throws Exception {
		return sqlSession.selectList(Namespace+".selectRent");
	}

}
