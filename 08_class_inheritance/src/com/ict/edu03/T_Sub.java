package com.ict.edu03;

public class T_Sub extends T_Super{
	String addr;
	int car;
	
	public T_Sub() {
		this("���� ȫ���Ա�");
		System.out.println("�ڽ� ������1");
		
	}
	
	public T_Sub(String addr) {
		//super("ȫ�浿");
		this.addr = addr;
		System.out.println("�ڽ� ������2");
	}
	
	public T_Sub(int car) {
		this.car = car;
	}
	
	public T_Sub(String addr, int car) {
		this.addr = addr;
		this.car = car;
	}
	
	public T_Sub(int car, String addr) {
		this.addr = addr;
		this.car = car;
	}
	
	
}
