package test.ict.edu;

import java.util.HashSet;
import java.util.Scanner;

public class Sungjuk {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashSet<Person> student = new HashSet<Person>();
		
		for (int i = 0; i < 5; i++) {
			System.out.print("이름: ");
			String name = sc.next();
			System.out.print("국어: ");
			int kor = sc.nextInt();
			System.out.print("영어: ");
			int eng = sc.nextInt();
			System.out.print("수학: ");
			int math = sc.nextInt();
			
			student.add(new Person(name, kor, eng, math));
		
		}
		
		for(Person k : student) {
			for(Person l : student) {
				if(k.getSum() < l.getSum()) {
					k.s_rank();
				}
			}
		}
		
		Person[] std = student.toArray(new Person[student.size()]);
		
		Person tmp = new Person();
		
		for (int i = 0; i < std.length; i++) {
			for (int j = 0; j < std.length; j++) {
				if(std[i].getSum() > std[j].getSum()) {
					tmp = std[i];
					std[i] = std[j];
					std[j] = tmp;
					
				}
			}
		}
	
		for (int i = 0; i < std.length; i++) {
			System.out.print("이름 " + std[i].getName() + "  ");
			System.out.print("총점 " + std[i].getSum() + "  ");
			System.out.print("평균 " + std[i].getAvg() + "  ");
			System.out.print("성적 " + std[i].getHak() + "  ");
			System.out.print("순위 " + std[i].getRank() + "  ");
			System.out.println();
		}
		
	}

}



