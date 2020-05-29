package com.ict.edu;

public class Ex09 {
	public static void main(String[] args) {
		System.out.println("do ~ while 문");
		/*
		 do{
		 	실행문;
		 	증감문;
		 }while(조건문);
		  
		 */
		System.out.println("0 ~ 10까지 출력하시오.");
		
		int k1 = 0;
		
		do {
			System.out.println(k1);
			k1++;
		} while (k1 < 11);
		
		System.out.println();
		
		System.out.println("0 ~ 10까지 짝수만 출력하시오.");
		
		k1 = 0;
		
		do {
			if (k1 % 2 == 0) {
				System.out.println(k1);
			}
			k1++;
		} while (k1 < 11);
		
		System.out.println();
		
		System.out.println("0 ~ 10까지의 합을 구하시오.");
		
		k1 = 0;
		int sum = 0;
		
		do {
			sum += k1;
			k1++;
		} while (k1 < 11);
		
		System.out.println("총 합계는: " + sum);	
		
		System.out.println();		

		System.out.println("5단을 출력하세요.");
		
		k1 = 1;
		
		do {
			System.out.println(5 + " x " + k1 + " = " + (5 * k1));
			k1++;
		
		} while (k1 < 10);
		
		System.out.println("===============================================");
	}
}
