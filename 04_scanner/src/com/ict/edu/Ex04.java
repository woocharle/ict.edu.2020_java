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
			
			
			System.out.print("�����Է�: ");
			int num = sc.nextInt();
			cnt++;
			
			String res = ""; 
			
			if(num % 2 != 1) {
				res = "¦��";
				even++;
			}
			else{
				res = "Ȧ��";
				odd++;
			}
			
			System.out.println(num + "�� " + res + "�Դϴ�.");
			
			System.out.print("��� �� ���? ");
		
			dis = sc.nextInt();
			
			
			if(dis == 2) {
				System.out.println("�����ϼ̽��ϴ�.");
				break;
			}
			else if(dis == 1) {
				continue;	
			}

			
		}
		
		System.out.println();
		System.out.println("��ü �Է� Ƚ���� " + cnt);
		System.out.println("�� �� Ȧ���� ������ " + odd);
		System.out.println("�� �� ¦���� ������ " + even);
		
		
	}
}
