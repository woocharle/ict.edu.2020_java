package com.ict.edu;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		//Scanner Ŭ����: zl
		Scanner sc = new Scanner(System.in);
		
		System.out.print("����� �̸�: ");
		
		// �Է��� ������ String�� ��� ó���ϴ� ���
		String name = sc.next();
		System.out.println("�Է��� �̸�: " + name);
		
		
		// int�� ��� ó��
		System.out.print("����� ����: ");
		int age = sc.nextInt();
		System.out.println("�Է��� ����: " + age);
		
		// �Ǽ��� ��� ó��
		System.out.print("����� Ű: ");
		double height = sc.nextDouble();
		System.out.println("�Է��� ����: " + height);
		
		// �Է��� ������ boolean���� ó��
		System.out.print("����� �����Դϱ�? (true/false)");
		boolean gender = sc.nextBoolean();
		if (gender == true) {
			System.out.println("����� �����Դϴ�.");
		}
		else {
			System.out.println("����� �����Դϴ�.");
		}
		
		System.out.println();
		

		
		
		
		
	}
}
