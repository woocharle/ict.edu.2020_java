package com.ict.edu;

public class Ex02 {
	public static void main(String[] args) {
		char[] ch = new char[4];
		
		ch[0] = 'J';
		ch[1] = 'A';
		ch[2] = 'V';
		ch[3] = 65;  // int����, character ������ �� ���ڴ� �Է��� �� �ִ�.
		
		System.out.println("�Ϲ� for��");
		for (int i = 0; i < ch.length; i++) {
			System.out.println(ch[i]);
		}
		System.out.println();
		
		System.out.println("������ for��");
		for (char i : ch) {
			System.out.println(i);
		}
		System.out.println();
		
		//����, ����, ������ ���� �ѹ�ü
		
		char[] ch2 = {'j', 'a', 'v', 'a'};
		int[] k2 = {100, 200, 300, 400};
		double[] d2 = {3.14, 71.0 , 42.1};
		String[] str = {"ȫ�浿", "�̱浿", "�Ӳ���", "������"};
		
		for(String k : str) {
			System.out.println(k);
		}
		System.out.println();
		
		
		
		
		
	}

}
