package kr.smhrd.myapp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.smhrd.domain.Qna;
import kr.smhrd.domain.Umbbox;
import kr.smhrd.service.QnaService;
import kr.smhrd.service.UmbboxService;

@Controller
public class UmbboxController {

	@Autowired
	private UmbboxService service;
	
	@RequestMapping("/ubox.do")
	public String ubox(Model model) {
		List<Umbbox> list = service.selectUbox();
		
		model.addAttribute("list",list);
		
		return "uboxList";
	}
}
