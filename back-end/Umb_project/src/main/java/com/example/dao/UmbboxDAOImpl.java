package com.example.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.example.dto.UmbboxVO;

@Repository
public class UmbboxDAOImpl implements UmbboxDAO {

	@Inject
	private SqlSession sqlSession;
	
	private static final String Namespace = "com.example.mapper.umbboxMapper";
	
	@Override
	public List<UmbboxVO> selectUbox() throws Exception {
		return sqlSession.selectList(Namespace+".selectUmbbox");
	}

}
