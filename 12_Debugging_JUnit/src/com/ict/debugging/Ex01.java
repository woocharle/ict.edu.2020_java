package com.ict.debugging;

import java.util.HashSet;

//breakpoint(�ߴ���): ����� ����� �ڵ����� ������ �ߴܵǾ� �ش� ������ ���� ���� �� �� �ִ� Ư������.

// F8: �ߴ������� �ߴ������� �̵�
// F5 : �ѹ��徿 ����, �޼ҵ带 ������ ������ ����
// F6 : �ѹ��徿 ����, �޼ҵ带 ������ �ǳʶڴ�.

public class Ex01 {
	public static void main(String[] args) {
		int total = 0;
		for (int i = 1; i < 11; i++) {
			total += i;
			System.out.println("i= " + i + ", total = " + total);
		}
		System.out.println("�� : " + total);
		
		
		HashSet<Ex01> test = new HashSet<Ex01>();
		
		
		
	}
}
