package com.example.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;

import com.example.dto.CouponVO;

public class CouponDAOImpl implements CouponDAO {

	@Inject
	private SqlSession sqlSession;
	
	private static final String Namespace = "com.example.mapper.couponMapper";
	
	@Override
	public List<CouponVO> selectCoupon() throws Exception {
		return sqlSession.selectList(Namespace+".selectCoupon");
	}

}
