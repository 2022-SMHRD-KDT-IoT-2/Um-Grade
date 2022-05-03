package kr.smhrd.myapp;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import kr.smhrd.domain.User;
import kr.smhrd.service.UserService;

@RestController
public class RestUserController {

	@Autowired
	private UserService service;
	
	@RequestMapping("/userList.do")
	public List<User> user() {
		List<User> list = service.selectUser();
		return list;
	}
	
	//유저로그인
	@RequestMapping(value = "/Login.do", method = RequestMethod.POST)
	public String userLogin(User user, HttpSession session) {
		
		String nick = service.userLogin(user);
		System.out.println(user.getUser_id());
		System.out.println(user.getUser_pw());
						
		return nick;
	}
}
