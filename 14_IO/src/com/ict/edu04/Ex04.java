package com.ict.edu04;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Ex04 {
	public static void main(String[] args) {
		String filepath = "C:"+ File.separator + "study" + File.separator + "util" + File.separator + "io07.txt";
		File file = new File(filepath);
		
		FileReader fr = null;
		BufferedReader br = null;
		StringBuffer sb = new StringBuffer();
		
		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			
			/*한줄 읽기
			String msg = br.readLine();
			System.out.println(msg); */
			
			//모두 읽기
			String str = null;
			String msg = null;
			while((msg = br.readLine()) != null) {
				//str = (str.concat(msg)).concat("\n");
				sb.append(msg + "\n");
				
			}
			System.out.println(sb.toString());
			
		} catch (Exception e) {
			
		} finally {
			try {
				br.close();
				fr.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
