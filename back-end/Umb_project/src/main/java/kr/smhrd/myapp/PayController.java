package kr.smhrd.myapp;

import java.net.http.HttpResponse;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kr.smhrd.service.JsonService;
import kr.smhrd.service.UserService;

@Controller
public class PayController {
	
	@Autowired
	private JsonService jService;
	
	@Autowired
	private UserService uService;
	
	@RequestMapping("/success")
	public String success(@RequestParam(value="customerKey") String customerKey, @RequestParam(value="authKey") String authKey) {
		HttpResponse<String> response = jService.success(customerKey, authKey);
		Map<String, String> map = jService.mapJson(response.body());
		HashMap<String, String> bk = new HashMap<>();
		bk.put("customer_key", customerKey);
		bk.put("billing_key", map.get("billingKey"));
		uService.updateUserBK(bk);
		System.out.println(map.get("billingKey"));
		
		return "success";
	}
	
	// 파라미터 4개 (billingKey, customereKey, amount, orderId), 테스트용 [수정할 예정 : 반납 절차와 통합]
	@RequestMapping("/auto")
	public String auto(@RequestParam(value="customerKey", defaultValue="noKey") String customerKey, @RequestParam(value="billingKey", defaultValue="noKey") String billingKey) {
		String bk = uService.selectUserBK("abc");
		HttpResponse<String> response = jService.auto(bk, "abc", 7000, "9991");
		Map<String, String> map = jService.mapJson(response.body());
		System.out.println(map.get("status"));
		return "auto";
	}
}
