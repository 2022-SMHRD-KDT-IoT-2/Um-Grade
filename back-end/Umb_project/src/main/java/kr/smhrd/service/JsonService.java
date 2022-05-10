package kr.smhrd.service;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class JsonService {

	public Map mapJson(String json) {
		ObjectMapper omapper = new ObjectMapper();
		Map<String, String> map = null;
		try {
			map = omapper.readValue(json, Map.class);
			} catch (IOException e) {
				e.printStackTrace();
				}
		return map;
	}
	
	public HttpResponse<String> success(String customerKey, String authKey){
		HttpRequest request = HttpRequest.newBuilder()
			    .uri(URI.create("https://api.tosspayments.com/v1/billing/authorizations/"+authKey))
			    .header("Authorization", "Basic dGVzdF9za19LbWE2MFJaYmxycVkwMkRwZzF6cnd6WVdCbjE0Og==")
			    .header("Content-Type", "application/json")
			    .method("POST", HttpRequest.BodyPublishers.ofString("{\"customerKey\":\""+customerKey+"\"}"))
			    .build();
			HttpResponse<String> response = null;
			try {
				response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
				System.out.println(response.body());
			} catch (IOException e) {
				e.printStackTrace();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			return response;
	}
	
	public HttpResponse<String> auto(String billingKey, String customerKey, int amount, String orderId){
		HttpRequest request = HttpRequest.newBuilder()
			    .uri(URI.create("https://api.tosspayments.com/v1/billing/"+billingKey))
			    .header("Authorization", "Basic dGVzdF9za19LbWE2MFJaYmxycVkwMkRwZzF6cnd6WVdCbjE0Og==")
			    .header("Content-Type", "application/json")
			    .method("POST", HttpRequest.BodyPublishers.ofString("{\"amount\":\""+amount+"\",\"customerKey\":\""+customerKey+"\",\"orderId\":\""+orderId+"\"}"))
			    .build();
			HttpResponse<String> response = null;
			try {
				response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
			} catch (IOException e) {
				e.printStackTrace();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			return response;
	}
}
