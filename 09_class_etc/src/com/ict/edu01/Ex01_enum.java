package com.ict.edu01;

// ������(enum): ����� �ϳ��� ��ü�� �ν��ϰ�, �������� ��� ��ü���� �� ���� ��Ƶ� �ϳ��� ����.
//				 ���� ��ȹ �� ���� ��Ŭ������ �ٷ�� ����� ���� �Ϲ� �����ڴ� �� ��.
public class Ex01_enum {
	static final int JAVA = 200;
	static final int HTML = 1000;
	public enum Lesson{
		// static final�� ����.
		JAVA, JSP, SPRING, ANDROID, HTML
	}
	
	public static void main(String[] args) {
	
		Lesson s1 = Lesson.JAVA;
		System.out.println("s1 : " + s1);
		System.out.println("JAVA: " + Ex01_enum.JAVA);
		System.out.println("=========================================================================");
		System.out.println("HTML: " + Ex01_enum.HTML);
		System.out.println("HTML: " + Lesson.HTML);
		System.out.println("=========================================================================");
		
		Lesson[] items = Lesson.values();
		
		// ordinal: index����, ��Ÿ��.
		for(Lesson k : items) {
			System.out.println(k + ":" + k.ordinal());
		}
		
		
	}
	
	
}
