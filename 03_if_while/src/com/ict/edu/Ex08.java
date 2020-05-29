package com.ict.edu;

public class Ex08 {
	public static void main(String[] args) {
		//吝钦 while 巩
		for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 6; j++) {
				System.out.println("i = " + i + ", j= " + j );
			}
		}
		
		System.out.println("\nwhile巩栏肺 结焊扁");
		
		int i = 1;
		
		while(i < 4) {
			int j = 1;
			while (j <6) {
				System.out.println("i = " + i + ", j= " + j );
				j++;
			}
			i++;
		}
		
		 
		System.out.println("\n备备窜\n");
		//备备窜 case 1
		i = 2;
		
		while (i <= 9) {
			int j = 1; 
			while (j <= 9){
				System.out.println(i + " x " + j + " = " + (i * j));
				j++;
			}
			
			i++;
		}
		
		System.out.println("--------------------------------------------------");
		
		//备备窜 case 2
		
		i = 2;
		
		while (i <= 9) {
			int j = 1;
			
			while (j <= 9){
				String tab = "";
				if (i * j >= 10) {
					tab = " ";
				}
				else {
					tab = "  ";
				}
				
				System.out.print(i + " x " + j + " = " + (i * j) + tab);
				j++;
			}
			System.out.println();
			
			i++;
		}
		
		System.out.println("--------------------------------------------------");
		
		//备备窜 case 3
		
		i = 1;
		
		while (i <= 9) {
			int j = 2; 
			while (j <= 9){
				String tab = "";
				if (i * j >= 10) {
					tab = " ";
				}
				else {
					tab = "  ";
				}
				System.out.print(i + " x " + j + " = " + (i * j) + tab);
				j++;
			}
			System.out.println();
			
			i++;
		}
		
		System.out.println("\n--------------------------------------------------\n");
		
	}
}