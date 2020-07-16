package com.ict.edu07;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public class Output {
	public static void main(String[] args) {
		String filepath = "c:"+ File.separator + "study" + File.separator + "util" + File.separator + "io10.txt";
		File file = new File(filepath);
	
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		ObjectOutputStream oos =null;
		
		try {
			fos = new  FileOutputStream(file);
			bos = new BufferedOutputStream(fos);
			oos = new ObjectOutputStream(bos);
				
			VO vo1 = new VO("고길동", 34, 70.4, true);
			VO vo2 = new VO("마이콜", 16, 56.4, false);
			VO vo3 = new VO("둘리", 14, 86.7, true);
			VO vo4 = new VO("희동이", 3, 74.1, true);
			VO vo5 = new VO("도우너", 47, 94.1, false);
					
			ArrayList<VO> list = new ArrayList<VO>();
			
			list.add(vo1);
			list.add(vo2);
			list.add(vo3);
			list.add(vo4);
			list.add(vo5);

			// 객체 직렬화
			oos.writeObject(list);
			oos.flush();
			
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				oos.close();
				bos.close();
				fos.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	
	
	}
}
