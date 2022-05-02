package kr.smhrd.myapp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.smhrd.domain.Coupon;
import kr.smhrd.domain.Umbrella;
import kr.smhrd.service.CouponService;
import kr.smhrd.service.UmbrellaService;

@Controller
public class UmbrellaController {

	@Autowired
    private UmbrellaService service;
	
	@RequestMapping("/umb.do")
	public String umb(Model model) {
		List<Umbrella> list = service.selectUmb();
		
		model.addAttribute("list",list);
		
		return "umbList";
	}
}
