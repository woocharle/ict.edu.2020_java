package com.ict.edu;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;

public class Ex11 {
	public static void main(String[] args) {
		/*  Map 인터페이스 : Key와 Value로 매핑하는 구조로 이루어짐.
			특징
			 - Key는 중복될 수 없다. 중복을 하면 덮어써진다.
			 - key를 호출하면 Value가 나온다.
			 - Key를 별도로 관리 => keySet()
			 - add() 대신 put(key, value)로 추가 
			 
			Map생성 (key 숫자로 만든다.)
		
			
		*/
		
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(0, "한국");
		map1.put(1, "미국");
		map1.put(2, "중국");
		map1.put(3, "태국");
		map1.put(4, "영국");
		map1.put(5, "한국");
		map1.put(3, "인도");
		
		System.out.println(map1);
		
		System.out.println("---------------------------------------------------");
		System.out.println(map1.get(4));
		
		
		// map 출력
		// key가 0 ~ map1.size 범위만 두지 않기 때문에 두번째 것을 사용해야 한다.
		// 비추천
		System.out.println("---------------------------------------------------");
		for (int i = 0; i < map1.size(); i++) {
			System.out.print(map1.get(i) + " ");
		}
		
		// 추천
		System.out.println("---------------------------------------------------");
		for(Integer k : map1.keySet()) {
			System.out.print(map1.get(k) + " ");
		}
		
		System.out.println();
		System.out.println("---------------------------------------------------");
		
		
		// key를 문자열로
		HashMap<String, String> map2 = new HashMap<String, String>();
		
		map2.put("이름", "고길동");
		map2.put("나이", "43");
		map2.put("주소", "서울시 도봉구 방학동");
		map2.put("성별", "남");
		map2.put("취미", "홍콩영화 감상");
		
		System.out.println(map2.get("이름"));
		System.out.println(map2.get("나이"));
		System.out.println(map2.get("주소"));
		System.out.println(map2.get("성별"));
		System.out.println(map2.get("취미"));
		
		System.out.println();
		System.out.println("---------------------------------------------------");
		
		for(String k : map2.keySet()) {
			System.out.println(map2.get(k));
		}
		
		
		System.out.println();
		System.out.println("---------------------------------------------------");
		
		Iterator<String> it = map2.keySet().iterator();
		while (it.hasNext()) {
			String res = (String) it.next();
			System.out.println(map2.get(res));
		}
		
		
		
		
		
	}
}
