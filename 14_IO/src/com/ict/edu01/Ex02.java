package com.ict.edu01;

import java.io.File;
import java.io.IOException;

public class Ex02 {
	public static void main(String[] args) {
		String pathName1 = "c:" + File.separator + "study" + File.separator+ "util"+ File.separator+ "test.txt";
		File file = new File(pathName1);
		try {
			boolean res = file.createNewFile();
			
			if(res) {
				System.out.println("���� ���� ����");
			}
			else {
				System.out.println("���� ���� ����");
			}
			
		} catch (IOException e) {
			System.out.println("���� ���� ����");
			System.out.println("���ϰ�ΰ� Ʋ�Ƚ��ϴ�.");
		}
		
		System.out.println();
		System.out.println("���� �����");
		
		String pathName2 = "c:" + File.separator + "study" + File.separator+ "util"+ File.separator+ "test";
		File file2 = new File(pathName2);
		
		boolean res2 = file2.mkdir();
		if (res2) {
			System.out.println("���� ���� ����");
		} 
		else {
			// ��ΰ� Ʋ���ų� ���� ���丮�� ������, ����.
			System.out.println("���� ���� ����");
		}
		
		System.out.println();
		System.out.println("����");
		
		
		String pathName3 = "c:" + File.separator + "study" + File.separator+ "util"+ File.separator+ "test.txt";
		File file3 = new File(pathName3);
	
		boolean res3 = file3.delete();
		if (res3) {
			System.out.println("���� ���� ����");
		} 
		else {
			// ��ΰ� Ʋ���ų� ���� ���丮�� ������, ����.
			System.out.println("���� ���� ����");
		}
			
		String pathName4 = "c:" + File.separator + "study" + File.separator+ "util"+ File.separator+ "test";
		File file4 = new File(pathName4);
	
		boolean res4 = file4.delete();
		if (res4) {
			System.out.println("���� ���� ����");
		} 
		else {
			// ��ΰ� Ʋ���ų� ���� ���丮�� ������, ����.
			System.out.println("���� ���� ����");
		}
		
		
	}
}
