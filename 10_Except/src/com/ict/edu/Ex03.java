package com.ict.edu;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			
			int var = 50;
			System.out.print("���� �Է�: ");
			int su = sc.nextInt();
			System.err.println("����: " + (var / su));
			
			System.out.println("���� �ϼ̽��ϴ�.");
		} catch (ArithmeticException e1) {
			System.out.println("0���� ������ �����ϴ�.");
			
		} catch (InputMismatchException e2) {
			System.out.println("������ �Է��Ͻÿ�.");
		}
		
		System.out.println();
		System.out.println("�����ϼ̽��ϴ�.");
		
	}
}
