package com.ict.edu;

public class Ex01 {
	public static void main(String[] args) {
		int k1 = 59;
		String str = "���հ�";
		if(k1 >= 60) {
			str = "�հ�";
		}
		
		System.out.println("���: " + str);
		System.out.println("�����ϼ̽��ϴ�.");
		
		
		// Ȧ¦ �Ǻ�
		int k2 = 59;
		str = "¦��";
		if(k2 % 2 == 1) {
			str = "Ȧ��";
		}
		
		System.out.println("���: " + str);
		System.out.println("�����ϼ̽��ϴ�.");		
		
		
		// �빮�� �ҹ��� �Ǻ�
		
		char k3 = '1';
		str = "�ʱ�ȭ";
		
		if(k3 >= 'a' && k3 <= 'z') {
			str = "�ҹ���";
		}
		else if(k3 >= 'A' && k3 <= 'Z'){
			str = "�빮��";
		}
		else {
			str = "��Ÿ";
		}
		
		System.out.println("���: " + str);
		System.out.println("�����ϼ̽��ϴ�.");	
		
		// 1 �Ǵ� 3�̸� ����, �ƴϸ� ����
		
		int k4 = 1;
		
		if(k4 == 1) {
			str = "1900��� ����";
		}
		else if(k4 == 2){
			str = "1900��� ����";
		}
		else if(k4 == 3){
			str = "2000��� ����";
		}
		else if(k4 == 4){
			str = "2000��� ����";
		}
		else {
			str = "��Ÿ";
		}
		
		System.out.println("���: " + str);
	
		int time = 10;
		int dan = 8590;
		int pay = 0;
		
		if(time < 10) {
			pay = time * dan;
		}
		else {
			pay = (int)((time - 8) * dan * 1.5) + 8 * dan;
		}
		
		System.out.println("���: " + pay);	
		
		// �� �� �� ū ��
		
		int k7 = 10;
		int k8 = 15;
		int result; 
		
		if(k7 < k8) {
			result = k8;
		}
		else if(k7 > k8){
			result = k7;			
		}
		else {
			result = 0;
		}	
		
		if(result != 0) {
			System.out.println("���: " + result);	
		}
		else {
			System.out.println("���: equal");	
		}
			
		
		
		
		
		
		
		
		
		
		
		
	}
}