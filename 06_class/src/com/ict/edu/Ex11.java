package com.ict.edu;
// 생성자
public class Ex11 {
	//멤버 필드
	private String name = "일지매";
	private int age = 24;
	private String addr = "충청도";
	
	// 생성자와 생성자 오버로딩
	
	public Ex11() {}  //기존 생성자
	
	public Ex11(String name) {
		this.name = name;
	}
	
	public Ex11(String name, int age, String addr) {
		super();
		this.name = name;
		this.age = age;
		this.addr = addr;
	}

	// Value Object.
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

	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	

	
	
	
	
}
