package com.ict.edu;

import java.util.Scanner;

public class Ex08_main {
	public static void main(String[] args) {
		Ex08 coffee = new Ex08();
		coffee.setName("커피음료");
		coffee.setPrice(1000);
		
		Ex08 ion = new Ex08();
		ion.setName("이온음료");
		ion.setPrice(1500);
		
		Ex08 cola = new Ex08();
		cola.setName("탄산음료");
		cola.setPrice(1200);
		
		Ex08 juice = new Ex08();
		juice.setName("과일쥬스");
		juice.setPrice(2000);
		
		/*
		
		drink[0] = coffee;
		drink[1] = ion;
		drink[2] = cola;
		drink[3] = juice;
		*/
		
		Ex08[] menu= {coffee, ion, cola, juice};
		
		Scanner sc = new Scanner(System.in);
		System.out.print("금액을 투입해주세요.  ");
		int input = sc.nextInt();
		
		if (input < 1000) {
			System.out.println("금액이 부족합니다.");
		}else {
			System.out.println("커피음료\t이온음료\t탄산음료\t과일음료");
			for (int i = 0; i < menu.length; i++) {
				if(input >= menu[i].getPrice()) {
					System.out.print("    o     \t");
				}else {
					System.out.println("    x     \t");
				}
			}
			System.out.println();
			System.out.print("선택하세요. >>  ");
			String drink = sc.next();
			
			int output = 0;
			for (int i = 0; i < menu.length; i++) {
				if(menu[i].getName().contains(drink)) {
					output = input - menu[i].getPrice();
				}
			}
			
			System.out.println("잔돈: " + output);
			
		}

		

		
		
		
		
		
	}
}
