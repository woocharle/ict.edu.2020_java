package com.ict.edu;

public class Ex01 {
	/* ��Ӱ���: �ڽ�Ŭ������ �θ� Ŭ������ ����ʵ�, ����޼ҵ帣 ��ü �������� 
				������� ����� �� �ִ� Ŭ�������� ���踦 ���Ѵ�.
	   			�ڽ�Ŭ������ �θ�Ŭ������ ���踦 �δ´�.
	   			�ڽ�Ŭ���� extends �θ�Ŭ����
	   �ڹٿ����� ���� ����� �� �� ����. �� �θ�Ŭ������ �ϳ��� ����.
	   ��� Ŭ������ Object��� Ŭ������ ��ӹް� �ִ�. 
	*/
	public static void main(String[] args) {
		Ex01_Sub test = new Ex01_Sub();
		
		System.out.println(test);
		System.out.println("============================================");
		test.play();
		
		test.prn1();
		
		//static�� ��Ӱ� ������� ����
		
		System.out.println(Ex01_Sup.car);
		System.out.println(Ex01_Sup.GENDER);
		Ex01_Sup.prn2();
		
		
		
	}
	
}
