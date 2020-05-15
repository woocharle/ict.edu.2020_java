package com.ict.edu;

public class Ex03 {
	
	int sound = 10;
	double sound2 = 10.0;
	
	public void add() {
		System.out.println("add_1");
		sound++;
		System.out.println("add_2");
	}
	
	public void sub() {
		sound--;
		return;
	}
	
	public int mul() {
		System.out.println("mul_1");
		return sound;
	}
	
	public int div() {
		//return sound2;
		return sound;
	}
	
	public double plus() {
		return sound;
	}
	
}
