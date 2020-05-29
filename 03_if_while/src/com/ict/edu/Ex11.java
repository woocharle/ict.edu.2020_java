package com.ict.edu;

public class Ex11 {
	public static void main(String[] args) {
		
		System.out.println("구구단 case4");
		
		// self
		for(int k = 0; k < 3; k++) {
			for (int j = 1; j <= 9; j++) {
				if(k != 0 && j==1) continue;
				for (int i = 3 * k + 1; i < 3 * k + 4; i++) {
					System.out.print(i + " x " + j + " = " + i * j + "\t");
	
				}
				System.out.println();
			}
			System.out.println();
		}
		
		// teacher
		for(int k = 1; k < 10; k += 3) {
			for (int j = 1; j <= 9; j++) {
				if(k != 1 && j==1) continue;
				for (int i = k ; i < k + 3; i++) {
					System.out.print(i + " x " + j + " = " + i * j + "\t");
					
				}
				System.out.println();
			}
			System.out.println();
		}
		
	}
	
}
