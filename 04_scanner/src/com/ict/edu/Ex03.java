package com.ict.edu;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하시오.: ");
		
		int num = sc.nextInt();
		
		System.out.print("0부터 출력하겠습니다.: ");
		String str = sc.next();
		for(int i = 0; i < num ; i++) {
			System.out.println(str);
		}
			
		
	}
}
