package com.ict.edu5;
//.문제: Make two threads. Then print 1 ~ 50, 101 ~ 150 using first Thread and 
//       print 51 ~ 100, 151 ~ 200 using second Thread. and  (you should use synchronized) 
		

public class Ex05 implements Runnable {
	int x = 1;

	@Override
	public synchronized void run() {
		for (int i = 0; i < 100; i++) {
			try {
				Thread.sleep(100);
				System.out.println(Thread.currentThread().getName() + ":" + (x++));
			
				if (x % 1 == 0) {
					wait();
				}
				else {
					notify();
					
				}
			
				
			} catch (InterruptedException e) {
					// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
	
	}
	
	public static void main(String[] args) {
		Ex05 sing = new Ex05();
		Thread singer1 = new Thread(sing, "박지효");
		Thread singer2 = new Thread(sing, "김세정");
		
		singer1.start();
		singer2.start();
		
		
	}
	
}
