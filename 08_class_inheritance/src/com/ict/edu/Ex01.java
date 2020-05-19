package com.ict.edu;

public class Ex01 {
	/* 상속관계: 자식클래스가 부모 클래스의 멤버필드, 멤버메소드르 객체 생성없이 
				마음대로 사용할 수 있는 클래스간의 관계를 말한다.
	   			자식클래스가 부모클래스와 관계를 맺는다.
	   			자식클래스 extends 부모클래스
	   자바에서는 다중 상속을 할 수 없다. 즉 부모클래스가 하나만 존재.
	   모든 클래스는 Object라는 클래스를 상속받고 있다. 
	   
	   
	   super: 부모클래스의 멤버필드를 지칭하는 예약어
	   		  자식클래스의 전역변수와 이름이 같을 때 
	   		  부모클래스 멤버필드 앞에 사용한다.
	   
	   super([인자]): 부모의 생성자를 지칭하는 예약어
	   				  부모 생성자를 호출할 때 사용, 반드시 생성자 첫줄에 존재해야한다. 
	   				  this()와 같이 사용할 수 없다.
	   				  sub 클래스에 생성자를 생성할 때 super([인자 없음])가 보이지 않지만, 연동되어있다.
	   
	   오버라이딩: 상속관계에서 부모 메소드와 자식 메소드가 같은 것.
	   			   이때 자식클래스가 부모메소드를 갖다 쓰는 대신에 내용은 자기에 맞게 변경해서 사용하는 것.
	   			   부모메소드가 숨겨진다. 
	   			   - 은닉화(캡슐화): 부모메소드가 숨겨진다.
	   			   - 다형성: 같은 메소드르 호출해도 다른 내용을 실행한다.	   
	   			   - Sub_class에 ctrl + space를 누르면 오버라이딩을 할 부모 클래스를 찾을 수 있다.
	   			   - Super_class의 메소드 옆에 final을 붙이면 오버라이딩이 안 된다. final: 종단, 끝의 의미가 있다.\
	   			   - final class는 상속이 안 된다. final method => 오버라이딩이 안 됨. final 변수 => 값 변경이 안 됨.
	   
	   
	   
	   com.int.edu2: 상속 예제1 
	   com.int.edu3: 상속 예제2
	   com.int.edu4: 상속 예제3 
	   com.int.edu5: abstract class/method 정의 및 예제1
	   com.int.edu6: abstract class/method 예제2
	   com.int.edu7: abstract class/method 예제3
	   com.int.edu8: interface 정의 및 예제
	   com.int.edu9: interface 다중상속의 예
	   
	*/
	
	public static void main(String[] args) {
		Ex01_Sub test = new Ex01_Sub();
		
		System.out.println(test);
		System.out.println("============================================");
		test.play();
		
		test.prn1();
		
		//static은 상속과 상관없이 가능
		
		System.out.println(Ex01_Sup.car);
		System.out.println(Ex01_Sup.GENDER);
		Ex01_Sup.prn2();
		
		
		
	}
	
}
