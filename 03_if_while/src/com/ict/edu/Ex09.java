package com.ict.edu;

public class Ex09 {
	public static void main(String[] args) {
		System.out.println("do ~ while ��");
		/*
		 do{
		 	���๮;
		 	������;
		 }while(���ǽ�);
		  
		 */
		System.out.println("0 ~ 10���� ���");
		
		int k1 = 0;
		
		do {
			System.out.println(k1);
			k1++;
		} while (k1 < 11);
		
		System.out.println();
		
		System.out.println("0 ~ 10���� ¦���� ���");
		
		k1 = 0;
		
		do {
			if (k1 % 2 == 0) {
				System.out.println(k1);
			}
			k1++;
		} while (k1 < 11);
		
		System.out.println();
		
		System.out.println("0 ~ 10���� ������");
		
		k1 = 0;
		int sum = 0;
		
		do {
			sum += k1;
			k1++;
		} while (k1 < 11);
		
		System.out.println("�������� " + sum);	
		
		System.out.println();		

		System.out.println("������ 5��");
		
		k1 = 1;
		
		do {
			
			System.out.println(5 + " x " + k1 + " = " + (5 * k1));
			k1++;
		
		} while (k1 < 10);
		
		
		
	}
}