package kr.smhrd.myapp;

import javax.servlet.http.HttpServletRequest;

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
	@RequestMapping(value = "/Login")
	public User userLogin(User user) {
		System.out.println("로그인 접근 감지");
		User info = service.userLogin(user);

		return info;
	}

	// 우산대여요청
			@RequestMapping(value = "/Rent", method = RequestMethod.POST)
			public void umbRent(HttpServletRequest httpServletRequest) {
				System.out.println("대여 감지");
				String get_url = httpServletRequest.getParameter("qrNum");
				String get_userId = httpServletRequest.getParameter("userId");
				System.out.println("대여 URL : " + get_url);
				System.out.println("대여 User : " + get_userId);
				
//				Rentservice.insertRent(null);

			}

}
