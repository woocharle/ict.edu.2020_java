package com.ict.edu6;

public class Employee extends Person{
	// member field
	private String dept;

	// constructor
	public Employee(String name, int age, String dept) {
		super(name, age);
		this.dept = dept;
	}
	
	// member method
	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
	
	
	public void print() {
		System.out.println("이름: " + super.getName() + ", 나이: " + super.getAge()  + ", 부서: " + dept);
	}

	
}
