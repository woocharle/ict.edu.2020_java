package com.ict.edu;

import java.util.Random;
import java.util.Scanner;

public class Q01 {
	public static void main(String[] args) {
		//Quiz : 010-7777-9999 => 010-7777-XXXX�� �ٲ��.
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		String quiz = "010-7777-9999";
		String ans = quiz.substring(quiz.indexOf("-", quiz.indexOf("-") + 1) + 1, quiz.length());
		ans = quiz.replace(ans, "XXXX");
		
		System.out.println(ans);
		System.out.println();
		System.out.println("===================================================================");
		
		// 1. ���� / ���� ���߱�
		// �Է�: ����, random�� ������ Ȧ�� �� ���� ¦�� �� ����
		
		System.out.println("ù��° ����");
		
		int num = ran.nextInt();
		
		System.out.println(num);
		if(num % 2 ==0) {
			System.out.println("����");
		}
		else {
			System.out.println("����");
		}
		System.out.println();
		
		// 2. random�� ������ 0 ~ 6 �̸� ���� 8 ~ 13�̸� ����, 7�̸� ���
		
		System.out.println("�ι�° ����");
		
		num = (int)(Math.random() * 13 + 1);
		
		if(num >= 0 && num <= 6) {
			System.out.println("����");
		}
		else if(num == 7){
			System.out.println("���");
		}
		else if(num >= 8 && num <= 13){
			System.out.println("����");
		}
		
		// ���� ���� �� 
		
		loop:while(true) {
				System.out.println("����, ����, ���� �����մϴ�.");
				System.out.print("�Է��Ͻÿ� => ");
				String str = sc.next();
				
				if(str.equals("����") == false) {
					if(str.equals("����") == false) {
						if(str.equals("��") == false) {
							System.out.println("����, ����, �� �� ������ �� �ϳ��� �Է��ϼ���.");
							continue loop;
						}
					}
				}

				String com = "";
				
				num = (int)(Math.random() * 3);
				if(num == 0) {
					com = "����";
				}
				else if(num == 1) {
					com = "����";
				}
				else if(num == 2) {
					com = "��";
				}
				
				String res="";
				
				switch (str) {
					case "����":
						switch (com) {
							case "����": res = "�����ϴ�."; break;
							case "����": res = "�����ϴ�."; break;
							case "��": res = "�̰���ϴ�."; break;
								
							}
					case "����":
						switch (com) {
						case "����": res = "�̰���ϴ�."; break;
						case "����": res = "�����ϴ�."; break;
						case "��": res = "�����ϴ�."; break;
						
						}
					case "��":
						switch (com) {
						case "����": res = "�����ϴ�."; break;
						case "����": res = "�̰�ϴ�."; break;
						case "��": res = "�����ϴ�."; break;
						
						}
		
				}
				
				System.out.println(res);
				
				loop1: while(true) {
							System.out.print("��� �Ͻðڽ��ϱ�? (1.��  2.�ƴϿ�)");
							num = sc.nextInt();
							if(num == 1) {
								continue loop;
							}
							else if(num ==2) {
								break loop;
							}
							else {
								System.out.println("1�� 2�� �ϳ��� �Է��Ͻÿ�.");
								continue loop1;
							}
					
						}
					
			}
		
	}
	
	

	
	  

	// 3. ���� ������ ����
	// �Է�: ����
	// ���: ���, �̱�, ��.
	
	
}
