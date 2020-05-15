package com.ict.edu;

public class Ex03_main {
	public static void main(String[] args) {
		System.out.println(1);
		Ex03 e3 = new Ex03();
		System.out.println(2);
		
		e3.add();
		// 위의 메소드 처럼 반환형 없는 메소드는 저장할 것도 없다.
		System.out.println(3);
		int res = e3.mul();
		System.out.println(4);
		System.out.println(res);
	}
}
