package com.ict.edu;

import java.util.Iterator;
import java.util.Stack;

public class Ex08 {
	public static void main(String[] args) {
		/*  List �������̽�  : �迭�� ����� ����, ����, ����, �߰��� �����Ӵ�.
							 ũ�⸦ �̸� ������ �ʾƵ� �ȴ�.
							 �ߺ�����.
							 
			���� Ŭ����      : Stack, ArrayList, Vector;
			Stack            : LIFO(Last In First Out)_ �������� ���� �����Ͱ� ���� ������ ����.
			add.push, addElement => �߰�
			add(index, E)        => ���� (�߰��� ��)
			pop			     : �� ���� �����ϴ� ��ü�� ��ȯ�ϰ� �����Ѵ�.
			peek             : �� ���� �����ϴ� ��ü�� ��ȯ.
			search           : �˻� (������ 1����)  <--
			indexOf          : �˻� (���� 0����)    -->
			elementAt(index) : ���� (���� 0����)
			get(index)       : ���� (���� 0����)
			firstElement()   : ��ó����� ����
			lastElement()    : ��������� ����
			SetElement(Element, index) : ġȯ
		*/
		
		Stack <String> st = new Stack<String>();
		st.add("�Ѹ�");
		st.addElement("������");
		st.add("������");
		System.out.println(st);
		
		st.add(0, "��浿");
		st.add(3, "����");
		
		System.out.println(st);
		
		// ��������ü ����: pop(����), peek
		System.out.println(st.peek());
		System.out.println(st);
		
		System.out.println(st.pop());
		System.out.println(st);
		System.out.println("===============================================");
		
		if(st.contains("�Ѹ�")) {
			System.out.println(st.indexOf("�Ѹ�") + "��° ��ġ");
			System.out.println(st.search("�Ѹ�") + "��° ��ġ");
			System.out.println(st.get(3));
			System.out.println(st.elementAt(3));
			System.out.println(st.firstElement());
			System.out.println(st.lastElement());
			System.out.println(st.size() + "��");
		}
		else {
			System.out.println("�������� ����.");
		}
		
		st.setElementAt("�����", 2);
		System.out.println(st);
		System.out.println("===============================================");
		
		st.add("�Ѹ�");
		st.add(3, "�Ѹ�");
		System.out.println(st);
		System.out.println("===============================================");
		
		Iterator<String> it = st.iterator();
		while (it.hasNext()) {
			String res = (String) it.next();
			System.out.println(res);
		}
		System.out.println();
		System.out.println("===============================================");		
		
		while(! st.isEmpty()) {
			String k = st.pop();
			System.out.println(k + "���� ��, ũ��� " + st.size());
		}
		
	}
}
