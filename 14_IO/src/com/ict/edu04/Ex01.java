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
			
			fw.write("�̽���Ʈ��\n");
			fw.write("1��: �ӿ���\n");
			fw.write("2��: ��Ź\n");
			fw.write("3��: ������\n");
			fw.write("4��: ��ȣ��\n");
			fw.write("5��: ������\n");
			fw.write("6��: ���ȣ\n");
			fw.write("7��: ������\n");
			
			
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
