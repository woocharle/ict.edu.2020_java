package com.ict.edu;

/*  Thread.
 	- 스레드의 생명 주기: ppt의 Thread 생명주기 그림 필기할 것.
    - Thread Class는 start(), run()이 존재한다.
    - 코딩 순서에 따른 우선순위가 없다. 
    - Thread에 이름을 붙일 수 있다. ex) new Thread([class로 생성한 객체], [이름(String)])
    - sleep(millis): 정의_해당 millis안 동안 대기 알 것, millis: 1/1000초
	- 데몬 스레드: 
	  일반 스레드의 작업을 돕는 보조적인 역할을 수행하는 스레드. 
	  일반 스레드가 종료하면 데몬 스레드는 강제적으로 종료 됨.
	  setDaemon(boolean e): e가 true: main이 종료하면 thread 종료, false: main이 종료해도 thread 작동.
    
    - join(): 현재 스레드에서 원하는 외부 스레드가 끝날때까지 대기상태로 빠져 있다가 
  	          그 스레드가 종료하면 실행하게 하는 명령어. join을 호출한 스레드가 끝나야 실행이 가능하다.
    
    - ex)
      com.ict.edu2: 병행처리 
      com.ict.edu3: Runnable 이용.
      com.ict.edu4: Thread 종료 조절. (setDeamon, join)
  	
  	Synchronized
  	- ppt에 synchronized 흐름도 생명주기 그림 필기할 것.
  	- 임계영역: 멀티스레드에서 공통으로 사용되는 영역, 
  			    현재 실행 중인 스레드가 순식간에 다른 스레드에게 제어권을 빼앗기는 문제가 발생한다.
  			    이를 해결하기 위한 방법이 동기화 처리이다. 
  			  
  	- 동기화처리: 임계영역에 synchronized 예약어를 사용하면 된다.
  				  현재 실행중인 스레드가 끝날 때까지 다른 스레드는 접근할 수 없다.
  	- wait(): 지정한 스레드를 대기 상태로 만드는 method
  	          스레드를 풀어주지 않으면 그대로 대기상태로 끝낸다.  
  	- wait()된 스레드를 풀어주는 예약어는 notify(), notifyAll() 이다.
  	   
  	
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
