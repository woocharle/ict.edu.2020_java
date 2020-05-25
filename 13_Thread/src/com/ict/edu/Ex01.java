package com.ict.edu;

/*  Thread.
 	- ppt의 Thread 생명주기 그림 필기할 것.
    - Thread Class는 start(), run()이 존재한다.
    - Thread에 이름을 붙일 수 있다. ex) new Thread([class로 생성한 객체], [이름(String)])
    
    - com.ict.edu2: 병행처리 
    - com.ict.edu3: Runnable 이용.
    - com.ict.edu4: Thread 종료 조절. (setDeamon, join)
  	
  	Synchronized
  	- ppt에 synchronized 흐름도 생명주기 그림 필기할 것.
  	- 임계영역: 멀티스레드에서 공통으로 사용되는 영역, 
  			    현재 실행 중인 스레드가 순식간에 다른 스레드에게 제어권을 빼앗기는 문제가 발생한다.
  			    이를 해결하기 위한 방법이 동기화 처리이다. 
  			  
  	- 동기화처리: 임계영역에 synchronized 예약어를 사용하면 된다.
  				  현재 실행중인 스레드가 끝날 때까지 다른 스레드는 접근할 수 없다.
  	
  	- com.ict.edu5: synchronized.
  	- Thread의 run()는 물론 다른 메소드에도 붙일 수 있다.
  	- 교재 674p
  	
  	
*/

//싱글 스레드
public class Ex01 {
	public static void main(String[] args) {
		// 현재 실행 중인 스레드
		System.out.println(Thread.currentThread().getName());
	
		Ex02 test = new Ex02();
		test.play();
		System.out.println(1);
		String name = test.sound();
		System.out.println(name);
		System.out.println(2);
		
		System.out.println("========================================================================");
		// 싱글 스레드
		Ex03 test2 = new Ex03();
		System.out.println(Thread.currentThread().getName() + " 1");
		test2.go();
		System.out.println(Thread.currentThread().getName() + " 2");
		test2.run();
		
		//test2.start();
		System.out.println(Thread.currentThread().getName() + " 3");
		
		
		System.out.println("========================================================================");
		
		System.out.println(Thread.currentThread().getName() + " 1");
		test2.go();
		System.out.println(Thread.currentThread().getName() + " 2");
		//test2.run();
		
		test2.start();
		System.out.println(Thread.currentThread().getName() + " 3");
		
		
	}
	
}
