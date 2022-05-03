package kr.smhrd.myapp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.smhrd.domain.UsingCoupon;
import kr.smhrd.service.UsingCouponService;

@Controller
public class UsingCouponController {

	@Autowired
    private UsingCouponService service;
	
	@RequestMapping("/uc.do")
	public String uc(Model model) {
		List<UsingCoupon> list = service.selectUC();
		
		model.addAttribute("list",list);
		
		return "ucList";
	}
}
