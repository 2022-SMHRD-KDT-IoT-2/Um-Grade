package kr.smhrd.myapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import kr.smhrd.domain.User;
import kr.smhrd.service.UserService;

@RestController
public class AndroidController {

	@Autowired
	private UserService service;

	// 유저 회원 가입
	@RequestMapping(value = "/Join", method = RequestMethod.POST)
	public String Join(User user) {

		System.out.println(user.getUser_id());
		System.out.println(user.getUser_pw());
		System.out.println(user.getUser_name());
		System.out.println(user.getUser_nick());
		System.out.println(user.getUser_email());
		System.out.println(user.getUser_phone());
		System.out.println(user.getUser_addr());
		service.userJoin(user);

		return "success";
	}

	// 유저로그인
	@RequestMapping(value = "/Login", method = RequestMethod.POST)
	public User userLogin(User user) {
		System.out.println("로그인 접근 감지");
		User info = service.userLogin(user);

		return info;

	}

}
