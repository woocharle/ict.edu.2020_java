package com.ict.edu3;

public class Student extends Person {
	// 멤버필드
	private int id;
	
	// 생성자
	public Student(String name, int age, int id) {
		super(name, age);
		this.id = id;
	}

	// 멤버 메소드
	
	public void setName(String name) {
		super.setName(name);
	}
		
	public void setAge(int Age) {
		super.setAge(Age);
	}
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	

	public void print(){
		super.print();
		System.out.print(", 학번: " + id);
	}
	
	

}
