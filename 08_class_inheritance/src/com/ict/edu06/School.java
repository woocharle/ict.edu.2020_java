package com.ict.edu06;

public class School {
	public static void main(String[] args) {
		Person s = new Student("�������л�", 15, 25000);
		Person t = new Teacher("��ȣ�߰���", 30, "�ڹ�");
		Person e = new Employee("�輺�ְ�����", 40, "������");
		
		s.print();
		t.print();
		e.print();
	
		
	}
}
