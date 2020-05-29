package com.ict.edu;

public class Ex07 {
	public static void main(String[] args) {
		System.out.println("while문");
	
		System.out.println("---------------- for vs while ----------------");
		
		System.out.println("for문 이용");
		for (int i = 0; i < 11; i++) {
			System.out.print(i + " ");
		}
		
		System.out.println("\n");
		
		System.out.println("while문 이용");
		int k1 = 0;
		
		while (k1 < 11) {
			System.out.print(k1 + " ");
			k1 += 1;
		}
		
		System.out.println("\n");
		
		System.out.println("while문(true) 이용");
		
		k1 = 0;
		
		while (true) {
			if (k1 > 10) break;
			System.out.print(k1 + " ");
			k1 += 1;
		}
		
		System.out.println("\n");
		System.out.println("예제 \n");
		
		// 0 ~ 10까지 짝수만 출력
		
		k1 = 0;
		
		while (k1 < 11) {
			if(k1 % 2 == 0) {
				System.out.print(k1 + " ");
			}
			k1 += 1;
		}
		
		System.out.println("\n");
		
		// 0 ~ 10까지 홀수만 출력
		
		k1 = 0;
		
		while (k1 < 11) {
			if(k1 % 2 != 0) {
				System.out.print(k1 + " ");
			}
			k1 += 1;
		}
		
		System.out.println("\n");
		
		// 0 ~ 50까지 7의 배수만 출력
		
		k1 = 1;
		
		while (k1 <= 50) {
			if(k1 % 7 == 0) {
				System.out.print(k1 + " ");
			}
			k1 += 1;
		}
		

		// a ~ g까지 출력
		
		System.out.println("\n");
		
		char c1 = 'a';
		
		while (c1 <= 'g') {
			System.out.print(c1 + " ");
			
			c1 += 1;
		}

		System.out.println("\n");
		
		// 5단 (구구단)
		
		k1 = 1;
		
		while(k1 < 10) {
			System.out.println(5 + " x " + k1 + " = " + k1 * 5);
			k1++; 
		}
		
		System.out.println();
	
		/* 아래의 도형을 출력하시오.
		0 0 0 0
		0 0 0 0
		0 0 0 0
		0 0 0 0
		*/
		
		k1 = 0;
		/*
		while(k1 < 4) {
			for(int i = 0; i < 4; i++) {
				System.out.print("0 ");
			}
			System.out.println();
			k1++;
		}
		*/
		
		while(k1 < 4) {
			System.out.print("0 0 0 0 \n");
			k1++;
		}
		
		System.out.println("\nHomework \n");
		System.out.println("0 부터 10 누적합");
		
		k1 = 0;
		int sum = 0;
		while(k1 < 10) {
			k1++;
			sum += k1;
		}
		
		System.out.println(sum + "\n");
		
		System.out.println("0 - 10 홀수의 합");

		k1 = 0;
		sum = 0;
		while(k1 < 10) {
			k1++;
			if(k1 % 2 == 1) {
				sum += k1;
			}
		}
		
		System.out.println(sum + "\n");		
		
		
		System.out.println("0 - 10 짝수의 합");
		
		k1 = 0;
		sum = 0;
		while(k1 < 10) {
			k1++;
			if(k1 % 2 != 1) {
				sum += k1;
			}
		}
		
		System.out.println(sum + "\n");		
		
		System.out.println("0 - 10 홀수, 짝수의 합계");
		
		k1 = 0;
		int sum_even = 0;
		int sum_odd = 0;
		while(k1 < 10) {
			k1++;
			if(k1 % 2 != 1) {
				sum_even += k1;
			}
			else {
				sum_odd += k1;
			}
		}
		
		System.out.println("홀수" + sum_odd);		
		System.out.println("짝수" + sum_even + "\n");		
		
		System.out.println("7!의 값.");
		
		k1 = 7;
		sum = 1;
		
		while(k1 > 0) {
			sum *= k1;
			k1--;
		}
		
		System.out.println(sum + "\n");		
		
	}
}