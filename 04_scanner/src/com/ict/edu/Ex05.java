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

			System.out.print("�����Է�: ");
			int num = sc.nextInt();
			cnt++;

			String res = "";

			if (num % 2 != 1) {
				res = "¦��";
				even++;
			} else {
				res = "Ȧ��";
				odd++;
			}

			System.out.println(num + "�� " + res + "�Դϴ�.");

			/*
			 * ���� Ǯ��
			 * 
			 * System.out.print("��� �� ���? ");
			 * 
			 * dis = sc.nextInt();
			 * 
			 * 
			 * if(dis == 2) { 
			       System.out.println("�����ϼ̽��ϴ�."); 
			       break; 
			   } 
			   else if(dis == 1) {
			 		continue; 
			   } 
			   else { 
			   		esc:while(true) {
			  			System.out.print("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է��Ͻÿ� "); 
			 			dis = sc.nextInt(); 
			 			if(dis == 1 || dis == 2) { 
			 				break esc; 
			 			}
			  		}
			  
					if(dis == 2) {
						System.out.println("�����ϼ̽��ϴ�."); 
						break; 
					}
			  
			   }
			 */
			// solution

			while (true) {
				System.out.print("��� �� ���? (1.yes, 2.no) ");
				int k2 = sc.nextInt();
				if (k2 == 1) {
					continue esc;
				} 
				else if (k2 ==2) {
					break esc;
				}
				else {
					System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է��Ͻÿ� ");
					continue;
				}

			}

		}

		System.out.println();
		System.out.println("��ü �Է� Ƚ���� " + cnt);
		System.out.println("�� �� Ȧ���� ������ " + odd);
		System.out.println("�� �� ¦���� ������ " + even);
		
		
		
		
		
		

	}

}
