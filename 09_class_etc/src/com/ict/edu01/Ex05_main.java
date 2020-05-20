package com.ict.edu01;

import com.ict.edu01.Ex05.Inner02;

public class Ex05_main {
	public static void main(String[] args) {
		Ex05 e5 = new Ex05();
		System.out.println(e5.name);
	
		e5.play();
	
		System.out.println("---------------------------------------------");
		
		//member 내부클래스
		Ex05.Inner01 inner01 = new Ex05().new Inner01(); 
		// 중요: 구동은 되지만 사용 불가인 이유 상속처럼 외부클래스와 내부클래스를 불러오기 때문이다. 
		
		System.out.println("---------------------------------------------");
		
		
		Ex05.Inner01 inner02 = e5.new Inner01();
		inner02.prn();
	
		System.out.println(Inner02.a3);
		System.out.println(Inner02.a4);
		Inner02.go2();
		System.out.println("---------------------------------------------");
		
		Inner02 test = new Inner02();
		
		
		
	}
}
