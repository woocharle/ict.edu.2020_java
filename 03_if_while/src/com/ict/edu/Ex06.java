package com.ict.edu;

public class Ex06 {
	public static void main(String[] args) {
		
		/*
		for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 6; j++) {
				System.out.println("i=" + i + ", j=" + j);
			}
		}
		*/
		System.out.println("备备窜 Series");
		
		System.out.println("备备窜 case1");
		
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + " x " + j + " = " + i * j);
			}
		}
		
		System.out.println();
		System.out.println("备备窜 case2");
		
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.print(i + " x " + j + " = " + i * j + "\t");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("备备窜 case3");
		
		for (int i = 1; i <= 9; i++) {
			for (int j = 2; j <= 9; j++) {
				System.out.print(j + " x " + i + " = " + i * j + "\t");
			}
			System.out.println();
		}
		
        // 0 0 0 0  
		// 0 0 0 0
		// 0 0 0 0 
		// 0 0 0 0
		
		for(int i = 0; i < 4 ; i++){
			for (int j = 0; j < 4; j++) {
				System.out.print(0 + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i = 0; i < 4 ; i++){
			for (int j = 0; j < 7; j++) {
				if(j % 2 == 0) {
					System.out.print(0);
				}
				else {
					System.out.print(" ");
				}
					
			}
			System.out.println();
		}
		
		System.out.println();
		
		
		
		// 1 0 0 0  
		// 0 1 0 0
		// 0 0 1 0 
		// 0 0 0 1
		
		for(int i = 0; i < 4 ; i++){
			for (int j = 0; j < 4; j++) {
				if (i != j) {
					System.out.print(0 + " ");
				}
				else {
					System.out.print(1 + " ");
				}

			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i = 0; i < 4 ; i++){
			for (int j = 0; j < 7; j++) {
				if(j % 2 == 0) {
					if (j / 2 == i) {
						System.out.print(1);
					}
					else {
						System.out.print(0);
					}
				}
				else {
					System.out.print(" ");
				}
					
			}
			System.out.println();
		}
		
		System.out.println();
		
		
	}
}
