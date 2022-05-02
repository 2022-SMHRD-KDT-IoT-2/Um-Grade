package kr.smhrd.myapp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.smhrd.domain.Coupon;
import kr.smhrd.service.CouponService;

@Controller
public class CouponController {

	@Autowired
    private CouponService service;
	
	@RequestMapping("/coupon.do")
	public String coupon(Model model) {
		List<Coupon> list = service.selectCoupon();
		
		model.addAttribute("list",list);
		
		return "couponList";
	}
}
