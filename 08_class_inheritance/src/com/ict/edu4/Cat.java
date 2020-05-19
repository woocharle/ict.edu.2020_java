package com.ict.edu4;

public class Cat extends Animal{
	String name = "唱厚";
	int age = 10;
	
	public void hobby() {
		System.out.println("零棱扁 愁捞");
	}
	
	@Override
	public void sound() {
		System.out.println("具克~ 具克~");
	}
	
	@Override
	public void sleep() {
		System.out.println("");
	}
}
