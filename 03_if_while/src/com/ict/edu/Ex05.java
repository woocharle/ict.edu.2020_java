package com.ict.edu;

public class Ex05 {
	public static void main(String[] args) {
		/*
		for(int i = 1; i < 11; i++) {
			System.out.println(i + " 번째 hello");
		}
		
		System.out.println("-------------------------------------------------");
		
		for(int i = 0; i < 11; i++) {
			System.out.print(i + " ");
		}
		
		// 0 에서 10까지 짝수만 출력하기 
		
		System.out.println("\n-------------------------------------------------");
		
		for(int i = 0; i < 11; i++) {	
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
			
		}
		
		System.out.println("\n-------------------------------------------------");
		
		for(int i = 0; i <= 5; i++) {	
			System.out.print(i * 2 + " ");
			
		}
		
		System.out.println("\n-------------------------------------------------");
		
		for(int i = 0; i < 11; i += 2) {	
			System.out.print(i + " ");
			
		}
		
		// 홀수만 출력하기 
	
		System.out.println("\n-------------------------------------------------");
		
		for(int i = 1; i < 11; i += 2) {	
			System.out.print(i + " ");
			
		}
		
		System.out.println("\n-------------------------------------------------");
		
		for(int i = 1; i < 11; i++) {	
			if (i % 2 == 1) {
				System.out.print(i + " ");
			}
		}
		
		// 0 ~ 50 까지 7의 배수만 출력하기
		System.out.println("\n-------------------------------------------------");
		
		for(int i = 0; i <= 50; i++) {	
			if (i % 7 == 0 && i > 0) {
				System.out.print(i + " ");
			}
		}
		
		System.out.println("\n-------------------------------------------------");
		for(char i = 'a'; i <= 'g'; i++) {
			System.out.print(i + "\t");
		}
		
		//5단 출력하기
		for(int i = 0; i < 10 ; i++) {
			System.out.println(5 + " x "  + i  + " = " + (5 * i));
		}
		
		for(int i = 0; i < 4 ; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(0 + " ");
			}
			System.out.println();
		}
		*/
		// 누적합
		int res = 0;
		for (int i = 0; i < 11 ; i++) {
			res += i;
				//System.out.print(i + " ");
		}
		// 0 ~ 10 홀수의 합계 
		System.out.println("누적합: " + res);
		
		res = 0;
		for (int i = 0; i < 11 ; i++) {
			if (i % 2 == 1) {
				res += i;
				//System.out.print(i + " ");
			}
		}
		//System.out.println();
		System.out.println(res);
		
		// 0 ~ 10 짝수의 합계 
		
		res = 0;
		for (int i = 0; i < 11 ; i++) {
			if (i % 2 != 1) {
				res += i;
				//System.out.print(i + " ");
			}
		}
		//System.out.println();
		System.out.println(res);
	
		
		// 0 ~ 10 홀수, 짝수 합계
		
		int odd = 0;
		int even = 0;
		
		for (int i = 0; i < 11 ; i++) {
			if (i % 2 == 1) {
				odd += i;
				//System.out.print(i + " ");
			}
			else {
				even += i;
			}
		}
		
		System.out.println("홀수의 합은 " + odd);
		System.out.println("짝수의 합은 " + even);
		
		// 7!의 값
		int sum = 1;
		for (int i = 7; i > 0 ; i--) {
			sum *= i;
			//System.out.print(res + " ");
		}
		//System.out.println();
		System.out.println(sum);
		
		
		
	}
}