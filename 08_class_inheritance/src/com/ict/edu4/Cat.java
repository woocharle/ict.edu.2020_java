package com.ict.edu4;

public class Cat extends Animal{
	String name = "����";
	int age = 10;
	
	public void hobby() {
		System.out.println("����� ����");
	}
	
	@Override
	public void sound() {
		System.out.println("�߿�~ �߿�~");
	}
	
	@Override
	public void sleep() {
		System.out.println("");
	}
}
