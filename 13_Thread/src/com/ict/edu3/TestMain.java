package com.ict.edu3;

//Runnable Ȱ����
public class TestMain {
	public static void main(String[] args) {
		Ex01 testA = new Ex01();
		Ex02 testB = new Ex02();
		
		//testA, testB�� Runnable�� ������ �����Ͽ����Ƿ� start()�� ����.
		//start() => run()���� ���� ������ Thread ó���� �ƴϴ�.
		
		//start()�� Thread Ŭ������ ������ �����Ƿ� Thread Ŭ������ Ȱ���ؾ� �ȴ�.
		//��� 1 : Runnable�� ��ӹ��� ��ü�� Thread Constructor�� �־��ش�. 
		Thread thread = new Thread(testA);
		thread.start();
		
		new Thread(testB).start();   // �ٽ� ȣ���� �� ��. 
		
		//��� 2: Anonymous class �̿��Ѵ�. �ȵ���̵忡 �ַλ��
		new Thread(new Runnable() {
			@Override
			public void run() {
				while(true) {
					System.out.println(Thread.currentThread().getName() + "����������");
				}
			}
		}).start();
		
	}
	
}
