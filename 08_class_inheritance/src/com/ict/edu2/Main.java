package com.ict.edu2;

public class Main {
	public static void main(String[] args) {
		DcaPhone dca = new DcaPhone();
		dca.call();
		dca.text();
		dca.dca();
		System.out.println("========================================================");
		
		MP3Phone mp3 = new MP3Phone();
		mp3.call();
		mp3.text();
		mp3.sound();
		System.out.println("========================================================");
		
		GamePhone gp = new GamePhone();
		gp.call();
		gp.text();
		gp.Game();
		System.out.println("========================================================");
		
		
		Phone p1 = new DcaPhone();     
		// 부모클래스가 자식클래스를 생성자로 써서 객체생성이 되지만, 자식클래스에 있는 멤버는 쓸 수 없다.
		p1.call();
		p1.text();
		//p1.dca();
		
		Phone p2 = new MP3Phone();
		p2.call();
		p2.text();
		//p2.sound();

		
	}
}
