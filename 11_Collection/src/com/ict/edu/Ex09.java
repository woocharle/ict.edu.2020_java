package com.ict.edu;

import java.util.ArrayList;
import java.util.Vector;

public class Ex09 {
	public static void main(String[] args) {
		// ArrayList : 멀티스레드 동기화 지원하지 않음.
		// Vector    : 멀티스레드 동기화 지원함.
		
		ArrayList<String> list =  new ArrayList<String>();
		//추가, 삽입: add
		list.add("박찬호");
		list.add("손흥민");
		list.add("류현진");
		list.add(1, "기성용");
		
		System.out.println(list);
		System.out.println("----------------------------------------------");
		
		Vector<String> vector = new Vector<String>();
		vector.add("기성용");
		vector.add("류현진");
		vector.add("손흥민");
		vector.add(2, "박찬호");
		
		System.out.println(vector);
		System.out.println("----------------------------------------------");
		
		if(list.contains("박찬호")) {
			System.out.println(list.indexOf("박찬호") + "번째 위치");
			System.out.println(list.get(2));
			System.out.println(list.lastIndexOf("박찬호") + "번째 위치");
			System.out.println(list.set(0, "박세리"));
			System.out.println();
			// search, elementAt
		}
		else {
			System.out.println("존재하지 않음.");
		}
		
	}
}
