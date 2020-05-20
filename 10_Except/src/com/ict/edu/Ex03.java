package com.ict.edu;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			
			int var = 50;
			System.out.print("정수 입력: ");
			int su = sc.nextInt();
			System.err.println("정답: " + (var / su));
			
			System.out.println("수고 하셨습니다.");
		} catch (ArithmeticException e1) {
			System.out.println("0으로 나눌수 없습니다.");
			
		} catch (InputMismatchException e2) {
			System.out.println("정수를 입력하시오.");
		}
		
		System.out.println();
		System.out.println("수고하셨습니다.");
		
	}
}
