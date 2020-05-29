package com.ict.edu01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.net.URL;
import java.net.URLConnection;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;


public class Ex06 {
	public static void main(String[] args) {
		BufferedReader br = null; 
		String filepath = "c:" + File.separator + "study" + File.separator + "util" + 
				File.separator + "01_java"  + File.separator + "99_Practice_Network" + File.separator + "도서관.txt";
		File file = new File(filepath);
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		//
		
		try {
			URL url = new URL("http://openapi.seoul.go.kr:8088/sample/json/SeoulLibraryTime/1/5/");
			URLConnection urlc = url.openConnection();
			br = new BufferedReader(new InputStreamReader(urlc.getInputStream()));
			
			String msg = null;
			StringBuffer sb = new StringBuffer();
			while((msg = br.readLine()) != null) {
				sb.append(msg+"\n");
			}
			System.out.println("===================================================");
		
			//JSON부르기
		
			JSONParser parser = new JSONParser();
			JSONObject obj1 = (JSONObject) parser.parse(sb.toString());
			JSONObject obj2 = (JSONObject) obj1.get("SeoulLibraryTime");
			JSONArray j_arr = (JSONArray) obj2.get("row");
			
			StringBuffer sb2 = new StringBuffer();
			/* 전체보기
			for (Object k : j_arr) {
				//System.out.println(k);
				sb2.append(k + "\n");
			}
			*/
			
			// 나눠서 보기
			
			for (Object k : j_arr) {
				JSONObject obj3 = (JSONObject) k;
				String name = (String) obj3.get("LBRRY_NAME");
				String phone = (String) obj3.get("TEL_NO"); 
				String addr = (String) obj3.get("ADRES"); 
				System.out.print(name + "\t" + phone + "\t" + addr + "\n");
				
			}
			
			System.out.println("======================================================================");
			
			for (int i = 0; i < j_arr.size(); i++) {
				JSONObject obj3 = (JSONObject) j_arr.get(i);
				String name = (String) obj3.get("LBRRY_NAME");
				String phone = (String) obj3.get("TEL_NO"); 
				String addr = (String) obj3.get("ADRES"); 
				
				sb2.append(name + "\t" + phone + "\t" + addr + "\n");
				System.out.print(name + "\t" + phone + "\t" + addr + "\n");
				
			}
			
			
			// 파일로 저장하기
			fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			
			bw.write(sb2.toString());
			bw.flush();
			//System.out.println(document.toString());

		} catch (Exception e) {
			
			
		} finally {
			try {
				bw.close();
				fw.close();
				br.close();
				
			} catch (Exception e2) {
				
			}
		}
	}
	
	
}
