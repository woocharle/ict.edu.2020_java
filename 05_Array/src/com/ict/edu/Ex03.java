package com.ict.edu;

import java.util.Arrays;

public class Ex03 {
	public static void main(String[] args) {
		int[] num = {3, 4, 9, 5, 6, 1, 7, 2, 10, 8};
		
		System.out.println("배열 출력");
		System.out.println("일반 for문");
				
		for(int i = 0; i < num.length; i++) {
			int tmp = 0;
			for (int j = i + 1; j < num.length; j++) {
				if(num[i] > num[j]) {
					tmp = num[i];
					num[i] = num[j];
					num[j] = tmp;					
				}
			}
			
			
		}
		
		System.out.println("변형 for문");
		
		for(int k : num) {
			System.out.print(k + " ");
		}
		
		System.out.println("\n");
		
		
		int[] su2 = {3, 4, 9, 5, 6, 1, 7, 2, 10, 8};
		
		System.out.println("before");
		for(int k : su2) {
			System.out.print(k + " ");
		}
		System.out.println();
		
		System.out.println("after");
		Arrays.sort(su2);
		for(int k : num) {
			System.out.print(k + " ");
		}
		
		System.out.println("\n");
		
		
		//ArrayŬ������ 
		
		
	}
}
