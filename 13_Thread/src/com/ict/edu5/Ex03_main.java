package com.ict.edu5;

public class Ex03_main {
	public static void main(String[] args) {
		Ex03 test = new Ex03();
		Thread thread = new Thread(test, "김호중");
		Thread thread2 = new Thread(test, "임영웅");
		
		thread.start();
		thread2.start();
		
		
		
	}
}
 