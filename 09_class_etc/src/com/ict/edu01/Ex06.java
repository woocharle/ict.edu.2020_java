package com.ict.edu01;
// Local ���� class

public class Ex06 {
	String name = "�Ѹ�";
	
	public Ex06() {
		System.out.println("�ܺ�: " + this);
	}
	
	public void sound() {
		System.out.println("ȣ��~ ȣ��~");
	}
	
	public void play() {
		int age =24;
		class In_01{
			int money = 2000;
			public In_01() {
				System.out.println("����: " + this);
			}
			public void hobby() {
				System.out.println(name);
				System.out.println(age);
				System.out.println(money);
			}
			
		}// ����Ŭ���� ��
		In_01 in01 = new In_01();
		in01.hobby();
		System.out.println("�ܺθ޼ҵ� ��: �޼ҵ� ��");
		
	}// �ܺ� �޼ҵ� ��
	
}// �ܺ� Ŭ���� ��
