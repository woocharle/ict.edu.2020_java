package com.ict.edu01;

// 열거형(enum): 상수를 하나의 객체로 인식하고, 여러개의 상수 객체들을 한 곳에 모아둔 하나의 묶음.
//				 흔히 기획 등 상위 이클립스를 다루는 사람들 빼고 일반 개발자는 안 씀.
public class Ex01_enum {
	static final int JAVA = 200;
	static final int HTML = 1000;
	public enum Lesson{
		// static final의 집합.
		JAVA, JSP, SPRING, ANDROID, HTML
	}
	
	public static void main(String[] args) {
	
		Lesson s1 = Lesson.JAVA;
		System.out.println("s1 : " + s1);
		System.out.println("JAVA: " + Ex01_enum.JAVA);
		System.out.println("=========================================================================");
		System.out.println("HTML: " + Ex01_enum.HTML);
		System.out.println("HTML: " + Lesson.HTML);
		System.out.println("=========================================================================");
		
		Lesson[] items = Lesson.values();
		
		// ordinal: index값을, 나타냄.
		for(Lesson k : items) {
			System.out.println(k + ":" + k.ordinal());
		}
		
		
	}
	
	
}
