package com.example.umb_project.vo;

public class User {

    private String user_id;		// 아이디
    private String user_pw;		// 비밀번호
    private String user_name;   // 이름
    private String user_nick;	// 닉네임
    private String user_email;	// 이메일
    private String user_phone;  // 전화번호
    private String user_joindate;	// 가입일
    private String user_addr;		// 주소
    private String user_type;	// 유저 타입
    private String user_status; // 유저 상태
    private String user_point;  // 유저 포인트

    public User(String user_id, String user_pw, String user_name, String user_nick, String user_email, String user_phone, String user_joindate, String user_addr, String user_type, String user_status, String user_point) {
        this.user_id = user_id;
        this.user_pw = user_pw;
        this.user_name = user_name;
        this.user_nick = user_nick;
        this.user_email = user_email;
        this.user_phone = user_phone;
        this.user_joindate = user_joindate;
        this.user_addr = user_addr;
        this.user_type = user_type;
        this.user_status = user_status;
        this.user_point = user_point;
    }

    public String getUser_id() {
        return user_id;
    }

    public String getUser_pw() {
        return user_pw;
    }

    public String getUser_name() {
        return user_name;
    }

    public String getUser_nick() {
        return user_nick;
    }

    public String getUser_email() {
        return user_email;
    }

    public String getUser_phone() {
        return user_phone;
    }

    public String getUser_joindate() {
        return user_joindate;
    }

    public String getUser_addr() {
        return user_addr;
    }

    public String getUser_type() {
        return user_type;
    }

    public String getUser_status() {
        return user_status;
    }

    public String getUser_point() {
        return user_point;
    }

    @Override
    public String toString() {
        return "User{" +
                "user_id='" + user_id + '\'' +
                ", user_pw='" + user_pw + '\'' +
                ", user_name='" + user_name + '\'' +
                ", user_nick='" + user_nick + '\'' +
                ", user_email='" + user_email + '\'' +
                ", user_phone='" + user_phone + '\'' +
                ", user_joindate='" + user_joindate + '\'' +
                ", user_addr='" + user_addr + '\'' +
                ", user_type='" + user_type + '\'' +
                ", user_status='" + user_status + '\'' +
                ", user_point='" + user_point + '\'' +
                '}';
    }
}
