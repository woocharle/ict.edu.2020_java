package com.ict.edu5;

public class Ex01 implements Runnable {
	int x ;
	
	@Override
	public synchronized void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println(Thread.currentThread().getName() + ": " + (x++));
		}
	}

}
