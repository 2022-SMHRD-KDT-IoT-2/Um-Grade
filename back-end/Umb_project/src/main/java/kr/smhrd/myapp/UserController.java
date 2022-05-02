package kr.smhrd.myapp;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.smhrd.domain.User;
import kr.smhrd.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService service;
	
	@RequestMapping("/")
	public String main(Model model) {
		List<User> list = service.selectUser();
		
		model.addAttribute("list",list);
		
		return "userList";
	}
	//유저 로그인
	@RequestMapping(value = "/Login", method = RequestMethod.POST)
	public String userLogin(User user, HttpSession session) {
		
		String nick = service.userLogin(user);
		//id,pw 값 확인 완료!
		System.out.println(user.getUser_id());
		System.out.println(user.getUser_pw());
			
		return nick;
	}
}
