package com.ict.edu;

public class Ex06_main {
	public static void main(String[] args) {
		Ex06 e6 = new Ex06();
		
		System.out.println(e6.name);
		String s = e6.s_name();
		
		System.out.println(s);
		
		System.out.println(e6.age);
		
		int s1 = e6.s_age();
		System.out.println(s1);
		
		// weight�� private�̱� ������ �ٷ� ������ �� ������, �޼ҵ带 ���ؼ� �����Ѵ�.
		//System.out.println(e6.weight);
		double s2 = e6.s_weight();
		System.out.println(s2);
		System.out.println();
		
		// �̸��� �Ѹ���.
		
		 e6.re_name("�Ѹ�");
		 System.out.println(e6.name);
		 s = e6.s_name();
		 System.out.println(s);
		 System.out.println();
		
		 e6.re_age(5000);
		 System.out.println(e6.age);
		 s1 = e6.s_age();
		 System.out.println(s1);
		 System.out.println();
		 
		 e6.re_weight(10000);
		 s2 = e6.s_weight();
		 System.out.println(s2);
		 System.out.println();
		
	}
}
