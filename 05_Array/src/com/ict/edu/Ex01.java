package com.ict.edu;

public class Ex01 {
	public static void main(String[] args) {
		
		// 1. 배열 선언
		int[] su ;
		// 2. 배열 생성
		su = new int[4];
		// 3. 데이터 저장
		su[0] = 100;
		su[1] = 200;
		su[2] = 'a';
		//su[3] = 3.14;  큰 자료형은 작은 자료형에 저장 불가.
		su[3] = 300;
		su[1] = 1000; //데이터 중복가능.
		
		System.out.println(su);
		
		//배열 안에 있는 데이터 출력하기 
		System.out.println(su[0]);
		System.out.println(su[1]);
		System.out.println(su[2]);
		System.out.println(su[3]);
		System.out.println();
		 
		for (int i = 0; i < su.length; i++) {
			if(i == 2) {
				System.out.println((char)(su[i]));
			}
			else {
				System.out.println(su[i]);
			}
		}
		
		System.out.println();
		
		for (int i : su) {				//su의 하나부터 끝까지 i에 저장시켜
			System.out.println(i);
		}
		
		
		
		
	}
}
