package com.ict.edu01;

// 1.member ���� Ŭ���� �� 3.static ����Ŭ����
public class Ex05 {
	String name = "ȫ�浿";
	private int age = 24;
	static boolean gender = true;
	
	public Ex05() {
		System.out.println("�ܺ�: " + this);
	}
	
	//��� �޼ҵ�
	
	public void play() {
		int money = 10000;
		//static int time = 120;
		//���������� static : ���Ұ�
		
		 System.out.println("�ܺθ޼ҵ� " + money);
		
	}
	
	//Member ����Ŭ����
	
	public class Inner01 {
		int k1 = 100;
		
		static final int k2 = 200;
		
		public Inner01() {
			System.out.println("����: " + this);
		}
		
		public void prn() {
			System.out.println(k1);
			System.out.println(k2);
			System.out.println(Inner01.k2);
			
			System.out.println(name);
			System.out.println(age);
			System.out.println("--------------------------------------------");
			play();
		}
		
	}
	
	// static ����
	public static class Inner02 {
		int a1 = 100;
		final int a2 = 200;
		static int a3 = 300;
		static final int a4 = 400;

		public Inner02() {
			System.out.println("����: " + this);
		}
		
		public void go() {
			//�ܺ�Ŭ������ �ν��Ͻ� �������� �� ������.
			//System.out.println(name);
			//�ܺ�Ŭ������ static�� ������.
			
			System.out.println(gender);
			System.out.println(a1);
			System.out.println(a2);
			System.out.println(a3);
			System.out.println(a4);
		}
		
		public static void go2() {
			System.out.println(gender);
			//System.out.println(a1);
			//System.out.println(a2);
			System.out.println(a3);
			System.out.println(a4);
		}
		
	}//����Ŭ����
	
}
