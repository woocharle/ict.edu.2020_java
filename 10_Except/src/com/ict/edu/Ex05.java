package com.ict.edu;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			int var = 50;
			System.out.print("���� �Է� : ");
			int su = sc.nextInt();
			System.out.println("����: " + (var / su));
			
		} 
		catch (Exception e) {
			System.out.println("���ܹ߻�");
			return;
		}
		finally {
			System.out.println("�ȴ�");
		}
		
		System.out.println("�����ϼ̽��ϴ�.");
	}
}
