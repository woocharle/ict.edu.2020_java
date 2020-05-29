package com.ict.edu08;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Output {
	public static void main(String[] args) {
		String pathname = "C:" + File.separator + "study" + File.separator + "util" + File.separator + "io11.txt";
		File file = new File(pathname);
		
		System.out.println("5명의 이름과 성적을 입력하시오.");
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		ObjectOutputStream oos = null;
		
		InputStreamReader isr = null;
		BufferedReader br = null;


		try {
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);
			oos = new ObjectOutputStream(bos);
			
			isr = new InputStreamReader(System.in);
			br = new BufferedReader(isr);

			
			ArrayList<VO1> list = new ArrayList<VO1>();
			
			for (int i = 0; i < 5; i++) {
				System.out.print("이름: ");
				String name = br.readLine();
				System.out.print("국어: ");
				int kor = Integer.parseInt(br.readLine());
				System.out.print("영어: ");
				int eng = Integer.parseInt(br.readLine());
				System.out.print("수학: ");
				int mat = Integer.parseInt(br.readLine());
			
				list.add(new VO1(name, kor, eng, mat));
		
			}
			
			for(VO1 k : list) {
				for(VO1 l : list) {
					if(k.getSum() < l.getSum()) {
						k.r_rank();
					}
				}
			}
			
			VO1[] list2 = list.toArray(new VO1[list.size()]);
			VO1 tmp = new VO1(); 
			
			for (int i = 0; i < list2.length; i++) {
				for (int j = 0; j < list2.length; j++) {
					if(list2[i].getSum() > list2[j].getSum()) {
						tmp = list2[i];
						list2[i] = list2[j];
						list2[j] = tmp;		
					}
				}
			}
			list.clear();
			
			for (int i = 0; i < list2.length; i++) {
				list.add(list2[i]);
			}
			
			
			oos.writeObject(list);
			oos.flush();
			
		} catch (Exception e) {
			
		} finally {
			try {
				br.close();
				isr.close();
				oos.close();
				bos.close();
				fos.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
	}

}
