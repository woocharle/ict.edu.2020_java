package com.ict.edu02;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashSet;

public class Ex03 {
	public static void main(String[] args) {
		String pathname = "c:" + File.separator + "study" + File.separator + "util" 
				  + File.separator + "io01.txt";
		
		File file = new File(pathname);
		
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream(file);
			// 한 글자 읽어오기: read()
			//int k = fis.read();
			//System.out.println(k + " : " + (char)k);
			
			/* 한 글자씩 계속 읽는 방법 : 그림, 소리, 동영상을 읽고 쓰는 방법.
			   * 비영어권은 읽을 수 없다. 
			int k2 = 0;
			while(true) {
				k2 = fis.read();
				if(k2 == -1) break;
				if(k2 == 13 || k2 == 10) {
					System.out.println();
				} else {
					System.out.print(k2 + ":" + (char)k2 + "  ");
				}
				
			}
			
			위에 있는 것을 줄이는 방법
			int k = 0;
			while ((k = fis.read()) != -1) {
				System.out.print(k + ":" + (char)k + "  ");
			}
			
			
			//배열로 읽는 방법
			byte[] b = new byte[(int) file.length() + 1];
			fis.read(b);
			for(byte k : b) {
				System.out.print((char)k + " ");
			}
			*/
			
			//String을 이용: 비영어권 사용.
			byte[] b = new byte[(int) file.length() + 1];
			fis.read(b);
			String str = new String(b);
			System.out.println(str);
			
			
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			e.printStackTrace();
			
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
		
		

	}
}
