package com.ict.edu;

public class Ex04 {
	public static void main(String[] args) {
		
		// char k1�� A�̸� ������ī, B�̸� �����, C�̸� ĳ���� ������ �ѱ�
		char k1 = 'A';
		String res;
		
		switch (k1) {
		case 'A':
			res = "������ī";
			break;
		case 'B':
			res = "�����";
			break;
		case 'C':
			res = "ĳ����";
			break;

		default:
			res = "�ѱ�";	
			break;
		}
		
		System.out.println(res);
		
		// char k2�� A,a�̸� ������ī, B,b�̸� �����, C,c�̸� ĳ���� ������ �ѱ�
		
		char k2 = 'a';
		res = "";
		
		switch (k2) {
		case 'A':
		case 'a': res = "������ī";	break;
		case 'B':
		case 'b': res = "�����"; break;
		case 'C':
		case 'c': res = "ĳ����"; break;
		default: res = "�ѱ�"; break;
		}
		
		System.out.println(res);
		
		
		
		// k3�� 1 �Ǵ� 3�̸� ����, 2 �Ǵ� 4�̸� ���� 
		
		int k3 = 1;
		String gender = "�ʱ�ȭ";
		
		switch (k3) {
		case 1: 
		case 3: gender = "����"; break;
		case 2: 
		case 4: gender = "����"; break;
		default: gender = "��"; break;
		}
		
		System.out.println("����: " + gender);
		
		
		// k4�� �ѱ� = ����, �߱� = �ϰ�, �Ϻ� = ����, �̱� = ������
		
		String k4 = "�ѱ�";
		String nation = "����";
		
		switch (k4) {
		case "�ѱ�": nation = "����"; break;
		case "�߱�": nation = "�ϰ�"; break;
		case "�Ϻ�": nation = "����"; break;
		case "������": nation = "������"; break;
		default: break;
		}
		
		System.out.println(k4 + "�� ������ " + nation);
		
		/*menu�� 1�̸� ī���ī 3500, 2�̸� ī��� 4000, 3�̸� �Ƹ޸�ī�� 3000,
		 �̸� �����꽺 3500�̴�. ģ���� 2���� 10000 ���� �Ծ���. �ܵ��� ���ΰ�? (�ΰ��� 10% ����.)*/
		
		int k5 = 2;
		int price = 0;
		String menu = "����";
		
		switch (k5) {
		case 1: menu = "ī���ī"; price = 3500; break;
		case 2: menu = "ī���"; price = 4000; break;
		case 3: menu = "�Ƹ޸�ī��"; price = 3000; break;
		case 4: menu = "�����꽺"; price = 3500; break;
		}
		
		int pp = 2;
		int pay = 10000;
		int cng = pay - (int)(pp * price * 1.1); 
		
		System.out.println("�޴��� " + menu + "�Ž������� " + cng);
		
	    //k6�� ������ 90�̻��̸� A, 80�̻��̸� B, 70�̻��̸� C, �������� F
		//switch case�� ������ ���Ϸ��� �Ʒ�ó�� ������ �ؾ� �ȴ�.
		
		int k6 = 97;
		k6 = k6 / 10;
		switch (k6) {
		case 10: 
		case 9:  res = "A"; break;
		case 8:  res = "B"; break;
		case 7:  res = "C"; break;
		default: res = "F"; break;
		}
		
		System.out.println("������ " + res);
		
	}
}