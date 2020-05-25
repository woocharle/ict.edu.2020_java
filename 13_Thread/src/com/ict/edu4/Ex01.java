package com.ict.edu4;

/*	sleep(millis);
  	 - ����: �ش� millis�� ���� ��� �� ��.    
  	 - millis: 1/1000��
	���� ������: �Ϲ� �������� �۾��� ���� �������� ������ �����ϴ� ������.
				 �Ϲ� �����尡 �����ϸ� ���� ������� ���������� ���� ��.
	 - setDaemon(boolean e): e�� true: main�� �����ϸ� thread ����, false: main�� �����ص� thread �۵�.
	
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
		System.out.println("�ڹ������� �ڵ� �����մϴ�.");
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
		
		System.out.println("���α׷� ����");
		
	}

}
