package kr.smhrd.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import kr.smhrd.domain.UsingCoupon;
import kr.smhrd.domain.UsingCoupon;


public interface UsingCouponMapper {

	@Select("select * from t_using_coupon")
	public List<UsingCoupon> selectUC();
	
	// 사용쿠폰 세부조회
	public UsingCoupon selectOneUC(int uc_seq);
		
	// 사용쿠폰 추가
	public void insertUC(UsingCoupon vo);
		
}
