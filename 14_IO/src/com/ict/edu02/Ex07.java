package com.ict.edu02;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

public class Ex07 {
	public static void main(String[] args) {
		String pathname = "c:" + File.separator + "study" + File.separator + "util" 
				  + File.separator + "io03.txt";
		
		File file = new File(pathname);
		
		FileOutputStream fos = null;
		
		//�ӵ������ ���� Buffer�� ���.
		BufferedOutputStream bos = null;
		try {
			// Stream chain
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);
			
			// �ϳ��� �� �ִ�.
			bos.write(105);
			bos.write('c');
			bos.write('t');
			
			byte[] b = {' ', 'e', 'd', 'u', 13};
			bos.write(b);
			
			String msg = "hellow world";
			b = msg.getBytes();
			bos.write(b);
			
			bos.flush();
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				if(bos != null) bos.close();
				if(fos != null) fos.close();
				
			} catch (Exception e2) {
				
			}
		}
		
		
		
	}
}
