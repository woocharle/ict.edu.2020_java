package com.ict.edu;

public class Ex03_main {
	public static void main(String[] args) {
		System.out.println(1);
		Ex03 e3 = new Ex03();
		System.out.println(2);
		
		e3.add();
		// ���� �޼ҵ� ó�� ��ȯ�� ���� �޼ҵ�� ������ �͵� ����.
		System.out.println(3);
		int res = e3.mul();
		System.out.println(4);
		System.out.println(res);
	}
}
