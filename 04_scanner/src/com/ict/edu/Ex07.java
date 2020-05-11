package com.ict.edu;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입금액: ");
		int input = sc.nextInt();
		
		esc: while(true) {
			System.out.println("메뉴: 1. 커피음료(3500)" + 
								"\n      2.이온음료 (2500)" + 
								"\n      3.물 (1500)" +
								"\n      4.과일쥬스 (4000)");
			
			System.out.print("메뉴를 선택하시오 (단 부가세는 포함.) ");
		
			int chi = sc.nextInt();
			String menu = ""; 
			int price = 0;
			
			switch (chi) {
			case 1: menu = "커피음료"; price= 3500; break;
			case 2: menu = "이온음료"; price= 2500; break;
			case 3: menu = "물"; price= 1500; break;
			case 4: menu = "과일쥬스"; price= 4000; break;
			default:	
				System.out.println("잘못 입력하셨습니다. 다시 입력하세요");	
				System.out.println();
				continue esc;
			}
			
			int cost = price;
			
			System.out.println("선택한 음료: " + menu);
			System.out.println("입금액: " + input + "원");
			if(cost <= input) {
				System.out.println("잔돈은 " + (input - cost) + "원");
				break;
			}
			else {
				System.out.println((cost - input) + "원이 모자랍니다. 다시 입력하세요");
				System.out.println();
				continue esc;
			}
		}
		
	}
}
