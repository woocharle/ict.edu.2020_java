package com.ict.edu;

public class Ex09 {
	public static void main(String[] args) {
		char[][] ch = new char[3][];

		char[] s1 = {'j', 'a', 'v', 'a'};
		char[] s2 = {'j', 's' , 'p'};
		char[] s3 = {'A', 'n', 'd', 'r' , 'o', 'i','d'};
		
		ch[0]= s1;
		ch[1]= s2;
		ch[2]= s3;

		for (int i = 0; i < ch.length; i++) {
			for (char k : ch[i]) {
				System.out.print(k + " ");
			}
			System.out.println();
		}
		
		
		
		
	}
}
