package com.ict.edu5;

public class Ex02 implements Runnable {
	@Override
	public void run() {
		kitchen();
		bedroom();
		
	}
	
	public synchronized void kitchen() {
		System.out.println(Thread.currentThread().getName() + " is in kitchen");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + " is leaving kitchen");
		
	}
	
	public synchronized void bedroom() {
		System.out.println(Thread.currentThread().getName() + " is in bedroom");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + " is leaving bedroom");
	}
	
}
