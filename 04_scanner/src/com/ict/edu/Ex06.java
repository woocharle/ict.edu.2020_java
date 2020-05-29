package com.ict.edu;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		
		esc: while(true) {
			//정보 입력
			Scanner sc = new Scanner(System.in);
			
			System.out.print("이름: ");
			String name = sc.next();
			
			System.out.print("국어: ");
			int kor = sc.nextInt();
			
			System.out.print("수학: ");
			int mat = sc.nextInt();
			
			System.out.print("영어: ");
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
			
			System.out.println("이름: " + name);
			System.out.println("총점: " + sum);
			System.out.println("평균: " + avg);
			System.out.println("학점: " + rank);
			
			while(true) {
				System.out.println("계속 진행할까요? (1.예/2.아니요)");
				int answer = sc.nextInt();
				if (answer == 1) {
					continue esc;
				} 
				else if(answer == 2){
					break esc;
				}
				else {
					System.out.println("제대로 입력하시오");
					continue;
				}
				
			}
			
		}
		
		System.out.println("수고하셨습니다.");
	}
}
