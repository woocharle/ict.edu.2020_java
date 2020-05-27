package com.ict.edu02;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// 그림, 사진, 동영상 등은 1byte씩처리

public class Ex06 {
	public static void main(String[] args) {
		//읽는 위치
		String filepath = "C:"+ File.separator + "study" + File.separator + "util" + File.separator + "video.mp4";
		File file1 = new File(filepath);
		
		String filepath2 = "C:"+ File.separator + "study" + File.separator + "video.mp4";
		File file2 = new File(filepath2);
		
		FileInputStream fis = null;
		FileOutputStream fos = null; 
 		
		try {
			fis = new FileInputStream(file1);
			fos = new FileOutputStream(file2);
			
			int k = 0;
			while((k = fis.read()) != -1) {
				fos.write(k);
			}
			
			fos.flush();
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(fis != null) fis.close();
				if(fos != null) fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
