package com.ict.edu;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

// 3���� �̸�, ����, ����, ���� ������ �޾Ƽ� ����, ���(�Ҽ��� ù°�ڸ�), ���� ���� ����ϴ� Ŭ������ ����ÿ�.

public class Ex04_main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashSet<Ex04> std = new HashSet<Ex04>();
		
	
		for (int i = 0; i < 3; i++) {
			System.out.print("�̸�: ");
			String name = sc.next();
			System.out.print("����: ");
			int kor = sc.nextInt();
			
			System.out.print("����: ");
			int eng = sc.nextInt();
			
			System.out.print("����: ");
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
			System.out.print("�̸�: " + stby[i].getName() + "  ");
			System.out.print("����: " + stby[i].getSum() + "  ");
			System.out.print("���: " + stby[i].getAvg() + "  ");
			System.out.print("����: " + stby[i].getGrd() + "  ");
			System.out.print("����: " + stby[i].getRank() + "  ");
			System.out.println();
		}
		
		System.out.println("=========================================");
		
		/*
		for (int i = 0; i < stby.length; i++) {
			std.add(stby[i]);
		}

		for(Ex04 k : std) {
			System.out.print("�̸�: " + k.getName() + "  ");
			System.out.print("����: " + k.getSum() + "  ");
			System.out.print("���: " + k.getAvg() + "  ");
			System.out.print("����: " + k.getGrd() + "  ");
			System.out.print("����: " + k.getRank() + "  ");
			System.out.println();
		}
		
		
		
		
		System.out.println("=========================================");
		
		
		Iterator<Ex04> it = std.iterator(); 

		while (it.hasNext()) {
			Ex04 res = (Ex04) it.next();
			System.out.print("�̸�: " + res.getName() + "  ");
			System.out.print("����: " + res.getSum() + "  ");
			System.out.print("���: " + res.getAvg() + "  ");
			System.out.print("����: " + res.getGrd() + "  ");
			System.out.print("����: " + res.getRank() + "  ");
			System.out.println();
		}
		
		*/
		
	}
}
