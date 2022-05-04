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
	public User userLogin(User user) {

		User info = mapper.userLogin(user);

		return info;

	}

	// 메인페이지 유저 포인트
	public void userPoint(User user) {

		mapper.userPoint(user);

	}

	// 마이페이지 유저 정보
	public void userInfo(User user) {
		mapper.userInfo(user);
	}
}
