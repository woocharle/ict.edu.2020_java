package com.ict.edu;

import java.util.HashSet;
import java.util.Iterator;

public class Ex03_main {
	public static void main(String[] args) {
		// 값 입력 및 변경 방법 
		// 1.기본생성자 만들고 setter
		Ex03 p1 = new Ex03();
		p1.setName("둘리");
		p1.setAge(5000);
		p1.setWeight(80.0);
		
		Ex03 p2 = new Ex03("고길동", 50, 60.0);
		Ex03 p3 = new Ex03("마이콜", 20, 56.3);
		
	
		// 객체 저장하는 방법: 배열, 컬렉션
		// 배열 
		Ex03[] arr = new Ex03[3];
		arr[0] = p1;
		arr[1] = p2;
		arr[2] = p3;
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].getName());
		}
		System.out.println();
		System.out.println("=============================================");
		
		//컬렉션 이용
		HashSet<Ex03> h1 = new HashSet<Ex03>();
		h1.add(p1);
		h1.add(p2);
		h1.add(p3);
		h1.add(new Ex03("공실이", 4994, 75.5));
		h1.add(new Ex03("도우너", 1000, 49.5));
		
		for(Ex03 k : h1) {
			System.out.println(k.getName());
		}
		
		System.out.println("=============================================");
		
		Iterator<Ex03> it1 = h1.iterator();
		while(it1.hasNext()) {
			Ex03 res = (Ex03)it1.next();
			System.out.println("이름: " + res.getName() + "\t나이: " + res.getAge() + "\t몸무게: " + res.getWeight());
		}
		System.out.println();
		
		
		// 크기 구하기. (컬렉션 이름).size();
		System.out.println("h1의 크기(삭제전) " + h1.size());
		
		//포함여부: contains
		
		// 이름 마이콜이 객체가 있는지 확인 하고 없애 주세요.
		System.out.println("=============================================");
		for(Ex03 k : h1) {
			if(k.getName().contains("마이콜")) {
				h1.remove(k);
				System.out.println("마이콜 있다.");
				break;
			}
		}
			
		for(Ex03 k : h1) {
			System.out.println(k.getName());
		}
		
		
		System.out.println("h1의 크기(삭제후) " + h1.size());
		
		
		// 모두 삭제: (컬렉션 이름).clear() // 비어있는지 확인: (컬렉션 이름).isEmpty()
		
		h1.clear();
		System.out.println("h1의 크기(clear후) " + h1.size());
		
		if(h1.isEmpty()) {
			System.out.println("다 비었음.");
		}
		
		Ex03[] arr1 =  h1.toArray(new Ex03[3]);
		
	}
	
}
