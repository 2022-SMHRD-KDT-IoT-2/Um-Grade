package kr.smhrd.service;

import org.springframework.beans.factory.annotation.Autowired;

import kr.smhrd.domain.Member;
import kr.smhrd.mapper.MemberMapper;

public class MemberService {
	
	@Autowired
	private MemberMapper mapper;
	
	//1.매개인자 : Member
	//2.반환타입 : 
	//3.mapper interface
	//4.mapper - login() 호출
	//5.반환값
	
	public Member login(Member vo) {
		Member m_vo = mapper.login(vo);
		return m_vo;
	}
}