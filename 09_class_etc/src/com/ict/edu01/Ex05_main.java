package com.ict.edu01;

import com.ict.edu01.Ex05.Inner02;

public class Ex05_main {
	public static void main(String[] args) {
		Ex05 e5 = new Ex05();
		System.out.println(e5.name);
	
		e5.play();
	
		System.out.println("---------------------------------------------");
		
		//member ����Ŭ����
		Ex05.Inner01 inner01 = new Ex05().new Inner01(); 
		// �߿�: ������ ������ ��� �Ұ��� ���� ���ó�� �ܺ�Ŭ������ ����Ŭ������ �ҷ����� �����̴�. 
		
		System.out.println("---------------------------------------------");
		
		
		Ex05.Inner01 inner02 = e5.new Inner01();
		inner02.prn();
	
		System.out.println(Inner02.a3);
		System.out.println(Inner02.a4);
		Inner02.go2();
		System.out.println("---------------------------------------------");
		
		Inner02 test = new Inner02();
		
		
		
	}
}
