package com.ict.edu5;

public abstract class Animal {
	/* 추상이란? 구체적인 내용이 없다.
	 
	   추상 클래스 : 추상메소드를 가지고 있는 클래스.
					 일반적인 멤버필드와 멤버메소드도 가지고 있을 수 있다.
					 class 앞에도 abstract를 붙인다.
	
	   추상 메소드: body가 없는 메소드({}이 없는 메소드)를 추상 메소드.
	   			    반드시 abstract 예약어를 사용한다. (void나 자료형 앞에 붙임.)
					abstract앞에 static을 붙일 수 없다.
					
	   * 추상클래스를 상속했을 때가 중요하다.
		  
		중요: 일반 클래스가 추상 클래스를 상속 받을 때 반드시 부모의 추상메소드를 오버라이딩해서 body부분을 만든다.
		  
	*/
	//General member field
	int su1 = 10;
	static int su2 = 20;
	final int SU3 = 30;
	static final int SU4 = 40;
	
	
	//General member method
	public void play() {
		su1++;
		su2++;
		//SU3++;
		//SU4++;
	}
	
	public static void prn() {
		int k1 = 100;
		//static int k2 = 200;
		
		//su1 오류
		//su2 ok
		//SU3 error
		//SU4 ok
		
		//System.out.println(su1);
		System.out.println(su2);
		//System.out.println(SU3);
		System.out.println(SU4);
		
	}
	// 추상메소드는 반드시 abstract를 붙여야 한다.
	public abstract void like();
	
	
	
	
	
	
	
	
	
	
	
}
