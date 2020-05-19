package com.ict.edu4;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Animal d = new Dog();
		Animal c = new Cat();
		
		
		System.out.println("개");
		System.out.println(d.eyes);
		System.out.println(d.legs);
		d.like();
		d.sound();
		System.out.println();
		
		System.out.println("고양이");
		System.out.println(c.eyes);
		System.out.println(c.legs);
		c.like();
		c.sound();
		
		System.out.println("==========================================================");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("선택하시오 >> 1.고양이, 2.강아지" ) ;
		int su = sc.nextInt();
		System.out.println();
		
		/*
		if(su == 1) {
			Cat cat = new Cat();
			cat.sound();
			cat.like();
			cat.hobby();
			
		}
		else if(su == 2) {
			Dog dog = new Dog();
			dog.sound();
			dog.like();
			dog.hobby();
		}
		*/
		Animal a = null;
		
		if(su == 1) {
			a = new Cat();
		}
		else if(su == 2) {
			a = new Dog();
		}
		
		a.sound();
		a.like();
		a.hobby(); //sub class의 메소드를 사용 못 함.
		
		
	}
}
