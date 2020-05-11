package com.ict.edu;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 입력: ");
		int su = sc.nextInt();
		String result = "";
		if(su % 2 == 0) {
			result = "짝수";
		}
		if(su % 2 != 0) {
			result = "홀수";
		}
		
		System.out.println("결과: " + result);
		System.out.println();
		
		//근무시간 
		
		System.out.print("나라입력 : 1.한국, 2.중국, 3.일본 >> ");
		String nation = sc.next();
		String cpt = "";
		
		switch (nation) {
		case "한국":	cpt = "서울";	break;	
		case "중국":	cpt = "베이징";	break;	
		case "일본":	cpt = "도쿄";	break;
		default:		cpt = "data 없음"; break;
		}
		
		System.out.println(nation + "의 수도는 " + cpt);
		System.out.println();		
		
		
		System.out.print("알바시간 : ");
		int time = sc.nextInt();
		int pay = 8590;
		int sal = 0;
		
		if (time > 8) {
			sal = (int)((time - 8) * 1.5 * pay) + 8 * 8590; 
		}
		else {
			sal = time * pay;
		}
		
		System.out.println("일당은 " + sal);
		System.out.println();
		// menu
		
		System.out.print("menu 선택 : \n 1.카페모카(3500) \n 2.카페라떼(4000) \n"
				  			+ " 3.아메리카노(3000)\n 4.과일쥬스(3500) >> ");
		
		
		int cho = sc.nextInt();
		String menu = "";
		int pp = 2;
		int price = 0;
		int input = 10000;
	
		switch (cho) {
		case 1: menu = "카페모카";	price = 3500;	break;
		case 2: menu = "카페라떼";	price = 4000;	break;
		case 3: menu = "아메리카노";	price = 3000;	break;
		case 4: menu = "과일쥬스";	price = 3500;	break;			
		default: break;	
		}
		
		int change = input - (int)(pp * price * 1.1); 
		
		System.out.println("거스름돈은 " + change );
		
	
		
		
		
	}
	
}
