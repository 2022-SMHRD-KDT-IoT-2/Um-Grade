package kr.smhrd.myapp;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.smhrd.domain.Member;
import kr.smhrd.mapper.BoardMapper;
import kr.smhrd.mapper.MemberMapper;

@Controller
public class MemberController {

	@Autowired
	private MemberMapper mapper;
	
	@RequestMapping("/Login.do")
	public String login(Member vo, HttpSession session) {
		//1. 매개변수 : Member
		//2. service 작성
		//3. service - login() 반환값 받아주기
		Member login = mapper.login(vo);
		//4. 세션 생성(로그인이 가능한지(생성) / 불가능한지 파악)
		//5. boardList.jsp 돌아가기 - 만들어놓은게있다.???
		if(login != null) {
			session.setAttribute("login", login);
			System.out.println("로그인세션생성!");
		}
		else {
			System.out.println("로그인실패");
		}
		return "redirect:/";
	}
	
	@RequestMapping("/logout.do")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/";
	}
}
