package com.ict.edu;

import java.util.Scanner;

public class Ex10_main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Ex10[] std = new Ex10[5];
		//int[] rank = new int[5];
				
		for (int i = 0; i < std.length; i++) {
			Ex10 student = new Ex10();						//선언을 해야된다.
			System.out.print("이름을 입력하시오 ");
			student.setName(sc.next());
			System.out.print("국어 점수: ");
			int kor = sc.nextInt();
			System.out.print("영어 점수: ");
			int eng = sc.nextInt();
			System.out.print("수학 점수: ");
			int math = sc.nextInt();

			int sum = student.s_sum(kor, eng, math);
			student.setSum(sum);
			
			double avg = student.s_avg();
			student.setAvg(avg);
			
			String hak = student.s_hak();
			student.setGrade(hak);
			
			std[i] = student;
			
		}
		

		// 순위와 정렬, 출력
		// 순위
		for (int i = 0; i < std.length; i++) {
			for (int j = 0; j < std.length; j++) {
				if (std[i].getSum() < std[j].getSum()) {
					std[i].setRank(std[i].getRank() + 1);
				}
			}
		}
	
		Ex10 tmp = new Ex10();

		for (int i = 0; i < std.length - 1; i++) {
			for (int j = i + 1; j < std.length; j++) {
				if (std[i].getRank() > std[j].getRank()) {
					tmp = std[i];
					std[i] = std[j];
					std[j] = tmp;
				}
			}
		}
		
		for (int i = 0; i < std.length; i++) {
			System.out.print(std[i].getName() + "  ");
			System.out.print(std[i].getSum() + "  ");
			System.out.print(std[i].getAvg() + "  ");
			System.out.print(std[i].getHak() + "  ");
			System.out.println(std[i].getRank());
		}
		
		
	}
}
