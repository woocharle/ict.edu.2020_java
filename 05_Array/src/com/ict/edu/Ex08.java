package com.ict.edu;

public class Ex08 {
	public static void main(String[] args) {
		char[][] ch = new char[3][2];
		
		ch[0][0] = 'a';
		ch[0][1] = 'A';
		
		ch[1][0] = 'b';
		ch[1][1] = 'B';
		
		ch[2][0] = 'c';
		ch[2][1] = 'C';
		
		
		for (int i = 0; i < ch.length; i++) {
			for(char k : ch[i]) {
				System.out.print(k + " ");
			}
			System.out.println();
		}
		
		int[][] k1 = {{1, 2}, {10, 20}, {100, 2000}};
		char[][] k2 = {{'a', 'A'}, {'b', 'B'}, {'c', 'C'}};
		String[][] k3 = {{"java", "jsp", "android"}, {"html", "css", "js"}};
		
		for (int i = 0; i < k3.length; i++) {
			for(String k : k3[i]) {
				System.out.print(k + " ");
			}
			System.out.println();
		}
		
		System.out.println("========================================================\n");
		
		System.out.println("1차원 배열을 만들어서 배열에 넣기(고정길이, 가변길이 모두 사용)");
		
		int[][] su = new int[2][4];
		
		int[] s1 = {1, 2, 3, 4};
		int[] s2 = {10, 20 ,30, 40};
		
		su[0] = s1;
		su[1] = s2;
		
		
		for (int i = 0; i < su.length; i++) {
			for(int k : su[i]) {
				System.out.print(k + " ");
			}
			System.out.println();
		}
		
		
		
		
		
	}
}
