package com.ict.edu3;

public class Person {
	//member field
	private String name;
	private int age;
	
	
	//constructor
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	

	// member method
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}

	public void print() {
		System.out.print("이름: " + name + ", 나이: " + age);
	}

	
	
	
}
