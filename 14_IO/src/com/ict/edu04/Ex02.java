package com.ict.edu04;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class Ex02 {
	public static void main(String[] args) {
		String filepath = "C:"+ File.separator + "study" + File.separator + "util" + File.separator + "io07.txt";
		File file = new File(filepath);
		
		FileWriter fw = null; 
		BufferedWriter bw = null;
			
		try {
			fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			
			bw.write(97);
			bw.write('e');
			
			char[] c = {'j', 'a', 'v', 'a', 13};
			bw.write(c);
			
			bw.write("미스터트롯");
			bw.newLine();
			bw.write("1위: 임영웅");
			bw.write(", 2위: 영탁");
			bw.write(", 3위: 이찬원");
			bw.newLine();
			bw.write("4위: 김호중");
			bw.write(", 5위: 정동원 ");
			bw.write(", 6위: 장민호");
			bw.write(", 7위: 김희재");
			
			
			bw.flush();
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				bw.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
		
	}
}
