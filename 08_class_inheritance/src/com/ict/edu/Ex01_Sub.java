package com.ict.edu;

//자식 클래스 : 부모 클래스와 상속관계를 맺는다.
public class Ex01_Sub extends Ex01_Sup {
	String name = "홍반장";
	int age = 13;
	
	public Ex01_Sub() {
		System.out.println("자식클래스 생성자 : " + this);
	}
	
	public void play() {
		System.out.println(name);
		
		String name = "홍두께";
		System.out.println(name);
		
		//자식에 없지만 부모에만 있는 변수는 this와 super를 구분 지을 필요가 없다.
		System.out.println(this.addr);
		System.out.println(super.addr);
		
		
		//자식도 부모에 있는 변수를 가질 경우 this나 super로 구분지어야 한다.  
		int age = 3;
		System.out.println(age);
		System.out.println(this.age);
		System.out.println(super.age);
		
		//private은 상속이어도 접근이 불가능하다.
		
		
	}

	
}
