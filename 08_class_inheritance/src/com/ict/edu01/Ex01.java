package com.ict.edu01;

public class Ex01 {
	/* ��Ӱ���: �ڽ�Ŭ������ �θ� Ŭ������ ����ʵ�, ����޼ҵ帣 ��ü �������� 
				������� ����� �� �ִ� Ŭ�������� ���踦 ���Ѵ�.
	   			�ڽ�Ŭ������ �θ�Ŭ������ ���踦 �δ´�.
	   			�ڽ�Ŭ���� extends �θ�Ŭ����
	   �ڹٿ����� ���� ����� �� �� ����. �� �θ�Ŭ������ �ϳ��� ����.
	   ��� Ŭ������ Object��� Ŭ������ ��ӹް� �ִ�. 
	   
	   
	   super: �θ�Ŭ������ ����ʵ带 ��Ī�ϴ� �����
	   		  �ڽ�Ŭ������ ���������� �̸��� ���� �� 
	   		  �θ�Ŭ���� ����ʵ� �տ� ����Ѵ�.
	   
	   super([����]): �θ��� �����ڸ� ��Ī�ϴ� �����
	   				  �θ� �����ڸ� ȣ���� �� ���, �ݵ�� ������ ù�ٿ� �����ؾ��Ѵ�. 
	   				  this()�� ���� ����� �� ����.
	   				  sub Ŭ������ �����ڸ� ������ �� super([���� ����])�� ������ ������, �����Ǿ��ִ�.
	   
	   �������̵�: ��Ӱ��迡�� �θ� �޼ҵ�� �ڽ� �޼ҵ尡 ���� ��.
	   			   �̶� �ڽ�Ŭ������ �θ�޼ҵ带 ���� ���� ��ſ� ������ �ڱ⿡ �°� �����ؼ� ����ϴ� ��.
	   			   �θ�޼ҵ尡 ��������. 
	   			   - ����ȭ(ĸ��ȭ): �θ�޼ҵ尡 ��������.
	   			   - ������: ���� �޼ҵ帣 ȣ���ص� �ٸ� ������ �����Ѵ�.	   
	   			   - Sub_class�� ctrl + space�� ������ �������̵��� �� �θ� Ŭ������ ã�� �� �ִ�.
	   			   - Super_class�� �޼ҵ� ���� final�� ���̸� �������̵��� �� �ȴ�. final: ����, ���� �ǹ̰� �ִ�.\
	   			   - final class�� ����� �� �ȴ�. final method => �������̵��� �� ��. final ���� => �� ������ �� ��.
	   
	   
	   
	   com.int.edu2: ��� ����1 
	   com.int.edu3: ��� ����2
	   com.int.edu4: ��� ����3 
	   com.int.edu5: abstract class/method ���� �� ����1
	   com.int.edu6: abstract class/method ����2
	   com.int.edu7: abstract class/method ����3
	   com.int.edu8: interface ���� �� ����
	   com.int.edu9: interface ���߻���� ��
	   
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
