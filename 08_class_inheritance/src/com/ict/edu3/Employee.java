package com.ict.edu3;

public class Employee extends Person{
	private String dept;

	public Employee(String name, int age, String dept) {
		super(name, age);
		this.dept = dept;
	}

	// member field
	public void setAge(int age) {
		super.setAge(age);
	}
	
	public void setName(String name) {
		super.setName(name);
	}
	
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
