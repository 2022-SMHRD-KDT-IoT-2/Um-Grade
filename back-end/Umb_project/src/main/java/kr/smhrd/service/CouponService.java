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
	
	// 쿠폰 세부조회
	public Coupon selectOneCoupon(int cp_seq) {
		return mapper.selectOneCoupon(cp_seq);
	}
			
	// 쿠폰 추가
	public void insertCoupon(Coupon vo) {
		mapper.insertCoupon(vo);
	}
			
	// 쿠폰 사용여부 수정
	public void updateCoupon(Coupon vo) {
		mapper.updateCoupon(vo);
	}
		
	// 쿠폰 삭제
	public void deleteCoupon(int cp_seq) {
		mapper.deleteCoupon(cp_seq);
	}
	
}
