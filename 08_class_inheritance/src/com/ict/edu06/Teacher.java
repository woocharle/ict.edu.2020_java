package com.ict.edu06;

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
		System.out.println("�̸�: " + super.getName() + ", ����: " + super.getAge()  + ", �μ�: " + subject);
	}
	
	
	
}
