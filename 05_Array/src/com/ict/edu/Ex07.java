package com.ict.edu;

import java.util.Arrays;

public class Ex07 {
	public static void main(String[] args) {
		// 다차원 배열
		
		//고정길이 생성
		int[][] su;
		su = new int[2][3];   // 전체 2개짜리가 3개씩 가지고 있다.
		
		su[0][0] = 10;
		su[0][1] = 20;
		su[0][2] = 30;
		
		su[1][0] = 100;
		su[1][1] = 200;
		//su[1][2] = 300;
		
		//id 확인
		System.out.println(su);
		System.out.println(su[0]);
		System.out.println(su[1]);
		
		System.out.println();
		
		//고정길이와 가변길이 배열의 출력
		for(int i = 0; i < su.length; i++) {
			for (int j = 0; j < su[i].length; j++) {
				System.out.print(su[i][j] + " ");
			}
			System.out.println();
		}
		
		
		
		
		
	}
}
