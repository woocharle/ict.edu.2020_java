package com.ict.edu08;

import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Input {
	public static void main(String[] args) {
		String pathname = "C:" + File.separator + "study" + File.separator + "util" + File.separator + "io11.txt";
		String pathname2 = "C:" + File.separator + "study" + File.separator + "util" + File.separator + "io11.txt";
		File file = new File(pathname);
		File file2 = new File(pathname2);
		
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		ObjectInputStream ois = null;
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			ois = new ObjectInputStream(bis);
			fw = new FileWriter(file2);
			bw = new BufferedWriter(fw);
			
			ArrayList<VO1> list = (ArrayList<VO1>) ois.readObject();
			
			for(VO1 k : list) {
				System.out.print("이름: " + k.getName() + " ");
				System.out.print("총점: " + k.getSum() + " ");
				System.out.print("평균: " + k.getAvg() + " ");
				System.out.print("성적: " + k.getGrd() + " ");
				System.out.println("순위: " + k.getRank());
				
				bw.write("이름: " + k.getName() + " ");
				bw.write("총점: " + k.getSum() + " ");
				bw.write("평균: " + k.getAvg() + " ");
				bw.write("성적: " + k.getGrd() + " ");
				bw.write("순위: " + k.getRank() + "\n");
				
			}
			
			bw.flush();
			
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				bw.close();
				fw.close();
				ois.close();
				bis.close();
				fis.close();
				
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
		
	}
}
