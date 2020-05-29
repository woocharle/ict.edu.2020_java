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
			System.out.println((i + 1) + "��");
			System.out.print("�̸�: ");
			name[i] = sc.next();
			System.out.print("����: ");
			kor[i] = sc.nextInt();
			System.out.print("����: ");
			mat[i] = sc.nextInt();
			System.out.print("����: ");
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
		
		System.out.println("�� ��\t�� ��\t�� ��\t�� ��\t�� ��");
		for (int i = 0; i < n; i++) {
			System.out.println(name[i] +"\t" + sum[i] +"\t" + avg[i] +"\t" + grd[i] +"\t" + rank[i]);
		}
		
		System.out.println();
		
		
		
	}
}
