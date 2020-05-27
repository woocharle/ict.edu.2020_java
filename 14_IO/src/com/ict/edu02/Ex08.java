package com.ict.edu02;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex08 {
	public static void main(String[] args) {
		String pathname = "c:" + File.separator + "study" + File.separator + "util" 
				  + File.separator + "io03.txt";
		
		File file = new File(pathname);
		FileInputStream fis = null;
		BufferedInputStream bis = null; 
		
		try {
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis); 
			
			//while ÀÌ¿כ
			/*
			int m = 0;
			while ((m = bis.read()) != -1) {
				System.out.println((char)m);
			}
			*/
			
			byte[] b = new byte[(int)file.length() + 1];
			bis.read(b);
			String str = new String(b);
			System.out.println(str);
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			e.printStackTrace();
			
		} finally {
			try {
				if(bis != null) bis.close();
				if(fis != null) fis.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
		
		
	}
}
