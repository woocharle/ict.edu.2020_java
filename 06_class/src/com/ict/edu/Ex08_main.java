package com.ict.edu;

import java.util.Scanner;

public class Ex08_main {
	public static void main(String[] args) {
		Ex08 coffee = new Ex08();
		coffee.setName("Ŀ������");
		coffee.setPrice(1000);
		
		Ex08 ion = new Ex08();
		ion.setName("�̿�����");
		ion.setPrice(1500);
		
		Ex08 cola = new Ex08();
		cola.setName("ź������");
		cola.setPrice(1200);
		
		Ex08 juice = new Ex08();
		juice.setName("�����꽺");
		juice.setPrice(2000);
		
		/*
		
		drink[0] = coffee;
		drink[1] = ion;
		drink[2] = cola;
		drink[3] = juice;
		*/
		
		Ex08[] menu= {coffee, ion, cola, juice};
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�ݾ��� �������ּ���.  ");
		int input = sc.nextInt();
		
		if (input < 1000) {
			System.out.println("�ݾ��� �����մϴ�.");
		}else {
			System.out.println("Ŀ������\t�̿�����\tź������\t��������");
			for (int i = 0; i < menu.length; i++) {
				if(input >= menu[i].getPrice()) {
					System.out.print("    o     \t");
				}else {
					System.out.println("    x     \t");
				}
			}
			System.out.println();
			System.out.print("�����ϼ���. >>  ");
			String drink = sc.next();
			
			int output = 0;
			for (int i = 0; i < menu.length; i++) {
				if(menu[i].getName().contains(drink)) {
					output = input - menu[i].getPrice();
				}
			}
			
			System.out.println("�ܵ�: " + output);
			
		}

		

		
		
		
		
		
	}
}
