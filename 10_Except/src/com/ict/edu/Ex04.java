package com.ict.edu;

import java.util.Scanner;

public class Ex04 {
	public void setData(String msg) throws NumberFormatException{
		if(msg.length() >= 1) {
			String str = msg.substring(0, 1);
			prnData(str);
			
		}
	}
	
	public void prnData(String str) throws NumberFormatException{
		int dan = Integer.parseInt(str);
		System.out.println(dan + "단");
		for (int i = 0; i < 10; i++) {
			System.out.println(dan + " * " + i + " = " + (dan * i) );
		}
		
	}

	public static void main(String[] args) {
		Ex04 test = new Ex04();
		Scanner sc = new Scanner(System.in);
		while(true) {
			try {
				System.out.print("정수를 입력하시오 >>  ");
				String msg = sc.next();
				test.setData(msg);
				break;
				
			} catch (NumberFormatException e) {
				System.out.println("숫자를 입력하시오.");
				continue;
			}
		}
		
	}
}
