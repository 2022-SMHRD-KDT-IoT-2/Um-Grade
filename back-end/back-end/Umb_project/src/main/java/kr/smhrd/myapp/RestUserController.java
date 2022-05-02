package kr.smhrd.myapp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kr.smhrd.domain.User;
import kr.smhrd.service.UserService;

@RestController
public class RestUserController {

	@Autowired
	private UserService service;
	
	@RequestMapping("/userList.do")
	public List<User> selectUser() {
		List<User> list = service.selectUser();
		return list;
	}
}
