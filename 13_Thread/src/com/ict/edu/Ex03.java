package com.ict.edu;

// Ex01, Ex02는 단독 Thread의 예를 보여준 것이다.

public class Ex03 extends Thread{
	//Thread를 상속 받음.
	public void go() {
		System.out.println(currentThread().getName() + " : go()메소드");
	
	}
	
	public void run() {
		System.out.println(currentThread().getName() + " : run()메소드");
		System.out.println(currentThread().getName() + " : run() 메소드");
		System.out.println(currentThread().getName( )+ " : run() 메소드");
		System.out.println(currentThread().getName() + " : run() 메소드");
	}
	/*
	public void start() {
		System.out.println(currentThread().getName() + " : run()메소드");
		System.out.println(currentThread().getName() + " : run() 메소드");
		System.out.println(currentThread().getName( )+ " : run() 메소드");
		System.out.println(currentThread().getName() + " : run() 메소드");
	}
	*/
}
