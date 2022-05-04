package kr.smhrd.myapp;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import kr.smhrd.domain.Rent;
import kr.smhrd.domain.Umbrella;
import kr.smhrd.domain.User;
import kr.smhrd.service.RentService;
import kr.smhrd.service.UmbrellaService;
import kr.smhrd.service.UserService;

@RestController
public class RController {

	@Autowired
	private UserService service;
	
	@Autowired
	private RentService rentService;

	@Autowired
    private UmbrellaService umbrellaService;
	
	@RequestMapping("/userList.do")
	public List<User> user() {
		List<User> list = service.selectUser();
		return list;
	}
	
	@RequestMapping("/rentList.do")
	public List<Rent> Rent(Model model) {
		List<Rent> list = rentService.selectRent();
		return list;
	}
	
	@RequestMapping("/umbList.do")
	public List<Umbrella> umb() {
		List<Umbrella> list = umbrellaService.selectUmb();
		return list;
	}
	
	@RequestMapping("/umbUpdate.do")
	public void umbUp(int umb_seq) {
		umbrellaService.updateUmbCheck(umb_seq);
	}
	
//	@RequestMapping("/selectRt.do")
//	public int selectRt(int rent_seq) {
//		return rentService.selectRentTime(rent_seq);
//	}
	

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
