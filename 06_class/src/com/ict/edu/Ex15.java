package com.ict.edu;

public class Ex15 {

	int s1 = 100;
	static int s2 =200;
	static int k2 = 2;
	//static �ʱ�ȭ
	static {
		s2 = 10000;
		s3 = 20000;
		s4 = 30000;
	}
	static int s3 = 10;
	static int s4;   //������ ���߿� �ص� ������ �� ��.
	static int k3 = 2;
	static int k4;
	
	public static void main(String[] args) {
		//System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println("==============================================");
		System.out.println(k2);
		System.out.println(k3);
		System.out.println(k4);
		
		
	}
	
}
