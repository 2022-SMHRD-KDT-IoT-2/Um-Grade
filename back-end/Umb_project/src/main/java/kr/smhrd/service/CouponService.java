package kr.smhrd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.smhrd.domain.Coupon;
import kr.smhrd.mapper.CouponMapper;

@Service
public class CouponService {

	@Autowired
	private CouponMapper mapper;
	
	public List<Coupon> selectCoupon(){
		List<Coupon> list = mapper.selectCoupon();
		return list;
	}
}
