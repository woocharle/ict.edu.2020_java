package com.ict.edu01;

// 1.member 내부 클래스 과 3.static 내부클래스
public class Ex05 {
	String name = "홍길동";
	private int age = 24;
	static boolean gender = true;
	
	public Ex05() {
		System.out.println("외부: " + this);
	}
	
	//멤머 메소드
	
	public void play() {
		int money = 10000;
		//static int time = 120;
		//지역변수는 static : 사용불가
		
		 System.out.println("외부메소드 " + money);
		
	}
	
	//Member 내부클래스
	
	public class Inner01 {
		int k1 = 100;
		
		static final int k2 = 200;
		
		public Inner01() {
			System.out.println("내부: " + this);
		}
		
		public void prn() {
			System.out.println(k1);
			System.out.println(k2);
			System.out.println(Inner01.k2);
			
			System.out.println(name);
			System.out.println(age);
			System.out.println("--------------------------------------------");
			play();
		}
		
	}
	
	// static 변수
	public static class Inner02 {
		int a1 = 100;
		final int a2 = 200;
		static int a3 = 300;
		static final int a4 = 400;

		public Inner02() {
			System.out.println("내부: " + this);
		}
		
		public void go() {
			//외부클래스의 인스턴스 전역변수 못 가져옴.
			//System.out.println(name);
			//외부클래스의 static은 가져옴.
			
			System.out.println(gender);
			System.out.println(a1);
			System.out.println(a2);
			System.out.println(a3);
			System.out.println(a4);
		}
		
		public static void go2() {
			System.out.println(gender);
			//System.out.println(a1);
			//System.out.println(a2);
			System.out.println(a3);
			System.out.println(a4);
		}
		
	}//내부클래스
	
}
