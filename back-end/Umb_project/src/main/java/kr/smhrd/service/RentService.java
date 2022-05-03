package kr.smhrd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.smhrd.domain.Rent;
import kr.smhrd.mapper.RentMapper;

@Service
public class RentService {

	@Autowired
	private RentMapper mapper;
	
	public List<Rent> selectRent(){
		List<Rent> list = mapper.selectRent();
		return list;
	}
}
