package com.ict.edu;

import java.util.Arrays;

public class Ex07 {
	public static void main(String[] args) {
		// ������ �迭
		
		//�������� ����
		int[][] su;
		su = new int[2][3];   // ��ü 2��¥���� 3���� ������ �ִ�.
		
		su[0][0] = 10;
		su[0][1] = 20;
		su[0][2] = 30;
		
		su[1][0] = 100;
		su[1][1] = 200;
		//su[1][2] = 300;
		
		//id Ȯ��
		System.out.println(su);
		System.out.println(su[0]);
		System.out.println(su[1]);
		
		System.out.println();
		
		//�������̿� �������� �迭�� ���
		for(int i = 0; i < su.length; i++) {
			for (int j = 0; j < su[i].length; j++) {
				System.out.print(su[i][j] + " ");
			}
			System.out.println();
		}
		
		
		
		
		
	}
}
