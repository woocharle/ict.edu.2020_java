package com.ict.edu01;

//�ڽ� Ŭ���� : �θ� Ŭ������ ��Ӱ��踦 �δ´�.
public class Ex01_Sub extends Ex01_Sup {
	String name = "ȫ����";
	int age = 13;
	
	public Ex01_Sub() {
		System.out.println("�ڽ�Ŭ���� ������ : " + this);
	}
	
	public void play() {
		System.out.println(name);
		
		String name = "ȫ�β�";
		System.out.println(name);
		
		//�ڽĿ� ������ �θ𿡸� �ִ� ������ this�� super�� ���� ���� �ʿ䰡 ����.
		System.out.println(this.addr);
		System.out.println(super.addr);
		
		
		//�ڽĵ� �θ� �ִ� ������ ���� ��� this�� super�� ��������� �Ѵ�.  
		int age = 3;
		System.out.println(age);
		System.out.println(this.age);
		System.out.println(super.age);
		
		//private�� ����̾ ������ �Ұ����ϴ�.
		
		
	}

	
}
