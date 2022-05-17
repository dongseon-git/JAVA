package com.pcwk.ex07.naverapi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

public class NaverSearchEx01 {

	public static void main(String[] args) {
		String clientId = "ir4MAB9B8edDggUbtNxG";// 클라이언트 아이디
		String clientSecret = "96q0U8OLJw";// 클라이언트 시크릿
		if (args.length != 1) {// param이 없으면 종료
			System.out.println("파라메터를 입력하세요.");
			System.exit(0);
		}
		String text = args[0]; // 검색어
		BufferedReader br = null;

		try {
			text = URLEncoder.encode(text, "UTF-8");

			System.out.println("text:" + text);
			//blog:json
			//String apiURL = "https://openapi.naver.com/v1/search/blog?query=" + text;			
			//news
			//String apiURL = "https://openapi.naver.com/v1/search/news.json?query="+text;
			//책:json
			String apiURL = "https://openapi.naver.com/v1/search/book.json?query="+text;
			//책:xml
			//String apiURL = "https://openapi.naver.com/v1/search/book.xml?query="+text;
			System.out.println("apiURL:" + apiURL);

			URL url = new URL(apiURL);
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			con.setRequestMethod("GET");// get방식으로 접근
			con.setRequestProperty("X-Naver-Client-Id", clientId);
			con.setRequestProperty("X-Naver-Client-Secret", clientSecret);
             
			//200 : 성공
			//401: 인증 실패
			int responseCode = con.getResponseCode();
			System.out.println("responseCode:"+responseCode);
		    
			if(200==responseCode) {//성공
				//byte 스트림을 char 스트림으로 연결->BufferedReader
				br = new BufferedReader( new InputStreamReader(con.getInputStream()));
				//가지고 온 데이터 출력
				String line = "";
				while((line = br.readLine()) !=null) {
				  System.out.println(line);
				}
			}else {
			 System.out.println("클라이언트 아이디, 클라이언트 시크릿을 확인하세요.");
			  return;
			}
			
		} catch (IOException e) {
			System.out.println("==================");
			System.out.println("=IOException=" + e.getMessage());
			System.out.println("==================");
			e.printStackTrace();

		} finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();

			}
		}
	}
}
