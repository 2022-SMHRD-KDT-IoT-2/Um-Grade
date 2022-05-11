package kr.smhrd.service;

import java.net.http.HttpResponse;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.smhrd.mapper.UserMapper;

@Service
public class PayService {

	@Autowired
	private JsonService jService;
	
	@Autowired
	private UserMapper uMapper;
	
	public void success(String customerKey, String authKey) {
		HttpResponse<String> response = jService.success(customerKey, authKey);
		Map<String, String> map = jService.mapJson(response.body());
		HashMap<String, String> bk = new HashMap<>();
		bk.put("customer_key", customerKey);
		bk.put("billing_key", map.get("billingKey"));
		uMapper.updateUserBK(bk);
		System.out.println(map.get("billingKey"));
	}
	
	public void auto(String user_id, int amount, String order_id) {
		String bk = uMapper.selectUserBK(user_id);
		HttpResponse<String> response = jService.auto(bk, user_id, amount, order_id);
		Map<String, String> map = jService.mapJson(response.body());
		System.out.println(map.get("status"));
	}
	
}
