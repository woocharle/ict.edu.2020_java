package com.ict.edu5;
//.¹®Á¦: Using two threads and print 1 ~ 100 using first Thread. 
//       print 101 ~ 200 using second Thread. (you should use synchronized) 

public class Ex04 implements Runnable {
	int x = 0;
	@Override
	public synchronized void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + ":" + (++x));
		}
	
	}
	
	public static void main(String[] args) {
		Ex04 sing = new Ex04();
		Thread singer1 = new Thread(sing, "±èÈ£Áß");
		Thread singer2 = new Thread(sing, "ÀÓ¿µ¿õ");
		
		singer1.start();
		singer2.start();
		
		
	}
	
}
