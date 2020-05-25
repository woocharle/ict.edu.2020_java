package com.ict.edu3;

public class Ex01 implements Runnable{
	@Override
	public void run() {
		for(int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + " : 11111");
		}
		
		play();
	}
	
	public void play() {
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + ": #####");
		}
	}
	
	
}
