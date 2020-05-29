package com.ict.edu;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner	sc = new Scanner(System.in);
		int dis = 0;
		int cnt = 0;
		int even = 0;
		int odd = 0;
		
		while(true) {
			
			
			System.out.print("숫자입력: ");
			int num = sc.nextInt();
			cnt++;
			
			String res = ""; 
			
			if(num % 2 != 1) {
				res = "짝수";
				even++;
			}
			else{
				res = "홀수";
				odd++;
			}
			
			System.out.println(num + "은" + res + "입니다.");
			
			System.out.print("계속 할 까요? ");
		
			dis = sc.nextInt();
			
			
			if(dis == 2) {
				System.out.println("수고하셨습니다.");
				break;
			}
			else if(dis == 1) {
				continue;	
			}

			
		}
		
		System.out.println();
		System.out.println("전체 입력 횟수는 " + cnt);
		System.out.println("그 중 홀수의 갯수는 " + odd);
		System.out.println("그 중 짝수의 갯수는 " + even);
		
		
	}
}
