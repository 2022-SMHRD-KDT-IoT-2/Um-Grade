package kr.smhrd.myapp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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
}
