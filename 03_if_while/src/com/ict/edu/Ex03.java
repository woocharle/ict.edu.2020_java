package com.ict.edu;

public class Ex03 {
	public static void main(String[] args) {
		
		// ��,��
		
		int k1 = 85;
		String str = "�ʱ�ȭ";
		
		// k1�� ������ 90�̻��̸� A, 80�̻��̸� B, 70�̻��̸� C, ������ F
		
		if (k1 >= 90) {
			str = "A";
		}
		else if (k1 >= 80) {
			str = "B";
		}
		else if (k1 >= 70) {
			str = "C";
		}
		else {
			str = "F";
		}
		
		System.out.println(str);
		
		// �빮�� �ҹ���
		
		char k2 = '1';
		str = "�ʱ�ȭ";
		
		if (k2 >= 'a' && k2 <= 'z') {
			str = "�ҹ���";
		}	
		else if (k2 >= 'A' && k2 <= 'Z') {
			str = "�빮��";	
		} 
		else if (k2 >= '0' && k2 <= '9') {
			str = "����";	
		} 
		else {
			str = "��Ÿ";
		}
		
		System.out.println(str);
		
		// char k3�� A,a�̸� ������ī, B,b�̸� �����, C,c�̸� ĳ���� ������ �ѱ�
		
		char k3 = 'A';
		str = "�ʱ�ȭ";
		
		if (k2 == 'a' || k2 == 'A') {
			str = "������ī";
		}	
		else if (k2 == 'b' || k2 == 'B') {
			str = "�����";
		}	
		else if (k2 == 'c' || k2 == 'C') {
			str = "ĳ����";
		}	
		else {
			str = "�ѱ�";
		}
		
		System.out.println(str);
		
		/*menu�� 1�̸� ī���ī 3500, 2�̸� ī��� 4000, 3�̸� �Ƹ޸�ī�� 3000,
		 �̸� �����꽺 3500�̴�. ģ���� 2���� 10000 ���� �Ծ���. �ܵ��� ���ΰ�? (�ΰ��� 10% ����.)*/
		
		int friend = 2;
		int price = 0; 
		int choice = 1; 
		int money = 10000;
		str = "�ʱ�ȭ";
		
		if (choice == 1) {
			str = "ī���ī";
			price = (int)(friend * 3500 * 1.1);
		}	
		else if (choice == 2) {
			str = "ī���";
			price = (int)(friend * 4000 * 1.1);
		}	
		else if (choice == 3) {
			str = "�Ƹ޸�ī��";
			price = (int)(friend * 3000 * 1.1);
		}	
		else if (choice == 4) {
			str = "�����꽺";
			price = (int)(friend * 3500 * 1.1);
		}	
		
		System.out.println(str + "�� �� ���� �ܵ��� " + (money - price) + "��");
		
		int menu = 3;
		if(menu == 1) {
			int dan = 3500;
			String drink = "ī���ī";
			int su = 2;
			int total = dan * su;
			int vat = (int)(total * 0.1);
			int input = 10000;
			int output = input - (total + vat);
			System.out.println("�ܵ�: " + output);
		}
		else if(menu == 2) {
			int dan = 4000;
			String drink =  "ī���";
			int su = 2;
			int total = dan * su;
			int vat = (int)(total * 0.1);
			int input = 10000;
			int output = input - (total + vat);
			System.out.println("�ܵ�: " + output);
		}
		else if(menu == 3) {
			int dan = 3000;
			String drink = "�Ƹ޸�ī��";
			int su = 2;
			int total = dan * su;
			int vat = (int)(total * 0.1);
			int input = 10000;
			int output = input - (total + vat);
			System.out.println("�ܵ�: " + output);
		}
		else if(menu == 4) {
			int dan = 3500;
			String drink = "�����꽺";
			int su = 2;
			int total = dan * su;
			int vat = (int)(total * 0.1);
			int input = 10000;
			int output = input - (total + vat);
			System.out.println("�ܵ�: " + output);
		}
		
		// �����丵 1. �ߺ��� ��Ҹ� ����
		
		int su = 2;
		int dan = 0; 
		String drink = "�޴�"; 

		menu = 3;
		if(menu == 1) {
			dan = 3500;
			drink = "ī���ī";

		}
		else if(menu == 2) {
			dan = 4000;
			drink =  "ī���";

		}
		else if(menu == 3) {
			dan = 3000;
			drink = "�Ƹ޸�ī��";
		}
		else if(menu == 4) {
			dan = 3500;
			drink = "�����꽺";

		}
		
		int input = 10000;
		int total = dan * su;
		int vat = (int)(total * 0.1);
		int output = input - (total + vat);
		System.out.println("�ܵ�: " + output);
		
		
		
	}
}
