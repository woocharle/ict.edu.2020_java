package com.ict.edu;

public class Ex05 {
	public static void main(String[] args) {
		for(int i = 1; i < 11; i++) {
			System.out.println(i + " ��° hello");
		}
		
		System.out.println("-------------------------------------------------");
		
		for(int i = 0; i < 11; i++) {
			System.out.print(i + " ");
		}
		
		// 0 ���� 10���� ¦���� ����ϱ� 
		
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
		
		// Ȧ���� ����ϱ� 
	
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
		
		
	}
}