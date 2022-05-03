package kr.smhrd.myapp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.smhrd.domain.Coupon;
import kr.smhrd.domain.Reply;
import kr.smhrd.service.CouponService;
import kr.smhrd.service.ReplyService;

@Controller
public class ReplyController {

	@Autowired
    private ReplyService service;
	
	@RequestMapping("/reply.do")
	public String reply(Model model) {
		List<Reply> list = service.selectReply();
		
		model.addAttribute("list",list);
		
		return "replyList";
	}
}
