package com.ict.edu3;

public class Teacher extends Person {
	// member field
	private String subject;
	
	// constructor
	public Teacher(String name, int age, String subject) {
		super(name, age);
		this.subject = subject;
	}

	// member method
	
	public void setAge(int age) {
		super.setAge(age);
	}
	
	public void setName(String name) {
		super.setName(name);
	}
	
	
	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public void print() {
		super.print();
		System.out.print(", °ú¸ñ: " + subject);
	}
	
	
	
}
