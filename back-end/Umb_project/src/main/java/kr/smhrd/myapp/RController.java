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
public class RController {

	@Autowired
	private UserService service;

	@RequestMapping("/userList.do")
	public List<User> user() {
		List<User> list = service.selectUser();
		return list;
	}

	// 유저 회원 가입
	@RequestMapping(value = "/Join", method = RequestMethod.POST)
	public String Join(User user) {

		System.out.println(user.getUser_id());
		System.out.println(user.getUser_pw());
		System.out.println(user.getUser_nick());
		System.out.println(user.getUser_email());
		System.out.println(user.getUser_phone());
		System.out.println(user.getUser_addr());
		service.userJoin(user);

		return "success";
	}

	// 유저로그인
	@RequestMapping(value = "/Login", method = RequestMethod.POST)
	public String userLogin(User user) {
		
		String pw = service.userLogin(user);
		
	    
		if (user.getUser_pw().equals(pw)) {
			return "T";
		} else {
			return "F";

		}
		
	}

}
