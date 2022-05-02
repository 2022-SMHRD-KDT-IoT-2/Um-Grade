package kr.smhrd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.smhrd.domain.Coupon;
import kr.smhrd.domain.Umbrella;
import kr.smhrd.mapper.CouponMapper;
import kr.smhrd.mapper.UmbrellaMapper;

@Service
public class UmbrellaService {

	@Autowired
	private UmbrellaMapper mapper;
	
	public List<Umbrella> selectUmb(){
		List<Umbrella> list = mapper.selectUmb();
		return list;
	}
}
