package com.ict.edu5;

public class Ex03 implements Runnable {
	int x = 1;
	
	@Override
	public synchronized void run() {
		for (int i = 1; i < 51; i++) {
			System.out.println(Thread.currentThread().getName() + " : " + (x++));
			if(x == 11) {
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}else {
				notify();
			}
			
		}
		
	}
	
}
