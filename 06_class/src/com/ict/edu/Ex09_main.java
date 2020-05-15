package com.ict.edu;

import java.util.Scanner;

public class Ex09_main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Ex09[] std = new Ex09[5];
		int[] rank = new int[5];
				
		for (int i = 0; i < std.length; i++) {
			std[i] = new Ex09();						//선언을 해야된다.
			System.out.print("이름을 입력하시오 ");
			String name = sc.next();
			std[i].setName(name);
			System.out.print("국어 점수: ");
			int kor = sc.nextInt();
			System.out.print("영어 점수: ");
			int eng = sc.nextInt();
			System.out.print("수학 점수: ");
			int math = sc.nextInt();

			std[i].s_sum(kor, eng, math);
			std[i].s_avg();
			std[i].s_hak();
			rank[i] = 1;
			
		}
		
		for (int i = 0; i < rank.length; i++) {
			for (int j = 0; j < rank.length; j++) {
				if(std[i].g_sum() < std[j].g_sum()) {
					rank[i]++;
				}
			}
			
		}
	
		Ex09 tmp = new Ex09();
		int tmp_r;
		
		for (int i = 0; i < rank.length; i++) {
			for (int j = 0; j < rank.length; j++) {
				if(rank[i] < rank[j]) {
					tmp = std[i];
					std[i] = std[j];
					std[j] = tmp;
					tmp_r = rank[i];
					rank[i] = rank[j];
					rank[j] = tmp_r;
				}
			}
		}
		
		
		
		for (int i = 0; i < std.length; i++) {
			System.out.println(std[i].getName() + "\t" +std[i].g_sum() + "\t" 
								+ std[i].g_avg() + "\t" + std[i].g_grade() + "\t"  + rank[i]);
		}
		
		
	}
	
}
