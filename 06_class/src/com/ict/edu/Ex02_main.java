package com.ict.edu;

public class Ex02_main {
	public static void main(String[] args) {
		// static ��� �ʵ� ȣ�� 
		System.out.println(Ex02.eng);
		System.out.println(Ex02.com);
		
		//static�� �ƴ� ���� ��ü�� ����� ������ ȣ�� ����.
		
		
		// Ex02 Ŭ���� ��ü �����
		// Ŭ�����̸� �������� = new ������
		// Ex02�� �����ڰ� ������ �⺻�����ڷ� ����
		Ex02 test = new Ex02();
		
		//����ʵ� ȣ��
		System.out.println(test.kor);
		System.out.println(test.eng);
		System.out.println(test.math);
		System.out.println(test.com);
		
		System.out.println();
		System.out.println(test);
		
	}
}
