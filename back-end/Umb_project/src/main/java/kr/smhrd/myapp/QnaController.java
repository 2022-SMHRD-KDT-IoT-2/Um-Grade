package kr.smhrd.myapp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.smhrd.domain.Qna;
import kr.smhrd.service.QnaService;

@Controller
public class QnaController {

	@Autowired
	private QnaService service;
	
	@RequestMapping("/qna.do")
	public String qna(Model model) {
		List<Qna> list = service.selectQna();
		
		model.addAttribute("list",list);
		
		return "qnaList";
	}
}
