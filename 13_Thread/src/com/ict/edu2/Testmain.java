package com.ict.edu2;

//병행처리0
public class Testmain {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName() + ": 시작");
	
		Ex01 t1 = new Ex01();
		Ex02 t2 = new Ex02();
		Ex03 t3 = new Ex03();
		
		t1.start();
		t2.start();
		t3.start();
	
		System.out.println(Thread.currentThread().getName() + ": 끝");
	}
	
}
