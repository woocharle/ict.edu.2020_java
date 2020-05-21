package com.ict.edu;

import java.util.HashSet;

public class Ex06 {
	public static void main(String[] args) {
		// 컬렉션을 배열로 변경 => toArray() 
		// 배열을 컬렉션을 변경
		
		String[] str = {"java", "JAVA", "Java", "자바"};
		
		HashSet<String> set1 = new HashSet<String>();
		HashSet<String> set2 = new HashSet<String>();
		HashSet<String> set3 = new HashSet<String>();
		

		
		for (String k : str) {
			set1.add(k);
		}
		System.out.println(set1);
		System.out.println("===================================================");
		
		set2.addAll(set1);
		
		set1.add("HTML");
		set1.add("CSS");
		
		System.out.println(set1);
		System.out.println(set2);
		System.out.println("===================================================");
		
		// set2에서 "자바" 삭제
		
		set2.remove("자바");
		
		set2.add("jsp");
		set2.add("android");
		set2.add("Python");
		
		System.out.println(set1);
		System.out.println(set2);
		System.out.println("===================================================");
		
		//중복검사
		// set2에 정보를 set1에 추가한다.
		
		for(String k : set2) {
			if(! set1.add(k)) {
				set3.add(k);
				System.out.println(k + " 중복");
			}
			
		}
		
		System.out.println(set1);
		System.out.println(set2);
		System.out.println(set3);
		
		
	}

}
