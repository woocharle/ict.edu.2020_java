package com.ict.edu;

import java.util.Random;

public class Ex02_main {
	public static void main(String[] args) {
		// static 멤버 필드 호출 
		System.out.println("------------------------------------------------");
		System.out.println("static 멤버 필드 호출");
		System.out.println(Ex02.eng);
		System.out.println(Ex02.COM);
		
		//static이 아닌 것은 객체를 만들기 전에는 호출 못함.
		
		
		// Ex02 클래스 객체 만들기
		// 클래스이름 참조변수 = new 생성자
		// Ex02에 생성자가 없으면 기본생성자로 생성
		Ex02 test = new Ex02();
		
		//멤버필드 호출
		System.out.println("------------------------------------------------");
		System.out.println("static 멤버 필드 와 일반 멤메필 드 호출");
		
		System.out.println(test.kor);
		System.out.println(Ex02.eng);
		System.out.println(test.MATH);
		System.out.println(Ex02.COM);
		
		
		System.out.println("객체의 주소");
		System.out.println(test);
		
		System.out.println("------------------------------------------------");
		System.out.println("메소드 이용");
		
		test.prn();
		
		System.out.println(test.kor);
		System.out.println(Ex02.eng);
		
		System.out.println("\n------------------------------------------------");
		System.out.println("random 함수");
		
		
		// API로 static 메소드와 instance 메소드를 호출해 보자.
		// 클래스를 객체로 만들어서 사용해야 한다.
		// 다음 예시는 
		// API에서 제공하는 Random클래스의 nextInt(int bound), nextDouble()을 사용하는 것이다.
		Random ran = new Random();
		
		// nextInt(숫자): 반환값 (0 ~ 숫자 전까지)
		int res = ran.nextInt();
	
		System.out.println(res);
		
		res = ran.nextInt(10);   // 0 ~ 9까지?
		System.out.println(res);
		
		System.out.println("------------------------------------------------------");
		
		//nextDouble: 정해지지 않은 0.0 ~ 1.0 미만의 실수 
		double res2 = ran.nextDouble();
		
		System.out.println(res2);
		
		// nextDouble이 nextInt보다 더 많은 경우의 수를 만들수 있다.
		// res2를 0 ~ 5까지의 정수로 표현하자 
		
		System.out.println((int)(res2 * 5));
		
		System.out.println((int)Math.pow(2, 3));
		
		// 원하는 정수
		// 변수와 상수 
		
		Ex03 test1 = new Ex03();
		
		test1.add();
		
		System.out.println(test.kor);
		System.out.println(Ex02.eng);
		
		
	}
}
