package com.ict.edu4;

/*	sleep(millis);
	 - 정의: 해당 millis안 동안 대기 알 것.    
	 - millis: 1/1000초
	데몬 스레드: 일반 스레드의 작업을 돕는 보조적인 역할을 수행하는 스레드.
			     일반 스레드가 종료하면 데몬 스레드는 강제적으로 종료 됨.
	 - setDaemon(boolean e): e가 true: main이 종료하면 thread 종료, false: main이 종료해도 thread 작동.
	
*/

public class Ex01 implements Runnable{
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(1000 * 2);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println(1);

		}
	}
	public void autoSave() {
		System.out.println("자바파일을 자동 저장합니다.");
	}
	
	public static void main(String[] args) {
		Ex01 e1 = new Ex01();
		Thread thread = new Thread(e1);
		thread.setDaemon(true);              
		thread.start();
		
		for (int i = 1; i < 15; i++) {
			try {
				Thread.sleep(500);
			} 
			catch (Exception e){
				
			}
			System.out.println(i);
		}
		
		System.out.println("프로그램 종료");
		
	}

}
