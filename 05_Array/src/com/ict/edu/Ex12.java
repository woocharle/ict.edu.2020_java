package com.ict.edu;

import java.util.Scanner;
// Ŭ������ �迭�� ���� �� ���� �̿�.
public class Ex12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][] arr = new int[5][5];
		//int[] ar = new int[5];      for �ۿ��� ������ �̸� �ϳ��� ������� ������ �� ������ �͸� ����ȴ�.
		
		for(int i = 0; i < 5; i++) {
			int[] ar = new int[5];     // ���������� for�� ������ ������ ��������.
			
			System.out.print("�̸�: ");
			int name = sc.nextInt();
			System.out.print("����: ");
			int kor = sc.nextInt();			
			System.out.print("����: ");
			int eng  = sc.nextInt();
			System.out.print("����: ");
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

		// rank ���ϱ�
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(arr[i][1] < arr[j][1]) {
					arr[i][4]++;
				}
			}
		}
		
		int[] tmp; 

		// �����ϱ�;
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
