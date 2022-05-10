package kr.smhrd.service;

import java.util.HashMap;
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
	
	//유저 카드등록
	public void updateUserBK(HashMap<String, String> map) {
		mapper.updateUserBK(map);
	}
	
	//유저 카드등록 취소
	public void updateUserBKUnused(String user_id) {
		mapper.updateUserBKUnused(user_id);
	}
	
	//유저 포인트 조회(결제금액 이상인지, 미만인지 판별)
	public boolean isExistUserPoint(HashMap<String, Object> map) {
		return mapper.isExistUserPoint(map);
	}
	
	//유저 포인트 수정 (결제 이후 결제금액 차감(음수로 입력) + 쿠폰이나 리워드로 포인트 충전)
	public void updateUserPoint(HashMap<String, Object> map) {
		mapper.updateUserPoint(map);
	}
	
	//유저 빌링키 조회
	public String selectUserBK(String user_id) {
		return mapper.selectUserBK(user_id);
	}
	
	

}
