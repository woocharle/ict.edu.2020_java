package com.ict.edu;

public class Ex01 {
	public static void main(String[] args) {
		
		// 1. �迭 ����
		int[] su ;
		// 2. �迭 ����
		su = new int[4];
		// 3. ������ ����
		su[0] = 100;
		su[1] = 200;
		su[2] = 'a';
		//su[3] = 3.14;  ū �ڷ����� ���� �ڷ����� ���� �Ұ�.
		su[3] = 300;
		su[1] = 1000; //������ �ߺ�����.
		
		System.out.println(su);
		
		//�迭 �ȿ� �ִ� ������ ����ϱ� 
		System.out.println(su[0]);
		System.out.println(su[1]);
		System.out.println(su[2]);
		System.out.println(su[3]);
		System.out.println();
		 
		for (int i = 0; i < su.length; i++) {
			if(i == 2) {
				System.out.println((char)(su[i]));
			}
			else {
				System.out.println(su[i]);
			}
		}
		
		System.out.println();
		
		for (int i : su) {				//su�� �ϳ����� ������ i�� �������
			System.out.println(i);
		}
		
		
		
		
	}
}
