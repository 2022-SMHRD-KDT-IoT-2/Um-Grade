package kr.smhrd.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.NoRouteToHostException;
import java.net.URL;

import org.springframework.stereotype.Service;

@Service
public class RaspService {

	public String getRequestApiGet(String url) throws IOException, NoRouteToHostException, ConnectException, Exception
	{
		 URL obj = new URL(url);
		    HttpURLConnection con = (HttpURLConnection) obj.openConnection();

		    // optional default is GET
		    con.setRequestMethod("GET");

		    //add request header 헤더를 만들어주는것.
		    con.setRequestProperty("Accept-Charset", "UTF-8");
		    con.setRequestProperty("Content-Type", "text/plain; charset=utf-8");

		    BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
		    String inputLine;
		    String resultXmlText = "";
		    while ((inputLine = in.readLine()) != null) {
		    	resultXmlText += inputLine;
		    }
		    in.close();
		    con.disconnect();
		    return resultXmlText;
	}
}
