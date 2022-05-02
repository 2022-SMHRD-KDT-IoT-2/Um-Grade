package kr.smhrd.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import kr.smhrd.domain.Coupon;


public interface CouponMapper {

	@Select("select * from t_coupon")
	public List<Coupon> selectCoupon();
	
}
