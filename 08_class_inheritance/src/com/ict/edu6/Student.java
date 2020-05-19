package com.ict.edu6;

public class Student extends Person {
	// 멤버필드
	private int id;
	
	// 생성자
	public Student(String name, int age, int id) {
		super(name, age);
		this.id = id;
	}

	// 멤버 메소드
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	

	public void print(){
		System.out.println("이름: " + super.getName() + ", 나이: " + super.getAge()  + ", 부서: " + id);
	}
	
	

}
