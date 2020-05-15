package com.ict.edu;

import java.util.Scanner;

public class Ex09_main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Ex09[] std = new Ex09[5];
		//int[] rank = new int[5];
				
		for (int i = 0; i < std.length; i++) {
			std[i] = new Ex09();						//선언을 해야된다.
			System.out.print("이름을 입력하시오 ");
			std[i].setName(sc.next());
			System.out.print("국어 점수: ");
			int kor = sc.nextInt();
			System.out.print("영어 점수: ");
			int eng = sc.nextInt();
			System.out.print("수학 점수: ");
			int math = sc.nextInt();

			std[i].s_sum(kor, eng, math);
			std[i].s_avg();
			std[i].s_hak();
	
			
		}
		
		for (int i = 0; i < std.length; i++) {
			int rank = 0;
			std[i].s_rank(rank);
			
			for (int j = 0; j < std.length; j++) {
				if(std[i].g_sum() < std[j].g_sum()) {
					rank = std[i].g_rank();
					std[i].s_rank(rank);
				}
			}
			
		}
	
		Ex09 tmp = new Ex09();

		for (int i = 0; i < std.length; i++) {
			for (int j = 0; j < std.length; j++) {
				if(std[i].g_rank() < std[j].g_rank()) {
					tmp = std[i];
					std[i] = std[j];
					std[j] = tmp;

				}
			}
		}
		
		
		
		for (int i = 0; i < std.length; i++) {
			System.out.println(std[i].getName() + "\t" +std[i].g_sum() + "\t" 
								+ std[i].g_avg() + "\t" + std[i].g_grade() + "\t"  + std[i].g_rank());
		}
		
		
	}
	
}
