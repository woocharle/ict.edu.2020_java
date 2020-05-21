package com.ict.edu;

import java.util.HashSet;

public class Ex06 {
	public static void main(String[] args) {
		// �÷����� �迭�� ���� => toArray() 
		// �迭�� �÷����� ����
		
		String[] str = {"java", "JAVA", "Java", "�ڹ�"};
		
		HashSet<String> set1 = new HashSet<String>();
		HashSet<String> set2 = new HashSet<String>();
		HashSet<String> set3 = new HashSet<String>();
		

		
		for (String k : str) {
			set1.add(k);
		}
		System.out.println(set1);
		System.out.println("===================================================");
		
		set2.addAll(set1);
		
		set1.add("HTML");
		set1.add("CSS");
		
		System.out.println(set1);
		System.out.println(set2);
		System.out.println("===================================================");
		
		// set2���� "�ڹ�" ����
		
		set2.remove("�ڹ�");
		
		set2.add("jsp");
		set2.add("android");
		set2.add("Python");
		
		System.out.println(set1);
		System.out.println(set2);
		System.out.println("===================================================");
		
		//�ߺ��˻�
		// set2�� ������ set1�� �߰��Ѵ�.
		
		for(String k : set2) {
			if(! set1.add(k)) {
				set3.add(k);
				System.out.println(k + " �ߺ�");
			}
			
		}
		
		System.out.println(set1);
		System.out.println(set2);
		System.out.println(set3);
		
		
	}

}
