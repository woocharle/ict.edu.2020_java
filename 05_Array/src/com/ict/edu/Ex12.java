package com.ict.edu;

import java.util.Scanner;
// 클래스를 배열에 넣을 때 많이 이용.
public class Ex12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][] arr = new int[5][5];
		//int[] ar = new int[5];      for 밖에다 놓으면 미리 하나만 만들었기 때문에 맨 마지막 것만 저장된다.
		
		for(int i = 0; i < 5; i++) {
			int[] ar = new int[5];     // 지역변수라 for문 밖으로 나가면 없어진다.
			
			System.out.print("이름: ");
			int name = sc.nextInt();
			System.out.print("국어: ");
			int kor = sc.nextInt();			
			System.out.print("영어: ");
			int eng  = sc.nextInt();
			System.out.print("수학: ");
			int math = sc.nextInt();
			
			ar[0] = name;
			ar[1] = kor + eng + math;
			ar[2] = (int)(ar[1] / 3.0 * 10) / 10;
			
			if(ar[2] >= 90) {
				ar[3] = 'A';
			}
			else if(ar[2] >= 80) {
				ar[3] = 'B';
			}
			else if(ar[2] >= 70) {
				ar[3] = 'C';
			}
			else {
				ar[3] = 'F';
			}
			ar[4] = 1;
			arr[i] = ar;
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
