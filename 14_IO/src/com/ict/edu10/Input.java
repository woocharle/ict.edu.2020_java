package com.ict.edu10;

import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Input {
	public static void main(String[] args) {
		String pathname = "C:" + File.separator + "study" + File.separator + "util" + File.separator + "io13.txt";
		String pathname2 = "C:" + File.separator + "study" + File.separator + "util" + File.separator + "io14.txt";
		
		File file = new File(pathname);
		File file2 = new File(pathname2);
		
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		ObjectInputStream ois = null;
	
		//FileWriter fw = null;
		//BufferedWriter bw = null;
		
		try {
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			ois = new ObjectInputStream(bis);
			//fw = new FileWriter(file2);
			//bw = new BufferedWriter(fw);
			
			ArrayList<VO> list = (ArrayList<VO>) ois.readObject();
			
			for(VO k : list) {
				System.out.print("이름: " + k.getName() + " ");
				System.out.print("합계: " + k.getSum() + " ");
				System.out.print("평균: " + k.getAvg() + " ");
				System.out.print("성적: " + k.getGrd() + " ");
				System.out.println("순위: " + k.getRank());
				
				//bw.write("�̸�: " + k.getName() + " ");
				//bw.write("����: " + k.getSum() + " ");
				//bw.write("���: " + k.getAvg() + " ");
				//bw.write("����: " + k.getGrd() + " ");
				//bw.write("����: " + k.getRank() + "\n");
				
			}
			
			//bw.flush();
			
			
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				//bw.close();
				//fw.close();
				ois.close();
				bis.close();
				fis.close();
				
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
		
	}
}
