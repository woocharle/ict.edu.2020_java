package com.ict.edu5;

public class Ex03_main {
	public static void main(String[] args) {
		Ex03 test = new Ex03();
		Thread thread = new Thread(test, "트와이스");
		Thread thread2 = new Thread(test, "아이오아이");
		
		thread.start();
		thread2.start();
		
		
		
	}
}
 