package com.ict.edu;

public class Ex11_main {
	public static void main(String[] args) {
		// ��ü ����
		Ex11 t1 = new Ex11("���ر�");
		
		System.out.println(t1.getName());
		System.out.println(t1.getAge());
		System.out.println(t1.getAddr());
		System.out.println("=============================================================");
		// t1�� �����͸� ��������.
		// �Ѹ�, 5000, ����
		// set�� �̿�
	
		t1.setName("�Ѹ�");
		t1.setAge(5000);
		t1.setAddr("����");
		
		System.out.println(t1.getName());
		System.out.println(t1.getAge());
		System.out.println(t1.getAddr());	
		System.out.println("=============================================================");
	
		// �����ڸ� �̿�
		Ex11 t2 = new Ex11();
		
		System.out.println(t2.getName());
		System.out.println(t2.getAge());
		System.out.println(t2.getAddr());	
		System.out.println("=============================================================");
	
		t2 = new Ex11("����", 47, "�԰浵");
		
		System.out.println(t2.getName());
		System.out.println(t2.getAge());
		System.out.println(t2.getAddr());	
		System.out.println("=============================================================");
		
		
	}
}
