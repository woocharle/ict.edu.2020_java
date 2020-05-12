package com.ict.edu;

public class Ex04 {
	public static void main(String[] args) {
		//순위구하기
		
		int[] su = {90, 85, 70, 90, 95, 80};
		int[] rank = new int[su.length];
		for(int i = 0; i < su.length; i++) {
			rank[i] = 1;
		}
		
		for (int i = 0; i < rank.length; i++) {
			for(int j = 0; j <su.length; j++) {
				if(su[i] < su[j]) {
					rank[j]++;
				}
				
			}
		}
		
		for (int k : rank) {
			System.out.print(k + " ");
		}
	}
}
