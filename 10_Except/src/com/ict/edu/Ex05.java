package com.ict.edu;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			int var = 50;
			System.out.print("정수 입력 : ");
			int su = sc.nextInt();
			System.out.println("정답: " + (var / su));
			
		} 
		catch (Exception e) {
			System.out.println("예외발생");
			return;
		}
		finally {
			System.out.println("안뇽");
		}
		
		System.out.println("수고하셨습니다.");
	}
}
