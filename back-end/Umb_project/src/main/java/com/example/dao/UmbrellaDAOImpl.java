package com.example.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.example.dto.UmbrellaVO;

@Repository
public class UmbrellaDAOImpl implements UmbrellaDAO {
	
	@Inject
	private SqlSession sqlSession;
	
	private static final String Namespace = "com.example.mapper.umbrellaMapper";
	
	@Override
	public List<UmbrellaVO> selectUmb() throws Exception {

		return sqlSession.selectList(Namespace+".selectUmbrella");
	}

}
