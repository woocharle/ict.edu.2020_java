package com.ict.edu03;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ex01 {
	public static void main(String[] args) {
		String filepath = "C:"+ File.separator + "study" + File.separator + "util" + File.separator + "io04.txt";
		File file1 = new File(filepath);
	
		FileOutputStream fos = null;
		DataOutputStream dos = null;
		
		FileInputStream fis = null;
		DataInputStream dis = null;
		
		try {
			fos = new FileOutputStream(file1);
			dos = new DataOutputStream(fos);
			
			fis = new FileInputStream(file1);
			dis = new DataInputStream(fis);
				
			// 쓰기 :  writeXXX() : XXX 는 기본 자료형를 말한다.
			dos.writeByte(126);
			dos.writeShort(5422);
			dos.writeInt(124);
			dos.writeLong(123L);
			dos.writeFloat(34.14f);
			dos.writeDouble(57.1);
			dos.writeBoolean(true);
			dos.writeChar('c');
			
			dos.flush();
			
			// 읽기 : readXXX : XXX 는 기본 자료형을 말한다.
			System.out.println(dis.readByte());
			System.out.println(dis.readShort());
			System.out.println(dis.readInt());
			System.out.println(dis.readLong());
			System.out.println(dis.readFloat());
			System.out.println(dis.readDouble());
			System.out.println(dis.readBoolean());
			System.out.println(dis.readChar());

		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				if(dos != null) dos.close();
				if(fos != null) fos.close();
				if(dis != null) dis.close();
				if(fis != null) fis.close();
				
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
		
		
	}
}
