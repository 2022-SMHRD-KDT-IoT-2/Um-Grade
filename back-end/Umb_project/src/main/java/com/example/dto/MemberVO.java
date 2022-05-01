package com.example.dto;

import lombok.Data;

@Data
public class MemberVO {

	private String user_id;
	private String user_pw;
	private String user_nick;
	private String user_email;
	private String user_phone;
	private String user_joindate;
	private String user_addr;
	private String user_type;
	private String user_status;
	private int user_point;


}
