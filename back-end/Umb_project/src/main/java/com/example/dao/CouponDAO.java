package com.example.dao;

import java.util.List;

import com.example.dto.CouponVO;

public interface CouponDAO {

	public List<CouponVO> selectCoupon() throws Exception;
}
