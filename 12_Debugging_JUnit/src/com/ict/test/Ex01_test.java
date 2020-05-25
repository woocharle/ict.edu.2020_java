package com.ict.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.ict.junit.Ex01;

/*JUnit : ���� �׽�Ʈ (�޼ҵ������ �׽�Ʈ) ����, ��Ŭ�������� �⺻������ ����
  ����: JUnit�� �������� ��, JUnit4�������� �� ��.
  
  ���ڽ� �׽�Ʈ : �Է°��� �־ ������ ��ġ ����, 
                    ������ ��ġ���� ������ ����
  assertEquals : �⺻�� ���� �Ǵ� ��ü�� ���� ���󰪰� ��ġ���� �˻��ϴ� �޼ҵ� 
  assertSame : �� ��ü�� ���� ��ü���� �˻� ( �ּҰ� ����?)
  assertNull : null���� �˻�
  assertNotNull : null �ƴ��� �˻�
  assertTrue(a) : a�� ������ �˻�
  assertArrayEquals(a,b) : �迭a, �迭b�� ��ġ���� Ȯ��
*/

public class Ex01_test {

	Ex01 t1;

	// �׽�Ʈ��: ������ �޼ҵ��� Ŭ������ ��ü �����ϱ�.
	@Before     //�ֳ����̼�(@): �ּ��� �������� �����Ϸ����� ���ø� ������ ��.
	public void tBefore() {
		System.out.println("������ Ŭ������ ��ü ��������.");
		t1 = new Ex01();
		
	}
	
	// �׽�Ʈ�� ������ �޼ҵ�
	@Test
	/*
	public void addtest() {
		// �޼ҵ带 ������ �����.
		int res = t1.add(10, 20);
		// expected: ����, actual: �����.
		assertEquals(30, res);
	}
	*/
	
	public void subtest() {
		// �޼ҵ带 ������ �����.
		int res = t1.sub(10, 20);
		// expected: ����, actual: �����.
		assertEquals(30, res);
	}
	
	
	// �׽�Ʈ ���� �� 
	@After
	public void tAfter() {
		System.out.println("�׽�Ʈ ���� �� �޼ҵ� ����");
	}
	

}
