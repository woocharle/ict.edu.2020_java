package com.ict.edu06;

public class Student extends Person {
	// ����ʵ�
	private int id;
	
	// ������
	public Student(String name, int age, int id) {
		super(name, age);
		this.id = id;
	}

	// ��� �޼ҵ�
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	

	public void print(){
		System.out.println("�̸�: " + super.getName() + ", ����: " + super.getAge()  + ", �μ�: " + id);
	}
	
	

}
