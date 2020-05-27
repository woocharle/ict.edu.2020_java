package com.ict.edu04;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Ex05 {
	public static void main(String[] args) {
		String filepath = "C:"+ File.separator + "study" + File.separator + "util" + File.separator + "io08.txt";
		File file = new File(filepath);
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		PrintWriter pw = null;
		
		
		try {
			fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			pw = new PrintWriter(bw);
			
			pw.println("PrintWriter를 가지고 연습을 한다.");
			pw.println(true);
			pw.println(12345);
			pw.println(3.14);
			pw.println('c');
			pw.flush();
			
			
		} catch (Exception e) {
			
		} finally {
			try {
				pw.close();
				bw.close();
				fw.close();
			} catch (Exception e2) {
				
			}
		}
		
		
	}
}
