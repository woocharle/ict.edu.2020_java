package com.ict.edu02;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashSet;

public class Ex03 {
	public static void main(String[] args) {
		String pathname = "c:" + File.separator + "study" + File.separator + "util" 
				  + File.separator + "io01.txt";
		
		File file = new File(pathname);
		
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream(file);
			// �� ���� �о����: read()
			//int k = fis.read();
			//System.out.println(k + " : " + (char)k);
			
			/* �� ���ھ� ��� �д� ��� : �׸�, �Ҹ�, �������� �а� ���� ���.
			   * �񿵾���� ���� �� ����. 
			int k2 = 0;
			while(true) {
				k2 = fis.read();
				if(k2 == -1) break;
				if(k2 == 13 || k2 == 10) {
					System.out.println();
				} else {
					System.out.print(k2 + ":" + (char)k2 + "  ");
				}
				
			}
			
			���� �ִ� ���� ���̴� ���
			int k = 0;
			while ((k = fis.read()) != -1) {
				System.out.print(k + ":" + (char)k + "  ");
			}
			
			
			//�迭�� �д� ���
			byte[] b = new byte[(int) file.length() + 1];
			fis.read(b);
			for(byte k : b) {
				System.out.print((char)k + " ");
			}
			*/
			
			//String�� �̿�: �񿵾�� ���.
			byte[] b = new byte[(int) file.length() + 1];
			fis.read(b);
			String str = new String(b);
			System.out.println(str);
			
			
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			e.printStackTrace();
			
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
		
		

	}
}
