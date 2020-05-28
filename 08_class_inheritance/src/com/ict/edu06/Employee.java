package com.ict.edu06;

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
		System.out.println("�̸�: " + super.getName() + ", ����: " + super.getAge()  + ", �μ�: " + dept);
	}

	
}
