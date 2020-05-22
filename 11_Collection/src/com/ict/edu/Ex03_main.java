package com.ict.edu;

import java.util.HashSet;
import java.util.Iterator;

public class Ex03_main {
	public static void main(String[] args) {
		// �� �Է� �� ���� ��� 
		// 1.�⺻������ ����� setter
		Ex03 p1 = new Ex03();
		p1.setName("�Ѹ�");
		p1.setAge(5000);
		p1.setWeight(80.0);
		
		Ex03 p2 = new Ex03("��浿", 50, 60.0);
		Ex03 p3 = new Ex03("������", 20, 56.3);
		
	
		// ��ü �����ϴ� ���: �迭, �÷���
		// �迭 
		Ex03[] arr = new Ex03[3];
		arr[0] = p1;
		arr[1] = p2;
		arr[2] = p3;
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].getName());
		}
		System.out.println();
		System.out.println("=============================================");
		
		//�÷��� �̿�
		HashSet<Ex03> h1 = new HashSet<Ex03>();
		h1.add(p1);
		h1.add(p2);
		h1.add(p3);
		h1.add(new Ex03("������", 4994, 75.5));
		h1.add(new Ex03("�����", 1000, 49.5));
		
		for(Ex03 k : h1) {
			System.out.println(k.getName());
		}
		
		System.out.println("=============================================");
		
		Iterator<Ex03> it1 = h1.iterator();
		while(it1.hasNext()) {
			Ex03 res = (Ex03)it1.next();
			System.out.println("�̸�: " + res.getName() + "\t����: " + res.getAge() + "\t������: " + res.getWeight());
		}
		System.out.println();
		
		
		// ũ�� ���ϱ�. (�÷��� �̸�).size();
		System.out.println("h1�� ũ��(������) " + h1.size());
		
		//���Կ���: contains
		
		// �̸� �������� ��ü�� �ִ��� Ȯ�� �ϰ� ���� �ּ���.
		System.out.println("=============================================");
		for(Ex03 k : h1) {
			if(k.getName().contains("������")) {
				h1.remove(k);
				System.out.println("������ �ִ�.");
				break;
			}
		}
			
		for(Ex03 k : h1) {
			System.out.println(k.getName());
		}
		
		
		System.out.println("h1�� ũ��(������) " + h1.size());
		
		
		// ��� ����: (�÷��� �̸�).clear() // ����ִ��� Ȯ��: (�÷��� �̸�).isEmpty()
		
		h1.clear();
		System.out.println("h1�� ũ��(clear��) " + h1.size());
		
		if(h1.isEmpty()) {
			System.out.println("�� �����.");
		}
		
		Ex03[] arr1 =  h1.toArray(new Ex03[3]);
		
	}
	
}
