package com.ict.edu02;

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
		// �θ�Ŭ������ �ڽ�Ŭ������ �����ڷ� �Ἥ ��ü������ ������, �ڽ�Ŭ������ �ִ� ����� �� �� ����.
		p1.call();
		p1.text();
		//p1.dca();
		
		Phone p2 = new MP3Phone();
		p2.call();
		p2.text();
		//p2.sound();

		
	}
}
