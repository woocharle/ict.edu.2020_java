package com.ict.edu04;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Animal d = new Dog();
		Animal c = new Cat();
		
		
		System.out.println("��");
		System.out.println(d.eyes);
		System.out.println(d.legs);
		d.like();
		d.sound();
		System.out.println();
		
		System.out.println("�����");
		System.out.println(c.eyes);
		System.out.println(c.legs);
		c.like();
		c.sound();
		
		System.out.println("==========================================================");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�����Ͻÿ� >> 1.�����, 2.������" ) ;
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
		a.hobby(); //sub class�� �޼ҵ带 ��� �� ��.
		
		
	}
}
