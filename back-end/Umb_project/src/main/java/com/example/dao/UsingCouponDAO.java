package com.example.dao;

import java.util.List;

import com.example.dto.UsingCouponVO;

public interface UsingCouponDAO {

	public List<UsingCouponVO> selectUc() throws Exception;
}
