package com.ict.edu;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է�: ");
		int su = sc.nextInt();
		String result = "";
		if(su % 2 == 0) {
			result = "¦��";
		}
		if(su % 2 != 0) {
			result = "Ȧ��";
		}
		
		System.out.println("���: " + result);
		System.out.println();
		
		//�ٹ��ð� 
		
		System.out.print("�����Է� : 1.�ѱ�, 2.�߱�, 3.�Ϻ� >> ");
		String nation = sc.next();
		String cpt = "";
		
		switch (nation) {
		case "�ѱ�":	cpt = "����";	break;	
		case "�߱�":	cpt = "����¡";	break;	
		case "�Ϻ�":	cpt = "����";	break;
		default:		cpt = "data ����"; break;
		}
		
		System.out.println(nation + "�� ������ " + cpt);
		System.out.println();		
		
		
		System.out.print("�˹ٽð� : ");
		int time = sc.nextInt();
		int pay = 8590;
		int sal = 0;
		
		if (time > 8) {
			sal = (int)((time - 8) * 1.5 * pay) + 8 * 8590; 
		}
		else {
			sal = time * pay;
		}
		
		System.out.println("�ϴ��� " + sal);
		System.out.println();
		// menu
		
		System.out.print("menu ���� : \n 1.ī���ī(3500) \n 2.ī���(4000) \n"
				  			+ " 3.�Ƹ޸�ī��(3000)\n 4.�����꽺(3500) >> ");
		
		
		int cho = sc.nextInt();
		String menu = "";
		int pp = 2;
		int price = 0;
		int input = 10000;
	
		switch (cho) {
		case 1: menu = "ī���ī";	price = 3500;	break;
		case 2: menu = "ī���";	price = 4000;	break;
		case 3: menu = "�Ƹ޸�ī��";	price = 3000;	break;
		case 4: menu = "�����꽺";	price = 3500;	break;			
		default: break;	
		}
		
		int change = input - (int)(pp * price * 1.1); 
		
		System.out.println("�Ž������� " + change );
		
	
		
		
		
	}
	
}
