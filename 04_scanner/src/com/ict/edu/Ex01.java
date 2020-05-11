package com.ict.edu;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		//Scanner 클래스: zl
		Scanner sc = new Scanner(System.in);
		
		System.out.print("당신의 이름: ");
		
		// 입력한 내용이 String일 경우 처리하는 방법
		String name = sc.next();
		System.out.println("입력한 이름: " + name);
		
		
		// int일 경우 처리
		System.out.print("당신의 나이: ");
		int age = sc.nextInt();
		System.out.println("입력한 나이: " + age);
		
		// 실수일 경우 처리
		System.out.print("당신의 키: ");
		double height = sc.nextDouble();
		System.out.println("입력한 나이: " + height);
		
		// 입력한 내용을 boolean으로 처리
		System.out.print("당신은 남성입니까? (true/false)");
		boolean gender = sc.nextBoolean();
		if (gender == true) {
			System.out.println("당신은 남성입니다.");
		}
		else {
			System.out.println("당신은 여성입니다.");
		}
		
		System.out.println();
		

		
		
		
		
	}
}
