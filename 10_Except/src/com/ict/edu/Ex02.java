package com.ict.edu;

public class Ex02 {
	public static void main(String[] args) {
		try {
			String year = "1994";
			int age = 2019 - Integer.parseInt(year);
			System.out.println("���� :" + age);
			
			System.out.println("=====================================");
			
			String year2 = "1994��";
			int age2 = 2020 - Integer.parseInt(year2);
			System.out.println("���� :" + age2);
		
		} catch (Exception e) {
			System.out.println("����ó��");
		}
	}
}
