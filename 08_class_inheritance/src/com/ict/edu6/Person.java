package com.ict.edu6;

public abstract class Person {
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

	public abstract void print(); 
	
}
