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
		//코드변경
		BufferedReader br = null;
		
		try {
			URL url = new URL("https://www.naver.com");
			URLConnection conn = url.openConnection();
			
			//isr = new InputStreamReader(conn.getInputStream());
			br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			
			System.out.println("ÀÎÄÚµù: " + conn.getContentEncoding());
			System.out.println("±æÀÌ: " + conn.getContentLength());
			System.out.println("¹®¼­Å¸ÀÔ: " + conn.getContentType());
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
