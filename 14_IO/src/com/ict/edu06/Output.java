package com.ict.edu06;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

// ObjectOutmputStream: 객체 출력 시스템, 바이트 스트림
// writeObject() => 직렬화메소드
// Datastream이나 Object를 이용하면 메모장에서 잘 안 보임.

public class Output {
	public static void main(String[] args) {
		String filepath = "C:"+ File.separator + "study" + File.separator + "util" + File.separator + "io09.txt";
		File file = new File(filepath);
	
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		ObjectOutputStream oos =null;
		
		try {
			fos = new  FileOutputStream(file);
			bos = new BufferedOutputStream(fos);
			oos = new ObjectOutputStream(bos);
			
			VO vo = new VO("고길동", 34, 70.4, true);	
			
			oos.writeObject(vo);
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
