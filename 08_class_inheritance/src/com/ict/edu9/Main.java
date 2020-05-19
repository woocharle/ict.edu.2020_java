package com.ict.edu9;

public class Main {
	public static void main(String[] args) {
		// 인터페이스는 객체 생성을 못한다.
		double s1 = 10.0;
		double s2 = 10.0;
		
		Calc a = new Calc();
		
		a.plus(s1, s2);
	}
}
