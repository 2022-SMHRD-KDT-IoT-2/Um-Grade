package kr.smhrd.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import kr.smhrd.domain.User;

public interface UserMapper {

	@Select("select * from t_user")
	public List<User> selectUser();
	
	//유저 회원가입
	public void userJoin(User user);
	
	//유저 로그인 
	public User userLogin(User user);
		
	//메인 페이지 유저 포인트 
	public void userPoint(User user);
	
	//마이페이지 회원 정보
	public void userInfo(User user);
}
