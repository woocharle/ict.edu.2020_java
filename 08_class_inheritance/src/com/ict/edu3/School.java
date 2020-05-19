package com.ict.edu3;

public class School {
	public static void main(String[] args) {
		Person s = new Student("정동원학생", 15, 25000);
		Person t = new Teacher("김호중강사", 30, "자바");
		Person e = new Employee("김성주관리자", 40, "교무과");
		
		s.print();
		t.print();
		e.print();
	
		
	}
}
