package com.ict.edu;

public class Ex09 {
	public static void main(String[] args) {
		System.out.println("do ~ while 문");
		/*
		 do{
		 	실행문;
		 	증감식;
		 }while(조건식);
		  
		 */
		System.out.println("0 ~ 10까지 출력");
		
		int k1 = 0;
		
		do {
			System.out.println(k1);
			k1++;
		} while (k1 < 11);
		
		System.out.println();
		
		System.out.println("0 ~ 10까지 짝수만 출력");
		
		k1 = 0;
		
		do {
			if (k1 % 2 == 0) {
				System.out.println(k1);
			}
			k1++;
		} while (k1 < 11);
		
		System.out.println();
		
		System.out.println("0 ~ 10까지 누적합");
		
		k1 = 0;
		int sum = 0;
		
		do {
			sum += k1;
			k1++;
		} while (k1 < 11);
		
		System.out.println("누적합은 " + sum);	
		
		System.out.println();		

		System.out.println("구구단 5단");
		
		k1 = 1;
		
		do {
			System.out.println(5 + " x " + k1 + " = " + (5 * k1));
			k1++;
		
		} while (k1 < 10);
	}
}
