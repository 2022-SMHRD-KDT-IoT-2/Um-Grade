package kr.smhrd.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import kr.smhrd.domain.Coupon;
import kr.smhrd.domain.UsingCoupon;


public interface UsingCouponMapper {

	@Select("select * from t_using_coupon")
	public List<UsingCoupon> selectUC();
	
}
