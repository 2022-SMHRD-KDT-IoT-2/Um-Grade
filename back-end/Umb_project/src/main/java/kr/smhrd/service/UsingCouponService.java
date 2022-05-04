package kr.smhrd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.smhrd.domain.UsingCoupon;
import kr.smhrd.mapper.UsingCouponMapper;

@Service
public class UsingCouponService {

	@Autowired
	private UsingCouponMapper mapper;
	
	public List<UsingCoupon> selectUC(){
		List<UsingCoupon> list = mapper.selectUC();
		return list;
	}
	
	// 사용쿠폰 세부조회
	public UsingCoupon selectOneUC(int uc_seq) {
		return mapper.selectOneUC(uc_seq);
	}
		
	// 사용쿠폰 추가
	public void insertUC(UsingCoupon vo) {
		mapper.insertUC(vo);
	}
	
	
}
