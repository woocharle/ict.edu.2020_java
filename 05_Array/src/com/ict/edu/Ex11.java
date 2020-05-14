package com.ict.edu;

import java.util.Scanner;

// 시험문제
public class Ex11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][] arr = new int[5][5];
		
		//String[] input_s = new String[5];

		//int[] p1 = {1, 270, 90, 'A', 1};
	
		for(int i = 0; i < 5; i++) {
			System.out.print("이름: ");
			int name = sc.nextInt();
			
			System.out.print("국어: ");
			int kor = sc.nextInt();
			
			System.out.print("영어: ");
			int eng  = sc.nextInt();
			
			System.out.print("수학: ");
			int math = sc.nextInt();
			
			int sum = kor + eng + math;
		
			
			int avg = (int)(sum / 3.0 * 10) / 10;
			
			
			char grade;
			if(avg >= 90) {
				grade = 'A';
			}
			else if(avg >= 80) {
				grade = 'B';
			}
			else if(avg >= 70) {
				grade = 'C';
			}
			else {
				grade = 'F';
			}
			arr[i][0] = name;
			arr[i][1] = sum;
			arr[i][2] = avg;
			arr[i][3] = grade;
			arr[i][4] = 1;
		}

		// rank 구하기
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(arr[i][1] < arr[j][1]) {
					arr[i][4]++;
				}
			}
		}
		
		int[] tmp; 

		// 정렬하기;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				if (arr[i][4] > arr[j][4]) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;

				}
				
			}
			
		}
		
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if(j == 3) {
					System.out.print((char)arr[i][j] + " ");
				}
				else {
					System.out.print(arr[i][j] + " ");
				}
			}
			System.out.println();
		}
	
	}
}
