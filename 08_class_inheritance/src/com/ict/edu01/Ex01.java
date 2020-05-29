package com.ict.edu01;

public class Ex01 {
	/* 상속관계: Sub class(자식클래스)가 Super class(부모클래스)의 멤버필드, 멤버메소드를 
	   			 객체 생성없이 마음대로 사용할 수 있는 클래스 간의 관계
	   
	   super: Super class의 멤버필드를 지칭하는 예약어. 
	   		  Sub class의 전역변수와 이름이 같을 때 Super class 멤버필드 앞에 사용. 
	   
	   super([인자]) 
	    - Super class의 constructor를 지칭하는 예약어.
	   	- Super class의 constructor를 호출할 때 사용, 반드시 Sub class의 생성자 첫출에 존재해야 된다.
	   	- this()와 사용 불가.
	   	- Subclass에 생성자를 생성할 때 super()가 보이지 않지만 연동되어 있다.
	   
	   오버라이딩 : 상속
	    - 상속관계에서 Superclass와 Subclass의 메소드 이름이 같은 것.
	    - 이때 Sub class가 Super class의 메소드를 갖다 쓰는 대신 내용은 자기에게 맞게 변경이 가능하다.
	      그렇게 하면 Super class의 메소드가 숨겨진다.
	    
	   특징
	    - 은닉화: Super class의 메소드가 숨겨지는 것.
	    - 다형성: 같은 메소드를 호출해도 다른 내용을 실행.
	   	- Sub_class에 ctrl + space를 누르면 오버라이딩을 할 Super class를 찾을 수 있다.
	   	- Super_class의 메소드 옆에 final을 붙이면 오버라이딩이 안 됨.
	   	- final class는 상속이 안 됨. final method => 오버라이딩이 안 됨. final 변수 => 같이 변경이 안 됨.
	   
	   com.int.edu2: General inheritance1 
	   com.int.edu3: General inheritance2
	   com.int.edu4: General inheritance3 
	   com.int.edu5: abstract class/method 이론 및 example 1
	   com.int.edu6: abstract class/method example 2
	   com.int.edu7: abstract class/method example 3
	   com.int.edu8: interface 이론 및 example 1
	   com.int.edu9: interface example 2
	   
	*/
	
	public static void main(String[] args) {
		Ex01_Sub test = new Ex01_Sub();
		
		System.out.println(test);
		System.out.println("============================================");
		test.play();
		
		test.prn1();
		
		//static class는 객체를 생성할 필요가 없다.
		
		System.out.println(Ex01_Sup.car);
		System.out.println(Ex01_Sup.GENDER);
		Ex01_Sup.prn2();
		
		
		
	}
	
}
