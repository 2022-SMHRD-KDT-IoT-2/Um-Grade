package kr.smhrd.myapp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.NoRouteToHostException;
import java.net.URL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kr.smhrd.service.UmbboxService;
import kr.smhrd.service.UmbrellaService;

@Controller
public class RaspController {

	@Autowired
	private UmbboxService umbboxService;
	
	@Autowired
	private UmbrellaService umbrellaService;
	
//	@RequestMapping("/frontRfid")
//	public void frontRfid(@RequestParam String uid) throws NoRouteToHostException, ConnectException, IOException, Exception {
//		System.out.println("uid값 : " + uid);
//		String status = umbboxService.selectUboxStatus(1);
//		if(umbrellaService.isExistUmbRfid(uid)) {
//			switch(status) {
//			    // 대여 (절차 종료)
//				case"L":getRequestApiGet("http://172.30.1.49:8082/soleOFF");
//						umbboxService.updateUboxStatus("U");
//						// 여기에 rent 테이블 인서트 (결제 절차가 최종적으로 확정되고 난 후 수정)
//						break;
//				// 반납 (절차 중간)
//				case"U":getRequestApiGet("http://172.30.1.49:8082/soleON");
//						umbboxService.updateUboxStatus("L");
//						break;
//				default: System.out.println("보관함 사용불가");
//						// led
//			}
//		}else {
//			System.out.println("해당 uid 값은 사용할 수 없습니다.");
//		}
////		System.out.println("Front Rfid 요청이들어왓어!~");
////		getRequestApiGet("http://172.30.1.49:8082/soleON");
//	}
//	
//	@RequestMapping("/backRfid")
//	public void backRfid(@RequestParam String uid) throws NoRouteToHostException, ConnectException, IOException, Exception {
//		System.out.println("uid값 : " + uid);
//		String status = umbboxService.selectUboxStatus(1);
//		if(umbrellaService.isExistUmbRfid(uid)) {
//			switch(status) {
//				// 반납 (절차 종료)
//				case"L":getRequestApiGet("http://172.30.1.49:8082/soleOFF");
//						umbboxService.updateUboxStatus("U");
//						// 여기에 rent 테이블 업데이트 + 자동결제 (결제 절차가 최종적으로 확정되고 난 후 수정)
//						// fan 가동
//						break;
//				// 대여 (절차 중간)
//				case"U":getRequestApiGet("http://172.30.1.49:8082/soleON");
//						umbboxService.updateUboxStatus("L");
//						break;
//				default: System.out.println("보관함 사용불가");
//			}
//		}else {
//			System.out.println("해당 uid 값은 사용할 수 없습니다.");
//		}
////		System.out.println("Back Rfid 요청이들어왓어!~");
////		getRequestApiGet("http://172.30.1.49:8082/soleOFF");
//	}
//	
//	/* GET방식 요청 보내기 */
//	/* 라즈베리파이 솔레노이드 제어할 때 쓰임 */
//	public String getRequestApiGet(String url) throws IOException, NoRouteToHostException, ConnectException, Exception
//	{
//		 URL obj = new URL(url);
//		    HttpURLConnection con = (HttpURLConnection) obj.openConnection();
//
//		    // optional default is GET
//		    con.setRequestMethod("GET");
//
//		    //add request header 헤더를 만들어주는것.
//		    con.setRequestProperty("Accept-Charset", "UTF-8");
//		    con.setRequestProperty("Content-Type", "text/plain; charset=utf-8");
////		    System.out.println("\nSending 'GET' request to URL : " + apiUrl);
//
//		    BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
//		    String inputLine;
//		    String resultXmlText = "";
//		    while ((inputLine = in.readLine()) != null) {
//		    	resultXmlText += inputLine;
//		    }
//		    in.close();
//		    con.disconnect();
//		    return resultXmlText;
//	}
	
}


