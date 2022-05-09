package kr.smhrd.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import kr.smhrd.domain.Coupon;


public interface CouponMapper {

	@Select("select * from t_coupon")
	public List<Coupon> selectCoupon();
	
	// 쿠폰 세부조회
	public Coupon selectOneCoupon(int cp_seq);
		
	// 쿠폰 추가
	public void insertCoupon(Coupon vo);
		
	// 쿠폰 사용여부 수정
	public void updateCoupon(Coupon vo);
	
	// 쿠폰 삭제
	public void deleteCoupon(int cp_seq);
	
}
