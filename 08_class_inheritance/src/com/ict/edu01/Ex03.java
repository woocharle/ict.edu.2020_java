package com.ict.edu01;

import java.util.Random;

public class Ex03 extends Random{
	public static void main(String[] args) {
		Ex03 e3 = new Ex03();
		e3.play();
		System.out.println();
	}
	
	public void play() {
		int num = nextInt(10) + 1; // 1-10
		System.out.println(num);
	}
	
}
