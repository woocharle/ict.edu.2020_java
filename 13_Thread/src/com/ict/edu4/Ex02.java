package com.ict.edu4;

/*join(): ���� �����忡�� ���ϴ� �ܺ� �����尡 ���������� �����·� ���� �ִٰ� 
 * 	      �� �����尡 �����ϸ� �����ϰ� �ϴ� ��ɾ�.
 *      
          join�� ȣ���� �����尡 ������ ������ �����ϴ�.

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
