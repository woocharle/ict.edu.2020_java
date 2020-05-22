package com.ict.debugging;

import java.util.HashSet;

//breakpoint(중단점): 디버깅 실행시 자동으로 실행이 중단되어 해당 변수의 값을 조사 할 수 있는 특정지점.

// F8: 중단점에서 중단점으로 이동
// F5 : 한문장씩 실행, 메소드를 만나면 안으로 진입
// F6 : 한문장씩 실행, 메소드를 만나면 건너뛴다.

public class Ex01 {
	public static void main(String[] args) {
		int total = 0;
		for (int i = 1; i < 11; i++) {
			total += i;
			System.out.println("i= " + i + ", total = " + total);
		}
		System.out.println("합 : " + total);
		
		
		HashSet<Ex01> test = new HashSet<Ex01>();
		
		
		
	}
}
