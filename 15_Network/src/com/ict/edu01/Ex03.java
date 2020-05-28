package com.ict.edu01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

public class Ex03 {
	public static void main(String[] args) {
		//InputStreamReader isr = null;
		BufferedReader br = null;
		
		try {
			URL url = new URL("https://www.naver.com");
			URLConnection conn = url.openConnection();
			
			//isr = new InputStreamReader(conn.getInputStream());
			br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			
			System.out.println("인코딩: " + conn.getContentEncoding());
			System.out.println("길이: " + conn.getContentLength());
			System.out.println("문서타입: " + conn.getContentType());
			System.out.println("===================================================================");
			
			
			Map<String, List<String>> list = conn.getHeaderFields();
			for(String k : list.keySet()) {
				System.out.println(k + " : " + list.get(k));
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				br.close();
				//isr.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
