package com.ict.edu;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("원하는 횟수: ");
		
		int num = sc.nextInt();
		
		System.out.print("원하는 단어 : ");
		String str = sc.next();
		for(int i = 0; i < num ; i++) {
			System.out.println(str);
		}
			
		
	}
}
