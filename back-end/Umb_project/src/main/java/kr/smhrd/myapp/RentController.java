package kr.smhrd.myapp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.smhrd.domain.Qna;
import kr.smhrd.domain.Rent;
import kr.smhrd.service.QnaService;
import kr.smhrd.service.RentService;

@Controller
public class RentController {

	@Autowired
	private RentService service;
	
	@RequestMapping("/rent.do")
	public String Rent(Model model) {
		List<Rent> list = service.selectRent();
		
		model.addAttribute("list",list);
		
		return "rentList";
	}
}
