package com.ict.edu;

//멤버 필드: 상태값, 속성, 특징, 데이터, 보충

public class Ex02 {
	int kor = 80;   			//인스턴스 변수
	static int eng = 85;		//static 변수
	final int MATH = 90;		//인스턴스 상수 final이 있으면 상수
	final static int COM =95;	//static 상수(보통 상수 포함)   
	
	// 변수와 상수 
	// 메소드: 기능, 동작
	public void prn() {
		kor = kor + 10;
		eng = eng + 10;
		//MATH = MATH + 10;
		//COM = COM + 10;
		
		
	}
	
	
	
}
