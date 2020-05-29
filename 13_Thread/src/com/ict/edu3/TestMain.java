package com.ict.edu3;

//Runnable 활용방법
public class TestMain {
	public static void main(String[] args) {
		Ex01 testA = new Ex01();
		Ex02 testB = new Ex02();
		
		//testA, testB는 Runnable을 가지고 구현하였으므로 start()가 없다.
		//start() => run()으로 가지 않으면 Thread 처리가 아니다.
		
		//start()는 Thread 클래스가 가지고 있으므로 Thread 클래스를 활용해야 된다.
		//방법 1 : Runnable를 상속받은 객체를 Thread Constructor에 넣어준다. 
		Thread thread = new Thread(testA);
		thread.start();
		
		new Thread(testB).start();    // 다시 호출이 안 됨. 
		
		//방법 2: Anonymous class 이용한다. 안드로이드에 주로사용
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
