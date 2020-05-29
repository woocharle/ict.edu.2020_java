package com.ict.edu4;

/*join(): 현재 스레드에서 원하는 외부 스레드가 끝날때까지 대기상태로 빠져 있다가 
 * 	      그 스레드가 종료하면 실행하게 하는 명령어.
 *      
          join을 호출한 스레드가 끝나야 실행이 가능하다.
*/

public class Ex02 {
	public static void main(String[] args) {
		System.out.println("����: " + Thread.currentThread().getName());
		
		Ex03 e3 = new Ex03();
		Thread thread = new Thread(e3);
		thread.start();
		
		try {
			thread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("����: " + Thread.currentThread().getName());
		
	}
}
