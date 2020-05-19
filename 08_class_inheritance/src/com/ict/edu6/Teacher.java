package com.ict.edu6;

public class Teacher extends Person {
	// member field
	private String subject;
	
	// constructor
	public Teacher(String name, int age, String subject) {
		super(name, age);
		this.subject = subject;
	}

	// member method
	
	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public void print() {
		System.out.println("이름: " + super.getName() + ", 나이: " + super.getAge()  + ", 부서: " + subject);
	}
	
	
	
}
