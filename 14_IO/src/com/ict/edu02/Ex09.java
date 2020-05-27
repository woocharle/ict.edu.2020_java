package com.ict.edu02;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex09 {
	public static void main(String[] args) {
		String filepath = "C:"+ File.separator + "study" + File.separator + "util" + File.separator + "video2.mp4";
		File file1 = new File(filepath);
		
		String filepath2 = "C:"+ File.separator + "study" + File.separator + "video_2.mp4";
		File file2 = new File(filepath2);
		
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
	
		try {
			fis = new FileInputStream(file1);
			bis = new BufferedInputStream(fis);
			fos = new FileOutputStream(file2);
			bos = new BufferedOutputStream(fos);
			
			int k = 0;
			while((k = bis.read()) != -1) {
				bos.write(k);
			}
			
			bos.flush();
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			e.printStackTrace();
			
		} finally {
				try {
					if(bis != null) bis.close();
					if(fis != null) fis.close();
					if(bis != null) bis.close();
					if(bis != null) bis.close();
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
		}
		
	}

}
