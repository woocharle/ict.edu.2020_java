package com.ict.edu04;

import java.io.File;
import java.io.FileReader;

public class Ex03 {
	public static void main(String[] args) {
		String filepath = "C:"+ File.separator + "study" + File.separator + "util" + File.separator + "io06.txt";
		File file = new File(filepath);
		
		FileReader fr = null;
		
		try {
			fr = new FileReader(file);
			
			// �� ���� �б�.
			//int k = fr.read();
			//System.out.println(k + ":" + (char)k);
			
			/*��ü �б�
			int k = 0;
			while((k=fr.read()) != -1) {
				System.out.println((char)k);
			}*/
			
			//char[] for���� String
 			char[] c = new char[(int)file.length()];
			fr.read(c);
			String str = new String(c);
			System.out.println(str);
			
			/*
			for(char k : c) {
				System.out.println(k);
			}*/
			
			
			
			
			
		} catch (Exception e) {
			try {
				fr.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
	}
}
