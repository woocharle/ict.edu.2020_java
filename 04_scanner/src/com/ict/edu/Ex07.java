package com.ict.edu;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�Աݾ�: ");
		int input = sc.nextInt();
		
		esc: while(true) {
			System.out.println("�޴�: 1. Ŀ������(3500)" + 
								"\n      2.�̿����� (2500)" + 
								"\n      3.�� (1500)" +
								"\n      4.�����꽺 (4000)");
			
			System.out.print("�޴��� �����Ͻÿ� (�� �ΰ����� ����.) ");
		
			int chi = sc.nextInt();
			String menu = ""; 
			int price = 0;
			
			switch (chi) {
			case 1: menu = "Ŀ������"; price= 3500; break;
			case 2: menu = "�̿�����"; price= 2500; break;
			case 3: menu = "��"; price= 1500; break;
			case 4: menu = "�����꽺"; price= 4000; break;
			default:	
				System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է��ϼ���");	
				System.out.println();
				continue esc;
			}
			
			int cost = price;
			
			System.out.println("������ ����: " + menu);
			System.out.println("�Աݾ�: " + input + "��");
			if(cost <= input) {
				System.out.println("�ܵ��� " + (input - cost) + "��");
				break;
			}
			else {
				System.out.println((cost - input) + "���� ���ڶ��ϴ�. �ٽ� �Է��ϼ���");
				System.out.println();
				continue esc;
			}
		}
		
	}
}
