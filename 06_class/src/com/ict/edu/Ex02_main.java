package com.ict.edu;

import java.util.Random;

public class Ex02_main {
	public static void main(String[] args) {
		// static ��� �ʵ� ȣ�� 
		System.out.println("------------------------------------------------");
		System.out.println("static ��� �ʵ� ȣ��");
		System.out.println(Ex02.eng);
		System.out.println(Ex02.COM);
		
		//static�� �ƴ� ���� ��ü�� ����� ������ ȣ�� ����.
		
		
		// Ex02 Ŭ���� ��ü �����
		// Ŭ�����̸� �������� = new ������
		// Ex02�� �����ڰ� ������ �⺻�����ڷ� ����
		Ex02 test = new Ex02();
		
		//����ʵ� ȣ��
		System.out.println("------------------------------------------------");
		System.out.println("static ��� �ʵ� �� �Ϲ� ����� �� ȣ��");
		
		System.out.println(test.kor);
		System.out.println(Ex02.eng);
		System.out.println(test.MATH);
		System.out.println(Ex02.COM);
		
		
		System.out.println("��ü�� �ּ�");
		System.out.println(test);
		
		System.out.println("------------------------------------------------");
		System.out.println("�޼ҵ� �̿�");
		
		test.prn();
		
		System.out.println(test.kor);
		System.out.println(Ex02.eng);
		
		System.out.println("\n------------------------------------------------");
		System.out.println("random �Լ�");
		
		
		// API�� static �޼ҵ�� instance �޼ҵ带 ȣ���� ����.
		// Ŭ������ ��ü�� ���� ����ؾ� �Ѵ�.
		// ���� ���ô� 
		// API���� �����ϴ� RandomŬ������ nextInt(int bound), nextDouble()�� ����ϴ� ���̴�.
		Random ran = new Random();
		
		// nextInt(����): ��ȯ�� (0 ~ ���� ������)
		int res = ran.nextInt();
	
		System.out.println(res);
		
		res = ran.nextInt(10);   // 0 ~ 9����?
		System.out.println(res);
		
		System.out.println("------------------------------------------------------");
		
		//nextDouble: �������� ���� 0.0 ~ 1.0 �̸��� �Ǽ� 
		double res2 = ran.nextDouble();
		
		System.out.println(res2);
		
		// nextDouble�� nextInt���� �� ���� ����� ���� ����� �ִ�.
		// res2�� 0 ~ 5������ ������ ǥ������ 
		
		System.out.println((int)(res2 * 5));
		
		System.out.println((int)Math.pow(2, 3));
		
		// ���ϴ� ����
		// ������ ��� 
		
		Ex03 test1 = new Ex03();
		
		test1.add();
		
		System.out.println(test.kor);
		System.out.println(Ex02.eng);
		
		
	}
}
