package com.ict.edu;

public class Ex09 {
	public static void main(String[] args) {
		System.out.println("do ~ while 臾�");
		/*
		 do{
		 	�떎�뻾臾�;
		 	利앷컧�떇;
		 }while(議곌굔�떇);
		  
		 */
		System.out.println("0 ~ 10源뚯� 異쒕젰");
		
		int k1 = 0;
		
		do {
			System.out.println(k1);
			k1++;
		} while (k1 < 11);
		
		System.out.println();
		
		System.out.println("0 ~ 10源뚯� 吏앹닔留� 異쒕젰");
		
		k1 = 0;
		
		do {
			if (k1 % 2 == 0) {
				System.out.println(k1);
			}
			k1++;
		} while (k1 < 11);
		
		System.out.println();
		
		System.out.println("0 ~ 10源뚯� �늻�쟻�빀");
		
		k1 = 0;
		int sum = 0;
		
		do {
			sum += k1;
			k1++;
		} while (k1 < 11);
		
		System.out.println("�늻�쟻�빀�� " + sum);	
		
		System.out.println();		

		System.out.println("援ш뎄�떒 5�떒");
		
		k1 = 1;
		
		do {
			System.out.println(5 + " x " + k1 + " = " + (5 * k1));
			k1++;
		
		} while (k1 < 10);
		
		System.out.println("===============================================");
	}
}
