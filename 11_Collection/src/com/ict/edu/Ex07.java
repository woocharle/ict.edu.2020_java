package com.ict.edu;

import java.util.TreeSet;

public class Ex07 {
	public static void main(String[] args) {
		// 로또번호 
		TreeSet<Integer> lotto = new TreeSet<Integer>();
	
		int n = 0;
		while(n < 6) {
			int k = (int)(Math.random() * 45) + 1;
			if(lotto.add(k)) {
				n++;
			}
		}
		
		System.out.println(lotto);
		
		lotto.clear();
		
		for (int j = 0; j < 6; j++) {
			int k = (int)(Math.random() * 45) + 1;
			if(! lotto.add(k)) {
				j--;
			}
		}
		
		System.out.println(lotto);
		
	}
}
