package com.ict.edu01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class Ex02 {
	public static void main(String[] args) {
		// 해당사이트 가서 정보 읽기 
		InputStream is = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		
	
		// 내컴퓨터에 정보 저장.
		String filepath = "c:" + File.separator + "study" + File.separator + "util" + 
							File.separator + "01_java"  + File.separator + "99_Practice_Network" + File.separator + "data1.txt";
		
		File file = new File(filepath); 
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		
		try {
			URL url = new URL("http://www.naver.com");
			System.out.println("프로토콜: " + url.getProtocol());
			System.out.println("포트: " + url.getPort());
			System.out.println("Path: " + url.getPath());
			System.out.println("호스트: " + url.getHost());
			System.out.println("안내: " + url.getUserInfo());
			System.out.println("====================================================");
			
			is = url.openStream();
			isr = new InputStreamReader(is);
			br = new BufferedReader(isr);
			
			String msg = null;
			StringBuffer sb = new StringBuffer();
			while((msg = br.readLine()) != null) {
				//System.out.println(msg);
				sb.append(msg + "\n");
				
			}
			
			fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			bw.write(sb.toString());
			bw.flush();
			
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bw.close();
				fw.close();
				br.close();
				isr.close();
				is.close();
			} catch (Exception e2) {
			}
		
		}
	}
}
