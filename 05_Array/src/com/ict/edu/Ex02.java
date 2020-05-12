package com.ict.edu;

public class Ex02 {
	public static void main(String[] args) {
		char[] ch = new char[4];
		
		ch[0] = 'J';
		ch[1] = 'A';
		ch[2] = 'V';
		ch[3] = 65;  // int지만, character 범위에 들어간 숫자는 입력할 수 있다.
		
		System.out.println("일반 for문");
		for (int i = 0; i < ch.length; i++) {
			System.out.println(ch[i]);
		}
		System.out.println();
		
		System.out.println("개량된 for문");
		for (char i : ch) {
			System.out.println(i);
		}
		System.out.println();
		
		//선언, 생성, 데이터 저장 한번체
		
		char[] ch2 = {'j', 'a', 'v', 'a'};
		int[] k2 = {100, 200, 300, 400};
		double[] d2 = {3.14, 71.0 , 42.1};
		String[] str = {"홍길동", "이길동", "임꺽정", "노지심"};
		
		for(String k : str) {
			System.out.println(k);
		}
		System.out.println();
		
		
		
		
		
	}

}
