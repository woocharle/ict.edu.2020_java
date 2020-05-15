package com.ict.edu;

public class Ex14 {
	//static: 객체 생성과 상관없이 미리 만들어진 필드와 메소드
	/*		  클래스와 지역변수에는 사용 할 수 없다.
	 
	 */
	int su = 10;  //인스턴스 변수 
	static int num = 10;	//static 변수, 클래스 변수
	
	public Ex14() {
		su++;
		num++;
	}
	
	public void sum(int k1, int k2) {
		su = k1 + k2;
	}
	
	//static method
	public static void add(int k1, int k2) {
		num = k1 + k2;
		double pi = 3.14;
		
	}
	
}
