package com.ict.edu;

public class Ex14 {
	//static: ��ü ������ ������� �̸� ������� �ʵ�� �޼ҵ�
	/*		  Ŭ������ ������������ ��� �� �� ����.
	 
	 */
	int su = 10;  //�ν��Ͻ� ���� 
	static int num = 10;	//static ����, Ŭ���� ����
	
	public Ex14() {
		su++;
		num++;
	}
	
	public void sum(int k1, int k2) {
		su = k1 + k2;
	}
	
	//static method
	public static void add(int k1, int k2) {
		num = k1 + k2;
		double pi = 3.14;
		
	}
	
}
