package kr.smhrd.myapp;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kr.smhrd.service.PayService;

@Controller
public class PayController {
	

	@Autowired
	private PayService service;
	
	@RequestMapping("/success")
	public String success(@RequestParam(value="customerKey") String customerKey, @RequestParam(value="authKey") String authKey) {
		service.success(customerKey, authKey);
		return "success";
	}
	
	// 파라미터 4개 (billingKey, customereKey, amount, orderId), 테스트용 [수정할 예정 : 반납 절차와 통합]
	@RequestMapping("/auto")
	public String auto() {
		//service.auto();
		return "auto";
	}
}
