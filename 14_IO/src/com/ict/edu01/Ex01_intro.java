package com.ict.edu01;

import java.io.File;

/*
	File Ŭ����: Ư�� ��ġ�� �����ϴ� �����̳� ���丮(����)�� ó���ϴ� Ŭ����.
	�ֿ� ������: 
	 - File(String ���): �ش� ������ ���Ե� ������ ���� 
     - File(String �������, String �������): ��ο� ������ ����.
	 - File(File �������, String �������)
	�ֿ� �޼ҵ�:
	- createNewFile(): ���� �����ϸ� true,
	- mkdir(), mkdirs() : ���丮 ����
	- isDirectory() : ���丮�̸� true
	- isFile(): �����̸� true
	- list() : Ư��ġ�� ����, ���丮���� String[]�� ��� ���� ��.
	- length() : ������ ũ�⸦ byte�� ǥ��
	- getAbsolutePath(): ���� ��� ǥ��	
    - getCanonicalPath(): ����ȭ ��� ǥ��
    - getPath(): ����� ǥ��
 	
 	��Ʈ�� ������ com.ict.edu2����
 	
 	
 	
 	
 */


public class Ex01_intro {
	public static void main(String[] args) {
		// File Ŭ���� �����ڿ� �ֱ� ���ؼ� ���� �����.
		
		// String pathName = "C:\\study\\util";   OS�� window�� ��,
		// String pathName = "C:/study/util";      OS�� Linux, Unix�� ��
		// �ü���� ������� ����ϴ� ���
		String pathName = "c:" + File.separator + "study" + File.separator+ "util";
		File file = new File(pathName);
		String[] arr = file.list();
		for(String k : arr) {
			//System.out.println(k);
			File file2 = new File(pathName, k);
			//System.out.println(file2);
			
			if (file2.isDirectory()) {
				System.out.println("���丮: " + file2 + " ũ�Ⱑ �������� ����.");
			}
			else {
				System.out.println("����: " + file2 + ", ũ��: " + file2.length() + "byte");
			}
			
		}
		
		
		
		
		
	}

}
