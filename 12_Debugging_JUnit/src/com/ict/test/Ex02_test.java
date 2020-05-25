package com.ict.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.ict.junit.Ex01;
import com.ict.junit.Ex02;

public class Ex02_test {
	Ex01 t1;
 	Ex02 t2;
	
	@Before
	public void tbefore(){
		System.out.println("실행할 클래스를 객체 생성하자.");
		t1 = new Ex01();
		t2 = new Ex02();
	}
	
	@Test

	public void multest() {
		int res = t2.mul(10, 20);
		assertEquals(200, res);
	}

	@Test
	public void test1() {
		int res = t1.add(10, 5);
		assertEquals(15, res);
	}
	
	@Test
	public void test2() {
		int res = t2.div(10, 5);
		assertEquals(2, res);
	}
	
	
	@After
	public void tAfter() {
		System.out.println("테스트 끝");
	}
	

}
