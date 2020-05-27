package com.ict.edu04;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileWriter;

public class Ex01 {
	public static void main(String[] args) {
		String filepath = "C:"+ File.separator + "study" + File.separator + "util" + File.separator + "io09.txt";
		File file = new File(filepath);
		
		FileWriter fw = null; 
			
		try {
			fw = new FileWriter(file);
			fw.write(44033);
			fw.write(97);
			fw.write('e');
			
			char[] c = {'j', 'a', 'v', 'a', 13};
			fw.write(c);
			
			fw.write("미스터트롯\n");
			fw.write("1위: 임영웅\n");
			fw.write("2위: 영탁\n");
			fw.write("3위: 이찬원\n");
			fw.write("4위: 김호중\n");
			fw.write("5위: 정동원\n");
			fw.write("6위: 장민호\n");
			fw.write("7위: 김희재\n");
			
			
			fw.flush();
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				fw.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
		
	}
}
