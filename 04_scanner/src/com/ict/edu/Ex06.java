package com.ict.edu;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		
		esc: while(true) {
			//���� �Է�
			Scanner sc = new Scanner(System.in);
			
			System.out.print("�̸�: ");
			String name = sc.next();
			
			System.out.print("����: ");
			int kor = sc.nextInt();
			
			System.out.print("����: ");
			int mat = sc.nextInt();
			
			System.out.print("����: ");
			int eng = sc.nextInt();
			
			int sum = kor + mat + eng;
			int avg_0 = (int)(sum / 3.0 * 10); 
			double avg = avg_0 / 10.0;
			
			String rank= "";
			
			if (avg >= 90) {
				rank = "A";
			} 
			else if (avg >= 80) {
				rank = "B";
			} 
			else if (avg >= 70) {
				rank = "C";
			} 
			else {
				rank = "F";
			}
			
			System.out.println("�̸�: " + name);
			System.out.println("����: " + sum);
			System.out.println("���: " + avg);
			System.out.println("����: " + rank);
			
			while(true) {
				System.out.println("��� �����ұ��? (1.��/2.�ƴϿ�)");
				int answer = sc.nextInt();
				if (answer == 1) {
					continue esc;
				} 
				else if(answer == 2){
					break esc;
				}
				else {
					System.out.println("����� �Է��Ͻÿ�");
					continue;
				}
				
			}
			
		}
		
		System.out.println("�����ϼ̽��ϴ�.");
	}
}
