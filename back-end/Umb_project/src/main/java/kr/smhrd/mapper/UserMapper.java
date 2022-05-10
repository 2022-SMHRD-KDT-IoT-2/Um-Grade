package kr.smhrd.mapper;

import java.util.HashMap;
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
	
	//유저 카드등록
	public void updateUserBK(HashMap<String, String> map);
	
	//유저 카드등록 취소
	public void updateUserBKUnused(String user_id);
	
	//유저 포인트 조회(결제금액 이상인지, 미만인지 판별)
	public boolean isExistUserPoint(HashMap<String, Object> map);
	
	//유저 포인트 수정 (결제 이후 결제금액 차감(음수로 입력) + 쿠폰이나 리워드로 포인트 충전)
	public void updateUserPoint(HashMap<String, Object> map);
	
	//유저 빌링키 조회
	public String selectUserBK(String user_id);
	
}
