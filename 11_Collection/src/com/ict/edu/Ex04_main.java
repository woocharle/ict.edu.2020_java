package com.ict.edu;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

// 3명의 이름, 국어, 영어, 수학 점수를 받아서 총점, 평균(소수점 첫째자리), 학점 등을 출력하는 클래스를 만드시오.

public class Ex04_main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashSet<Ex04> std = new HashSet<Ex04>();
		
	
		for (int i = 0; i < 3; i++) {
			System.out.print("이름: ");
			String name = sc.next();
			System.out.print("국어: ");
			int kor = sc.nextInt();
			
			System.out.print("영어: ");
			int eng = sc.nextInt();
			
			System.out.print("수학: ");
			int mat = sc.nextInt();
			
			std.add(new Ex04(name, kor, eng, mat));
			
		}
		
		Iterator<Ex04> it = std.iterator();
		while (it.hasNext()) {
			Ex04 ex04 = (Ex04) it.next();
			
		}
		
		
		for(Ex04 k : std) {
			for (Ex04 l : std) {
				if(k.getAvg() < l.getAvg()) {
					k.s_rank();
				}
			}
		}
		
		Ex04[]stby = std.toArray(new Ex04[std.size()]);
	    std.clear();
	   	
	    
		Ex04 tmp = new Ex04();
		
		for (int i = 0; i < stby.length; i++) {
			for (int j = 0; j < stby.length; j++) {
				if(stby[i].getAvg() > stby[j].getAvg()) {
					tmp = stby[i];
					stby[i] = stby[j];
					stby[j] = tmp;
						
				}
			}
		}
		
		for (int i = 0; i < stby.length; i++) {
			System.out.print("이름: " + stby[i].getName() + "  ");
			System.out.print("총점: " + stby[i].getSum() + "  ");
			System.out.print("평균: " + stby[i].getAvg() + "  ");
			System.out.print("성적: " + stby[i].getGrd() + "  ");
			System.out.print("순위: " + stby[i].getRank() + "  ");
			System.out.println();
		}
		
		System.out.println("=========================================");
		
		/*
		for (int i = 0; i < stby.length; i++) {
			std.add(stby[i]);
		}

		for(Ex04 k : std) {
			System.out.print("이름: " + k.getName() + "  ");
			System.out.print("총점: " + k.getSum() + "  ");
			System.out.print("평균: " + k.getAvg() + "  ");
			System.out.print("성적: " + k.getGrd() + "  ");
			System.out.print("순위: " + k.getRank() + "  ");
			System.out.println();
		}
		
		
		
		
		System.out.println("=========================================");
		
		
		Iterator<Ex04> it = std.iterator(); 

		while (it.hasNext()) {
			Ex04 res = (Ex04) it.next();
			System.out.print("이름: " + res.getName() + "  ");
			System.out.print("총점: " + res.getSum() + "  ");
			System.out.print("평균: " + res.getAvg() + "  ");
			System.out.print("성적: " + res.getGrd() + "  ");
			System.out.print("순위: " + res.getRank() + "  ");
			System.out.println();
		}
		
		*/
		
	}
}
