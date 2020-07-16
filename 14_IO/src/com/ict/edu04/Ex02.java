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
			
			// String : 줄바꾸기 메소드=> newLine()
			bw.write("korea");
			bw.newLine();
			bw.write("대한민국");
			bw.newLine();
			bw.write("大韓");
			bw.newLine();
			bw.write("12345");
			
			
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
