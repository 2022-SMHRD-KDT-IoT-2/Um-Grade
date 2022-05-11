package kr.smhrd.myapp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kr.smhrd.domain.Board;
import kr.smhrd.domain.Comment;
import kr.smhrd.domain.Coupon;
import kr.smhrd.domain.Qna;
import kr.smhrd.domain.Reply;
import kr.smhrd.domain.Rfid;
import kr.smhrd.domain.Umbbox;
import kr.smhrd.domain.UsingCoupon;
import kr.smhrd.service.BoardService;
import kr.smhrd.service.CommentService;
import kr.smhrd.service.CouponService;
import kr.smhrd.service.QnaService;
import kr.smhrd.service.ReplyService;
import kr.smhrd.service.RfidFrontService;
import kr.smhrd.service.UmbboxService;
import kr.smhrd.service.UmbrellaService;
import kr.smhrd.service.UsingCouponService;

@Controller
public class HController {


	@RequestMapping("/")
	public String main() {
		return "userList";
	}
	
	@RequestMapping("/umb")
	public String umb() {
		return "umbList";
	}
	
	@RequestMapping("/rent")
	public String rent() {
		return "rentList";
	}
	
	@RequestMapping("/pay")
	public String pay(@RequestParam(value="id") String id) {
		return "paytest1";
	}
	
	@RequestMapping("/pay1")
	public String pay1() {
		return "test123";
	}
	
	@Autowired
	private QnaService qnaService;
	
	@Autowired
    private CouponService couponService;
	
	@Autowired
	private UmbboxService umbboxService;
	
	@Autowired
    private BoardService boardService;
	
	@Autowired
    private UsingCouponService usingCouponService;
	
	@Autowired
    private ReplyService replyService;
	
	@Autowired
    private CommentService commentService;
	
	@Autowired
    private RfidFrontService rfidFrontService;
	
	@RequestMapping("/qna.do")
	public String qna(Model model) {
		List<Qna> list = qnaService.selectQna();
		
		model.addAttribute("list",list);
		
		return "qnaList";
	}
	
	@RequestMapping("/coupon.do")
	public String coupon(Model model) {
		List<Coupon> list = couponService.selectCoupon();
		
		model.addAttribute("list",list);
		
		return "couponList";
	}
	
	@RequestMapping("/ubox.do")
	public String ubox(Model model) {
		List<Umbbox> list = umbboxService.selectUbox();
		
		model.addAttribute("list",list);
		
		return "uboxList";
	}
	

	@RequestMapping("/board.do")
	public String board(Model model) {
		List<Board> list = boardService.selectBoard();
		
		model.addAttribute("list",list);
		
		return "boardList";
	}
	

	
	@RequestMapping("/uc.do")
	public String uc(Model model) {
		List<UsingCoupon> list = usingCouponService.selectUC();
		
		model.addAttribute("list",list);
		
		return "ucList";
	}
	
	
	@RequestMapping("/cmt.do")
	public String cmt(Model model) {
		List<Comment> list = commentService.selectCmt();
		
		model.addAttribute("list",list);
		
		return "cmtList";
	}
	

	
	@RequestMapping("/reply.do")
	public String reply(Model model) {
		List<Reply> list = replyService.selectReply();
		
		model.addAttribute("list",list);
		
		return "replyList";
	}
	
	@RequestMapping("/rfid.do")
	public String rfid(Model model) {
		List<Rfid> list = rfidFrontService.selectRfid();
		
		model.addAttribute("list",list);
		
		return "RfidList";
	}
	
}
