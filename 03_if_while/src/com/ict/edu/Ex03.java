package com.ict.edu;

public class Ex03 {
	public static void main(String[] args) {
		
		// 합,불
		
		int k1 = 85;
		String str = "초기화";
		
		// k1의 점수가 90이상이면 A, 80이상이면 B, 70이상이면 C, 나머지 F
		
		if (k1 >= 90) {
			str = "A";
		}
		else if (k1 >= 80) {
			str = "B";
		}
		else if (k1 >= 70) {
			str = "C";
		}
		else {
			str = "F";
		}
		
		System.out.println(str);
		
		// 대문자 소문자
		
		char k2 = '1';
		str = "초기화";
		
		if (k2 >= 'a' && k2 <= 'z') {
			str = "소문자";
		}	
		else if (k2 >= 'A' && k2 <= 'Z') {
			str = "대문자";	
		} 
		else if (k2 >= '0' && k2 <= '9') {
			str = "숫자";	
		} 
		else {
			str = "기타";
		}
		
		System.out.println(str);
		
		// char k3가 A,a이면 아프리카, B,b이면 브라질, C,c이면 캐나다 나머지 한국
		
		char k3 = 'A';
		str = "초기화";
		
		if (k2 == 'a' || k2 == 'A') {
			str = "아프리카";
		}	
		else if (k2 == 'b' || k2 == 'B') {
			str = "브라질";
		}	
		else if (k2 == 'c' || k2 == 'C') {
			str = "캐나다";
		}	
		else {
			str = "한국";
		}
		
		System.out.println(str);
		
		/*menu가 1이면 카페모카 3500, 2이면 카페라떼 4000, 3이면 아메리카노 3000,
		 이면 과일쥬스 3500이다. 친구와 2잔을 10000 내고 먹었다. 잔돈은 얼마인가? (부가세 10% 포함.)*/
		
		int friend = 2;
		int price = 0; 
		int choice = 1; 
		int money = 10000;
		str = "초기화";
		
		if (choice == 1) {
			str = "카페모카";
			price = (int)(friend * 3500 * 1.1);
		}	
		else if (choice == 2) {
			str = "카페라떼";
			price = (int)(friend * 4000 * 1.1);
		}	
		else if (choice == 3) {
			str = "아메리카노";
			price = (int)(friend * 3000 * 1.1);
		}	
		else if (choice == 4) {
			str = "과일쥬스";
			price = (int)(friend * 3500 * 1.1);
		}	
		
		System.out.println(str + "두 잔 구입 잔돈은 " + (money - price) + "원");
		
		int menu = 3;
		if(menu == 1) {
			int dan = 3500;
			String drink = "카페모카";
			int su = 2;
			int total = dan * su;
			int vat = (int)(total * 0.1);
			int input = 10000;
			int output = input - (total + vat);
			System.out.println("잔돈: " + output);
		}
		else if(menu == 2) {
			int dan = 4000;
			String drink =  "카페라떼";
			int su = 2;
			int total = dan * su;
			int vat = (int)(total * 0.1);
			int input = 10000;
			int output = input - (total + vat);
			System.out.println("잔돈: " + output);
		}
		else if(menu == 3) {
			int dan = 3000;
			String drink = "아메리카노";
			int su = 2;
			int total = dan * su;
			int vat = (int)(total * 0.1);
			int input = 10000;
			int output = input - (total + vat);
			System.out.println("잔돈: " + output);
		}
		else if(menu == 4) {
			int dan = 3500;
			String drink = "과일쥬스";
			int su = 2;
			int total = dan * su;
			int vat = (int)(total * 0.1);
			int input = 10000;
			int output = input - (total + vat);
			System.out.println("잔돈: " + output);
		}
		
		// 리펙토링 1. 중복된 요소를 정리
		
		int su = 2;
		int dan = 0; 
		String drink = "메뉴"; 

		menu = 3;
		if(menu == 1) {
			dan = 3500;
			drink = "카페모카";

		}
		else if(menu == 2) {
			dan = 4000;
			drink =  "카페라떼";

		}
		else if(menu == 3) {
			dan = 3000;
			drink = "아메리카노";
		}
		else if(menu == 4) {
			dan = 3500;
			drink = "과일쥬스";

		}
		
		int input = 10000;
		int total = dan * su;
		int vat = (int)(total * 0.1);
		int output = input - (total + vat);
		System.out.println("잔돈: " + output);
		
		
		
	}
}
