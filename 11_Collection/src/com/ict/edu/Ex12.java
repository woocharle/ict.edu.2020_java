package com.ict.edu;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Ex12 {
	public static void main(String[] args) {
		// 대한민국, 캐나다, 영국, 스위스의 수도가 각각 
		
		HashMap<String, String> cap = new HashMap<String, String>();
		
		cap.put("대한민국", "서울");
		cap.put("한국", "서울");
		cap.put("korea", "서울");
		cap.put("캐나다", "오타와");
		cap.put("영국", "런던");
		cap.put("스위스", "베른");
		
		Set<String> set = cap.keySet();
		
		Scanner sc = new Scanner(System.in);
	
		
		while(true) {
			System.out.print("나라 입력: ");
			String str = sc.next();
			str = str.toLowerCase();
			
			if(set.contains(str)) {
				System.out.println(str + "의 수도는 " + cap.get(str));
			}
			else {
				System.out.println("데이터가 없습니다.");
				
			}
			System.out.print("계속할까요 (y/n)"  );
			String msg = sc.next();
			if(msg.equalsIgnoreCase("n")) break;

		}
	
	}
}
