package com.ict.edu;

public class Ex13 {
	//this 와 this()
	
	/* this() : 객체의 생성자를 지칭하는 예약어.
	  			생성자에서 다른 생성자를 호출 할 때 이용. (목적) 
	 			반드시 생성자의 첫번째 줄에 와야 한다. (주의)			
	 */
	
	String name ="고길동";
	int age = 37;
	
	public Ex13() {
		//System.out.println("기본 생성자 : " + this);
		this("마이콜", 24); 			//예시로 노트에 적기
	}
	public Ex13(String name) {
		this.name = name;
	}
	public Ex13(int age) {
		this.age = age;
	}
	public Ex13(String name, int age) {
		// this()							this()를 잘 못쓴 예
		this.name = name;
		this.age = age;
	}
	
	
	// getter / setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
}
