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
import kr.smhrd.service.RfidBackService;
import kr.smhrd.service.RfidFrontService;

@Controller
public class RetrunController {
	@Autowired
	private ReturnService returnService;
	
	@Autowired
	private RentalService rentalService;
	
	@Autowired
	private RfidFrontService rfService;
	
	@Autowired
	private RfidBackService rbService;
	
	
	@RequestMapping("/frontRfid")
	public void frontRfid(@RequestParam(value="uid") String uid, @RequestParam(value="umbbox_seq") String umbbox_seq) throws NoRouteToHostException, ConnectException, IOException, Exception{
		if(rfService.selectDiff() < 15 && rbService.selectDiff() != 0){
			rentalService.rental2(uid, umbbox_seq);
		}else {
			returnService.return1(uid, umbbox_seq);
		}
	}
	

	@RequestMapping("/backRfid")
	public void backRfid(@RequestParam(value="uid") String uid, @RequestParam(value="umbbox_seq") String umbbox_seq) throws NoRouteToHostException, ConnectException, IOException, Exception{
		if(rbService.selectDiff() < 15 && rbService.selectDiff() != 0){
			returnService.return2(uid, umbbox_seq);
		}else {
			rentalService.rental1(uid, umbbox_seq);
		}
	}
}
