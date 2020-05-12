package com.ict.edu;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("몇 명? ");
		int n = sc.nextInt();
		
		String[] name = new String[n];
		int[] kor = new int[n];
		int[] mat = new int[n];
		int[] eng = new int[n];
		int[] sum = new int[n];
		double[] avg = new double[n];
		String[] grd = new String[n];
		int[] rank = new int[n];
		
		for (int i = 0; i < n; i++) {
			rank[i] = 1;
		}
	
		for (int i = 0; i < n; i++) {
			System.out.println((i + 1) + "번");
			System.out.print("이름: ");
			name[i] = sc.next();
			System.out.print("국어: ");
			kor[i] = sc.nextInt();
			System.out.print("수학: ");
			mat[i] = sc.nextInt();
			System.out.print("영어: ");
			eng[i] = sc.nextInt();
			System.out.println();
			
			sum[i] = kor[i] + mat[i] + eng[i];
			avg[i] = (int)(sum[i] * 10 / 3.0) / 10.0;
			
			if (avg[i] >= 90) {
				grd[i] = "A";
			}
			else if (avg[i] >= 80) {
				grd[i] = "B";				
			}
			else if (avg[i] >= 70) {
				grd[i] = "C";				
			}
			else {
				grd[i] = "F";
			}
			
			
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if(avg[i] < avg[j]) {
					rank[i]++;
				}
			}
		}
		
		System.out.println("이 름\t총 점\t평 균\t학 점\t순 위");
		for (int i = 0; i < n; i++) {
			System.out.println(name[i] +"\t" + sum[i] +"\t" + avg[i] +"\t" + grd[i] +"\t" + rank[i]);
		}
		
		System.out.println();
		
		
		
	}
}
