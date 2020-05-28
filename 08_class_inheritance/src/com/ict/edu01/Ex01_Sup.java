package com.ict.edu01;

// �θ� Ŭ����
public class Ex01_Sup {
	String name = "ȫ�浿";
	int age = 57;
	protected String addr = "����";
	private String dog = "�����";
	static int car = 1;
	static final boolean GENDER = true;
	
	public Ex01_Sup(){
		System.out.println("�θ�Ŭ���� ������ : " + this);
	}
	
	public void prn1() {
		System.out.println("�θ�Ŭ���� �޼ҵ�");
	}
	public static void prn2() {
		System.out.println("�θ�Ŭ���� static �޼ҵ�");
	}
	
}
