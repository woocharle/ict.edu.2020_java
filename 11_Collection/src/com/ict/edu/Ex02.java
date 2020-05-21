package com.ict.edu;

import java.util.HashSet;
import java.util.TreeSet;
import java.util.Iterator;

public class Ex02 {
	public static void main(String[] args) {
		HashSet<Integer> h1 = new HashSet<Integer>();
		HashSet<Double> h2 = new HashSet<Double>();
		HashSet<Boolean> h3 = new HashSet<Boolean>();
		
		TreeSet<Character> h4 = new TreeSet<Character>();
		TreeSet<String> h5 = new TreeSet<String>();
		
		// 해당 컬렉션에 객체 넣기. (일반 객체로 만든 후 넣어야 한다.)
		// 1. 객체로 만들기
		Integer k1 = new Integer(10);   //Boxing
		Integer k2 = new Integer("20");
		
		Double d1 = new Double(10);
		Double d2 = new Double("20");
		
		
		// 2. 컬렉션에 넣기(add)
		// int
		h1.add(k1);
		h1.add(k2);
		h1.add(new Integer(30));
		h1.add(new Integer("40"));
		h1.add(50); 					//오토박싱 : 변수를 자동으로 객체로 만든다. 자료형이 무조건 맞아야 한다. 
		h1.add(60);						

		
		// Double
		h2.add(d1);
		h2.add(d2);
		h2.add(new Double(30));
		h2.add(new Double("40"));
		h2.add(50.0);
		h2.add(60.0);
		
		h3.add(true);					//오류는 나지 않지만 들어가지 않는다. (중복 허용하지 않음)
		h3.add(false);
		h3.add(true);
		
		h4.add('j');
		h4.add('a');
		h4.add('v');
		h4.add('a');					//오류는 나지 않지만 들어가지 않는다. (중복 허용하지 않음)
		
		h5.add("java");
		h5.add("html");
		h5.add("jsp");
		h5.add("css");
		h5.add("db");
		
		System.out.println("================================================");
		System.out.println("전체 내용 보기.");
		System.out.println(h1);
		System.out.println(h2);
		System.out.println(h3);
		System.out.println(h4);
		System.out.println(h5);
		System.out.println("================================================");
		
		
		System.out.println("하나씩 보기<개선된 for문, iterator를 써야 한다.>.");
		for(int k : h1) {
			System.out.print(k + " ");
		}
		System.out.println();
		
		for(double k : h2) {
			System.out.print(k + " ");
		}
		System.out.println();
		
		
		for(String k : h5) {
			System.out.print(k + " ");
		}
		System.out.println();
		
		System.out.println("================================================");
		System.out.println("하나씩 보기<iterator>");
		// hasNext() => 다음객체가 존재하면 true
		
		Iterator<Double> it = h2.iterator();
		while (it.hasNext()) {
			// 다음 객체를 꺼내기 위해서 이동하고 반환한다.
			Double res = (Double) it.next();
			System.out.print(res + " ");
		}
		System.out.println();
		System.out.println("================================================");
		
		Iterator<Character> it2 = h4.iterator();
		while(it2.hasNext()) {
			Character res = (Character) it2.next();
			System.out.print(res + " ");
		}
		System.out.println();
		System.out.println("================================================");
		
		Iterator<String> it3 = h5.iterator();
		while(it3.hasNext()) {
			String res = (String) it3.next();
			System.out.print(res + " ");
		}
		System.out.println();
		
		
		
		
		
	}

}
