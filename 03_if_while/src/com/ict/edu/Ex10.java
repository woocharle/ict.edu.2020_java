package com.ict.edu;

public class Ex10 {
	public static void main(String[] args) {
		//break 와 continue
		
		for (int i = 1; i < 11; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		// i = 6일 때 break
		for (int i = 1; i < 11; i++) {
			if (i == 6) break;
			System.out.print(i + " ");
		}
		System.out.println();
		
		// i = 6 일 때 continue
		
		for (int i = 1; i < 11; i++) {
			if (i == 6) continue;
			System.out.print(i + " ");
		}
		System.out.println();
		
		// 0 ~ 10짝수 출력
		
		for (int i = 0; i < 11; i++) {
			if (i % 2 == 1) {
				continue;
			}
			System.out.print(i + " ");
		}
		System.out.println();
		
		
	}
}
