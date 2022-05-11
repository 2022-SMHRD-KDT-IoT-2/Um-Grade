package kr.smhrd.myapp;

import java.io.IOException;
import java.net.ConnectException;
import java.net.NoRouteToHostException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kr.smhrd.service.RentalService;
import kr.smhrd.service.ReturnService;

@Controller
public class RetrunController {
	@Autowired
	private ReturnService returnService;
	
	@Autowired
	private RentalService rentalService;
	
	
	@RequestMapping("/frontRfid")
	public void frontRfid(@RequestParam String uid) throws NoRouteToHostException, ConnectException, IOException, Exception{
		if(uid.equals("time")){
			returnService.return1(uid);
			
		}else {
			rentalService.rental2(uid);
		}
	}
	

	@RequestMapping("/backRfid")
	public void backRfid(@RequestParam String uid) throws NoRouteToHostException, ConnectException, IOException, Exception{
		if(uid.equals("time")){
			rentalService.rental1(uid);
		}else {
			returnService.return2(uid);
		}
	}
}
