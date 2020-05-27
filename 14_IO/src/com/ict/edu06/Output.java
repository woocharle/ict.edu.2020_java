package com.ict.edu06;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

// ObjectOutmputStream: ��ü ��� �ý���, ����Ʈ ��Ʈ��
// writeObject() => ����ȭ�޼ҵ�
// Datastream�̳� Object�� �̿��ϸ� �޸��忡�� �� �� ����.

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
			
			VO vo = new VO("��浿", 34, 70.4, true);	
			
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
