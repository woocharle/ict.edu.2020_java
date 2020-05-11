package com.ict.edu;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dis = 0;
		int cnt = 0;
		int even = 0;
		int odd = 0;

		esc: while (true) {

			System.out.print("숫자입력: ");
			int num = sc.nextInt();
			cnt++;

			String res = "";

			if (num % 2 != 1) {
				res = "짝수";
				even++;
			} else {
				res = "홀수";
				odd++;
			}

			System.out.println(num + "은 " + res + "입니다.");

			/*
			 * 나의 풀이
			 * 
			 * System.out.print("계속 할 까요? ");
			 * 
			 * dis = sc.nextInt();
			 * 
			 * 
			 * if(dis == 2) { 
			       System.out.println("수고하셨습니다."); 
			       break; 
			   } 
			   else if(dis == 1) {
			 		continue; 
			   } 
			   else { 
			   		esc:while(true) {
			  			System.out.print("잘못 입력하셨습니다. 다시 입력하시오 "); 
			 			dis = sc.nextInt(); 
			 			if(dis == 1 || dis == 2) { 
			 				break esc; 
			 			}
			  		}
			  
					if(dis == 2) {
						System.out.println("수고하셨습니다."); 
						break; 
					}
			  
			   }
			 */
			// solution

			while (true) {
				System.out.print("계속 할 까요? (1.yes, 2.no) ");
				int k2 = sc.nextInt();
				if (k2 == 1) {
					continue esc;
				} 
				else if (k2 ==2) {
					break esc;
				}
				else {
					System.out.println("잘못 입력하셨습니다. 다시 입력하시오 ");
					continue;
				}

			}

		}

		System.out.println();
		System.out.println("전체 입력 횟수는 " + cnt);
		System.out.println("그 중 홀수의 갯수는 " + odd);
		System.out.println("그 중 짝수의 갯수는 " + even);
		
		
		
		
		
		

	}

}
