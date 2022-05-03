package kr.smhrd.myapp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.smhrd.domain.Board;
import kr.smhrd.domain.Comment;
import kr.smhrd.domain.Coupon;
import kr.smhrd.service.BoardService;
import kr.smhrd.service.CommentService;
import kr.smhrd.service.CouponService;

@Controller
public class CommentController {

	@Autowired
    private CommentService service;
	
	@RequestMapping("/cmt.do")
	public String cmt(Model model) {
		List<Comment> list = service.selectCmt();
		
		model.addAttribute("list",list);
		
		return "cmtList";
	}
}
