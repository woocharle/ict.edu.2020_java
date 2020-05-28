package com.ict.edu05;

public abstract class Animal {
	/* �߻��̶�? ��ü���� ������ ����.
	 
	   �߻� Ŭ���� : �߻�޼ҵ带 ������ �ִ� Ŭ����.
					 �Ϲ����� ����ʵ�� ����޼ҵ嵵 ������ ���� �� �ִ�.
					 class �տ��� abstract�� ���δ�.
	
	   �߻� �޼ҵ�: body�� ���� �޼ҵ�({}�� ���� �޼ҵ�)�� �߻� �޼ҵ�.
	   			    �ݵ�� abstract ���� ����Ѵ�. (void�� �ڷ��� �տ� ����.)
					abstract�տ� static�� ���� �� ����.
					
	   * �߻�Ŭ������ ������� ���� �߿��ϴ�.
		  
		�߿�: �Ϲ� Ŭ������ �߻� Ŭ������ ��� ���� �� �ݵ�� �θ��� �߻�޼ҵ带 �������̵��ؼ� body�κ��� �����.
		  
	*/
	//General member field
	int su1 = 10;
	static int su2 = 20;
	final int SU3 = 30;
	static final int SU4 = 40;
	
	
	//General member method
	public void play() {
		su1++;
		su2++;
		//SU3++;
		//SU4++;
	}
	
	public static void prn() {
		int k1 = 100;
		//static int k2 = 200;
		
		//su1 ����
		//su2 ok
		//SU3 error
		//SU4 ok
		
		//System.out.println(su1);
		System.out.println(su2);
		//System.out.println(SU3);
		System.out.println(SU4);
		
	}
	// �߻�޼ҵ�� �ݵ�� abstract�� �ٿ��� �Ѵ�.
	public abstract void like();
	
	
	
	
	
	
	
	
	
	
	
}
