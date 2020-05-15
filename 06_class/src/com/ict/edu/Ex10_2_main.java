package com.ict.edu;

import java.util.Scanner;

public class Ex10_2_main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] name = new String[5];
		int[] sum = new int[5];
		double [] avg = new double[5];
		String[] grd = new String[5];
		int[] rank = new int[5];
				
		for (int i = 0; i < sum.length; i++) {
			Ex10_2 student = new Ex10_2();
			System.out.print("이름을 입력하시오 ");
			name[i] = student.setName(sc.next());
			System.out.print("국어 점수: ");
			int kor = sc.nextInt();
			System.out.print("영어 점수: ");
			int eng = sc.nextInt();
			System.out.print("수학 점수: ");
			int math = sc.nextInt();

			sum[i] = student.s_sum(kor, eng, math);
			avg[i] = student.s_avg();
			grd[i] = student.s_hak();
			rank[i] = 1;
			
		}
		
		for (int i = 0; i < rank.length; i++) {
			for (int j = 0; j < rank.length; j++) {
				if(sum[i] < sum[j]) {
					rank[i]++;
				}
			}
			
		}
	
		String tmp_s;
		int tmp_i;
		double tmp_d;
		
		for (int i = 0; i < rank.length; i++) {
			for (int j = 0; j < rank.length; j++) {
				if(rank[i] < rank[j]) {
					tmp_s = name[i];
					name[i] = name[j];
					name[j] = tmp_s;
					
					tmp_i = sum[i];
					sum[i] = sum[j];
					sum[j] = tmp_i;
					
					tmp_d = avg[i];
					avg[i] = avg[j];
					avg[j] = tmp_d;				
					
					tmp_s = grd[i];
					grd[i] = grd[j];
					grd[j] = tmp_s;
					
					tmp_i = rank[i];
					rank[i] = rank[j];
					rank[j] = tmp_i;
					
	
				}
			}
		}
		
		
		for (int i = 0; i < sum.length; i++) {
			System.out.println(name[i] + "\t" + sum[i] + "\t" + avg[i] + "\t"
							+ grd[i] + "\t"  + rank[i]);
		}
		
		
	}
}
