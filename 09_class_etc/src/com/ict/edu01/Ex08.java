package com.ict.edu01;

class Cla_A{
	public void method_A(Cla_B b) {
		b.method_B();
	}

	public void method_K(Cla_C c) {
		c.method_C();
	}
	

}

class Cla_B{
	public void method_B() {
		System.out.println("Hello world");
	}
}


abstract class Cla_C{
	abstract void method_C();
}

public class Ex08 {
	public static void main(String[] args) {
		Cla_A test1 = new Cla_A();
		Cla_B test2 = new Cla_B();
		test1.method_A(test2);
		System.out.println("============================================================");
		
		Cla_A test3 = new Cla_A();
		test3.method_A(new Cla_B());
		
		Cla_A test4 = new Cla_A();
		test4.method_K(new Cla_C() {
			@Override
			void method_C() {
				System.out.println("환영합니다.");  //추상 메소드인 Cla_C를 완성기킴.ㄴ
				
			}
		});
	}
	
}
