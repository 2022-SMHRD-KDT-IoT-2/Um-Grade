package kr.smhrd.myapp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.smhrd.domain.Board;
import kr.smhrd.domain.Coupon;
import kr.smhrd.service.BoardService;
import kr.smhrd.service.CouponService;

@Controller
public class BoardController {

	@Autowired
    private BoardService service;
	
	@RequestMapping("/board.do")
	public String board(Model model) {
		List<Board> list = service.selectBoard();
		
		model.addAttribute("list",list);
		
		return "boardList";
	}
}
