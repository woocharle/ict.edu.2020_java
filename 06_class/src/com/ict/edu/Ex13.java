package com.ict.edu;

public class Ex13 {
	//this �� this()
	
	/* this() : ��ü�� �����ڸ� ��Ī�ϴ� �����.
	  			�����ڿ��� �ٸ� �����ڸ� ȣ�� �� �� �̿�. (����) 
	 			�ݵ�� �������� ù��° �ٿ� �;� �Ѵ�. (����)			
	 */
	
	String name ="��浿";
	int age = 37;
	
	public Ex13() {
		//System.out.println("�⺻ ������ : " + this);
		this("������", 24); 			//���÷� ��Ʈ�� ����
	}
	public Ex13(String name) {
		this.name = name;
	}
	public Ex13(int age) {
		this.age = age;
	}
	public Ex13(String name, int age) {
		// this()							this()�� �� ���� ��
		this.name = name;
		this.age = age;
	}
	
	
	// getter / setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
}
