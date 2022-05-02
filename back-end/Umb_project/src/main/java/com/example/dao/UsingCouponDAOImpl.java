package com.example.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;

import com.example.dto.UsingCouponVO;

public class UsingCouponDAOImpl implements UsingCouponDAO {

	@Inject
	private SqlSession sqlSession;
	
	private static final String Namespace = "com.example.mapper.usingCouponMapper";
	
	@Override
	public List<UsingCouponVO> selectUc() throws Exception {
		return sqlSession.selectList(Namespace+".selectUsingCoupon");
	}

}
