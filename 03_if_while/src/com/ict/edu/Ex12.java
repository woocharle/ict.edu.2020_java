package com.ict.edu;

public class Ex12 {
	public static void main(String[] args) {
		
		for (int i = 1; i < 11; i++) {
			if(i == 6) break;
			System.out.print(i + " ");
		}
		System.out.println();
		
		esc:
		for (int i = 1; i < 11; i++) {
			if(i == 6) break esc;
			System.out.print(i + " ");
		}
		System.out.println();
		
		for (int i = 1; i < 11; i++) {
			if(i == 6) continue;
			System.out.print(i + " ");
		}
		System.out.println();
		
		esc:
			for (int i = 1; i < 11; i++) {
				if(i == 6) continue esc;
				System.out.print(i + " ");
			}
		System.out.println();
		
		System.out.println("========================================================================");
		for(int i = 1; i < 4; i++) {
			for (int j = 1; j < 6; j++) {
				System.out.println(i + ", " + j);
			}
		}
		
		System.out.println("========================================================================");
		System.out.println("j = 3일때 break");// 
		
		for(int i = 1; i < 4; i++) {
			for (int j = 1; j < 6; j++) {
				if(j == 3) break;
				System.out.println(i + ", " + j);
			}
		}
		
		System.out.println("========================================================================");
		System.out.println("break와 break label의 차이");// 
		
		
		
		
		esc:for(int i = 1; i < 4; i++) {
				for (int j = 1; j < 6; j++) {
					if(j == 3) break esc;
					System.out.println(i + ", " + j);
				}
			}
		
		
		System.out.println("========================================================================");
		System.out.println("continue");// 
		
		
		for(int i = 1; i < 4; i++) {
			for (int j = 1; j < 6; j++) {
				if(j == 3) continue;
				System.out.println(i + ", " + j);
			}
		}
		
		System.out.println("========================================================================");
		System.out.println("continue 와 continue label의 차이");// 
		
		
		esc2:for(int i = 1; i < 4; i++) {
				for (int j = 1; j < 6; j++) {
					if(j == 3) continue esc2;
					System.out.println(i + ", " + j);
				}
			}
			
		System.out.println("========================================================================");

		
		
	}
}
