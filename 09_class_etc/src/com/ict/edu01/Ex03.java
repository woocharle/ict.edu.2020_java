package com.ict.edu01;

enum Type2 {
	// ���("������ ����")
	WALKING("��ŷȭ", 270),
	RUNNING("����ȭ", 250),
	TRACKING("Ʈ��ŷȭ", 260),
	HIKING("���ȭ", 240);
	
	final private String name;
	final private int size;
	
	private Type2(String name, int size) {
		this.name = name;
		this.size = size;
	}
	
	public String getName(){
		return name;
	}
	
	public int getSize(){
		return size;
	}
	
}


public class Ex03 {
	public static void main(String[] args) {
		for(Type2 k : Type2.values()) {
			System.out.println(k.name() + ": " + k.getName());
			System.out.println(k.ordinal());
		
		}
	}
}
