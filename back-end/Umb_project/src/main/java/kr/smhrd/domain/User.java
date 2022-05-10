package kr.smhrd.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor //어노테이션 추가
@AllArgsConstructor
public class User {
	private String user_id;		// 아이디
	private String user_pw;		// 비밀번호
	private String user_nick;	// 닉네임
	private String user_name;   // 이름
	private String user_email;	// 이메일
	private String user_phone;  // 전화번호
	private String user_joindate;	// 가입일
	private String user_addr;		// 주소
	private String user_type;	// 유저 타입
	private String user_status; // 유저 상태
	private String user_point;  // 유저 포인트
	private String user_b_key; // 유저 빌링키
}
