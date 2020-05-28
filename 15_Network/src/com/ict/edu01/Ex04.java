package com.ict.edu01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class Ex04 {
	public static void main(String[] args) {
		//�씤�꽣�꽬�떎�뻾
		BufferedReader br = null; 
		
		
		try {
			URL url = new URL("http://www.kma.go.kr/XML/weather/sfc_web_map.xml");
			URLConnection urlc = url.openConnection();
			
			br = new BufferedReader(new InputStreamReader(urlc.getInputStream()));
			String msg = null;
			while((msg = br.readLine()) != null) {
				System.out.println(msg);
			}
			
			
		} catch (Exception e) {
			
			
		} finally {
			try {
				br.close();
				
			} catch (Exception e2) {
				
			}
		}
	}
}
