package com.ict.edu;

// Ex01, Ex02�� �ܵ� Thread�� ���� ������ ���̴�.

public class Ex03 extends Thread{
	//Thread�� ��� ����.
	public void go() {
		System.out.println(currentThread().getName() + " : go()�޼ҵ�");
	
	}
	
	public void run() {
		System.out.println(currentThread().getName() + " : run()�޼ҵ�");
		System.out.println(currentThread().getName() + " : run() �޼ҵ�");
		System.out.println(currentThread().getName( )+ " : run() �޼ҵ�");
		System.out.println(currentThread().getName() + " : run() �޼ҵ�");
	}
	/*
	public void start() {
		System.out.println(currentThread().getName() + " : run()�޼ҵ�");
		System.out.println(currentThread().getName() + " : run() �޼ҵ�");
		System.out.println(currentThread().getName( )+ " : run() �޼ҵ�");
		System.out.println(currentThread().getName() + " : run() �޼ҵ�");
	}
	*/
}
