package com.ict.edu01;

enum Type{
	WALKING, RUNNING, TRACKING, HIKING
}


public class Ex02 {
	public String name;
	public int size;
	public Type type;
	
	public static void main(String[] args) {
		Ex02 shose = new Ex02();
		shose.name = "����Ű";
		shose.size = 270;
		shose.type = Type.RUNNING;
		
		
		System.out.println("�Ź� �̸� : " + shose.name);
		System.out.println("�Ź� ������ : " + shose.name);
		System.out.println("�Ź� ���� : " + shose.name);

	}
	
	
		
}
