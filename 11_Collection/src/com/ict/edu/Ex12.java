package com.ict.edu;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Ex12 {
	public static void main(String[] args) {
		// ���ѹα�, ĳ����, ����, �������� ������ ���� 
		
		HashMap<String, String> cap = new HashMap<String, String>();
		
		cap.put("���ѹα�", "����");
		cap.put("�ѱ�", "����");
		cap.put("korea", "����");
		cap.put("ĳ����", "��Ÿ��");
		cap.put("����", "����");
		cap.put("������", "����");
		
		Set<String> set = cap.keySet();
		
		Scanner sc = new Scanner(System.in);
	
		
		while(true) {
			System.out.print("���� �Է�: ");
			String str = sc.next();
			str = str.toLowerCase();
			
			if(set.contains(str)) {
				System.out.println(str + "�� ������ " + cap.get(str));
			}
			else {
				System.out.println("�����Ͱ� �����ϴ�.");
				
			}
			System.out.print("����ұ�� (y/n)"  );
			String msg = sc.next();
			if(msg.equalsIgnoreCase("n")) break;

		}
	
	}
}
