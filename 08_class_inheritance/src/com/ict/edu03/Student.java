package com.ict.edu03;

public class Student extends Person {
	// ����ʵ�
	private int id;
	
	// ������
	public Student(String name, int age, int id) {
		super(name, age);
		this.id = id;
	}

	// ��� �޼ҵ�
	
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
		System.out.print(", �й�: " + id);
	}
	
	

}
