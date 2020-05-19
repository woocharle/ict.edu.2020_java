package com.ict.edu;

import java.util.Random;
import java.util.Scanner;

public class Q01 {
	public static void main(String[] args) {
		//Quiz : 010-7777-9999 => 010-7777-XXXX로 바꿔라.
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		String quiz = "010-7777-9999";
		String ans = quiz.substring(quiz.indexOf("-", quiz.indexOf("-") + 1) + 1, quiz.length());
		ans = quiz.replace(ans, "XXXX");
		
		System.out.println(ans);
		System.out.println();
		System.out.println("===================================================================");
		
		// 1. 높은 / 낮음 맞추기
		// 입력: 시작, random을 돌리고 홀수 면 높음 짝수 면 낮음
		
		System.out.println("첫번째 시작");
		
		int num = ran.nextInt();
		
		System.out.println(num);
		if(num % 2 ==0) {
			System.out.println("낮음");
		}
		else {
			System.out.println("높음");
		}
		System.out.println();
		
		// 2. random을 돌리고 0 ~ 6 이면 높음 8 ~ 13이면 낮음, 7이면 비김
		
		System.out.println("두번째 시작");
		
		num = (int)(Math.random() * 13 + 1);
		
		if(num >= 0 && num <= 6) {
			System.out.println("높음");
		}
		else if(num == 7){
			System.out.println("비김");
		}
		else if(num >= 8 && num <= 13){
			System.out.println("낮음");
		}
		
		// 가위 바위 보 
		
		loop:while(true) {
				System.out.println("가위, 바위, 보를 시작합니다.");
				System.out.print("입력하시오 => ");
				String str = sc.next();
				
				if(str.equals("가위") == false) {
					if(str.equals("바위") == false) {
						if(str.equals("보") == false) {
							System.out.println("가위, 바위, 보 중 세가지 중 하나만 입력하세요.");
							continue loop;
						}
					}
				}

				String com = "";
				
				num = (int)(Math.random() * 3);
				if(num == 0) {
					com = "가위";
				}
				else if(num == 1) {
					com = "바위";
				}
				else if(num == 2) {
					com = "보";
				}
				
				String res="";
				
				switch (str) {
					case "가위":
						switch (com) {
							case "가위": res = "비겼습니다."; break;
							case "바위": res = "졌습니다."; break;
							case "보": res = "이겼습니다."; break;
								
							}
					case "바위":
						switch (com) {
						case "가위": res = "이겼습니다."; break;
						case "바위": res = "비겼습니다."; break;
						case "보": res = "졌습니다."; break;
						
						}
					case "보":
						switch (com) {
						case "가위": res = "졌습니다."; break;
						case "바위": res = "이겼니다."; break;
						case "보": res = "비겼습니다."; break;
						
						}
		
				}
				
				System.out.println(res);
				
				loop1: while(true) {
							System.out.print("계속 하시겠습니까? (1.네  2.아니오)");
							num = sc.nextInt();
							if(num == 1) {
								continue loop;
							}
							else if(num ==2) {
								break loop;
							}
							else {
								System.out.println("1과 2중 하나늘 입력하시오.");
								continue loop1;
							}
					
						}
					
			}
		
	}
	
	

	
	  

	// 3. 가위 바위보 문자
	// 입력: 가위
	// 출력: 비김, 이김, 짐.
	
	
}
