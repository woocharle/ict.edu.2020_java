package com.ict.edu02;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex04 {
	public static void main(String[] args) {
		String pathname = "c:" + File.separator + "study" + File.separator + "util" 
				  + File.separator + "io02.txt";

		File file = new File(pathname);
		FileOutputStream fos = null;
		byte[] b;
		
		try {
			fos = new FileOutputStream(file);
			String str = "";
			str = str.concat("Phone: 010-9777-1111\n");
			str = str.concat("이름: 정우철\n");
			str = str.concat("나이: 33\n");
			
			b = str.getBytes();
			
			fos.write(b);
			
			fos.flush();
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			e.printStackTrace();
			
		} finally {
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
	}
}
