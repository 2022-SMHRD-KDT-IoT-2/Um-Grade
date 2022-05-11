package kr.smhrd.service;

import java.io.IOException;
import java.net.ConnectException;
import java.net.NoRouteToHostException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.smhrd.mapper.RentMapper;
import kr.smhrd.mapper.UmbboxMapper;
import kr.smhrd.mapper.UmbrellaMapper;

@Service
public class RentalService {
	
	@Autowired
	private RaspService rpService;
	
	@Autowired
	private UmbboxMapper ubMapper;
	
	@Autowired
	private UmbrellaMapper urMapper;
	
	@Autowired
	private RentMapper rMapper;
	
	public void rental1(String uid, String umbbox_seq) throws NoRouteToHostException, ConnectException, IOException, Exception{
		rpService.getRequestApiGet("http://172.30.1.49:8082/soleOFF");
	}
	public void rental2(String uid, String umbbox_seq) throws NoRouteToHostException, ConnectException, IOException, Exception{
		rpService.getRequestApiGet("http://172.30.1.49:8082/soleON");
	}
}
