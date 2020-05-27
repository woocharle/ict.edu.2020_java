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
			
			bw.write("�̽���Ʈ��");
			bw.newLine();
			bw.write("1��: �ӿ���");
			bw.write(", 2��: ��Ź");
			bw.write(", 3��: ������");
			bw.newLine();
			bw.write("4��: ��ȣ��");
			bw.write(", 5��: ������ ");
			bw.write(", 6��: ���ȣ");
			bw.write(", 7��: ������");
			
			
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
