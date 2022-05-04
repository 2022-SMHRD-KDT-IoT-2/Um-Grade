package kr.smhrd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.smhrd.domain.User;
import kr.smhrd.mapper.UserMapper;

@Service
public class UserService {

	@Autowired
	private UserMapper mapper;

	public List<User> selectUser() {
		List<User> list = mapper.selectUser();
		return list;
	}

	// 유저 회원가입
	public void userJoin(User user) {
		mapper.userJoin(user);
	}

	// 유저로그인
	public String userLogin(User user) {

		String id = mapper.userLogin(user);
		
		return id;
		
	}
	
	// 메인페이지 유저 가입 날짜 확인
		public String userInfo(User user) {

			String date = mapper.userInfo(user);
			
			return date;
		}

}
