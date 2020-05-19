package com.ict.edu8;

/* 인터페이스 
	- 정의: 서비스를 제공하는 목록, 
	- 특징: 상수와 추상메소드들로 이루어졌다. 생성자가 없다. (객체 생성 및 값 변경이 안 됨.)
	        유일하게 다중 상속(인터페이스의 큰 장점)이 가능하다. 
	        class의 body에서는 아래있는게 구별 되지만 interface의 body에서는 모두다 static final로 간주된다. 
			interface는 abstract를 안 써도 추상메소드를 생성할 수 있다.
	- 상속관련
	  일반클래스: 반드시 오버라이딩 할 것.
	  추상클래스: 오버라이딩 할 필요가 없다.
	  인터페이스: 오버라이딩 할 필요가 없다.
			
	- 형식: class가 class를 상속할 때 extends
			interface가 interface를 상속할 때 extends
			class가 interface를 상속할 때 implements
			ex) public class Calc implements Add, Sub 
						
			implements는 추상메소드를 구현을 의미한다.
			interface가 class를 절대 상속하지 않는다.
			
	- interface: 정보를 전달하는 목록. 
	
*/
public interface Ex01 {
	int su1 = 10;
	static int su2 = 20;
	final int SU3 = 30;
	static final int SU4 = 40; 
	
	//public void play() {};
	
	//일반적인 추상 메소드
	public abstract void play();
	
	public void sound();
	
}
