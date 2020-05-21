package com.ict.edu;

import java.util.HashSet;
import java.util.Scanner;

public class Ex05_main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashSet<Ex05> person = new HashSet<Ex05>();
			
		loop: while(true) {
				Ex05 p = new Ex05();
				
				System.out.print("이름: ");
				String name = sc.next();
				System.out.print("국어: ");
				int kor = sc.nextInt();
				System.out.print("영어: ");
				int eng = sc.nextInt();
				System.out.print("수학: ");
				int math = sc.nextInt();
				
				p.setName(name);
				p.s_sum(kor, eng, math);
				
				person.add(p);
			
				loop1: while(true) {
						System.out.print("계속 할 까요? (y/n)=> ");
						String ans = sc.next();
						
						if(ans.equalsIgnoreCase("y")) {
							continue loop;
						}
						else if(ans.equalsIgnoreCase("n")) {
							break loop;
						}
						else {
							System.out.println("y아니면 n을 넣으시오.");
							continue loop1;
						}
					
				}
			
		}
		
		// 순위
		for(Ex05 j: person) {
			for(Ex05 k : person) {
				if(j.getSum() < k.getSum()) {
					j.setRank(j.getRank() + 1);
				}
			}
		}
		
	
		
		// 출력
		for (Ex05 k : person) {
			System.out.print(k.getName() + "  ");
			System.out.print(k.getSum() + "  ");
			System.out.print(k.getAvg() + "  ");
			System.out.print(k.getHak() + "  ");
			System.out.print(k.getRank() + "  ");
			System.out.println();
		}
		
		
		
		
	}
}
