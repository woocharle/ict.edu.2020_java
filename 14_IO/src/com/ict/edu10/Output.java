package com.ict.edu10;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Output {
	public static void main(String[] args) {
		String pathname = "C:" + File.separator + "study" + File.separator + "util" + File.separator + "io13.txt";
		File file = new File(pathname);
		
		System.out.println("�̸��� ������ �Է��Ͻÿ�.");
		
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

			
			ArrayList<VO> list = new ArrayList<VO>();
			
			
			loop1: while (true) {
						System.out.print("�̸�: ");
						String name = br.readLine();
						System.out.print("����: ");
						int kor = Integer.parseInt(br.readLine());
						System.out.print("����: ");
						int eng = Integer.parseInt(br.readLine());
						System.out.print("����: ");
						int mat = Integer.parseInt(br.readLine());
					
						VO vo = new VO(name, kor, eng, mat);
						list.add(vo);
						
						
						loop2: while(true) {
									System.out.println("����Ͻðڽ��ϱ�? (y/n)");
									String de = br.readLine();
									if(de.equalsIgnoreCase("y")) {
										continue loop1;
										
									} else if(de.equalsIgnoreCase("n")) {
										break loop1;
										
									} else {
										System.out.println("�߸� �Է��ϼ̽��ϴ�. y�� n�� �ϳ��� �Է��Ͻÿ�.");
										continue loop2;
									}
									
								}
		
					}
			
			for(VO k : list) {
				for(VO l : list) {
					if(k.getSum() < l.getSum()) {
						k.r_rank();
					}
				}
			}
			
			VO[] list2 = list.toArray(new VO[list.size()]);
			VO tmp = new VO(); 
			
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
			System.out.println(e);
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
