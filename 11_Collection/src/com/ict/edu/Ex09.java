package com.ict.edu;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Vector;

public class Ex09 {
	public static void main(String[] args) {
		// ArrayList : ��Ƽ������ ����ȭ �������� ����.
		// Vector    : ��Ƽ������ ����ȭ ������.
		
		ArrayList<String> list =  new ArrayList<String>();
		//�߰�, ����: add
		list.add("����ȣ");
		list.add("�����");
		list.add("������");
		list.add(1, "�⼺��");
		
		System.out.println(list);
		System.out.println("----------------------------------------------");
		
		Vector<String> vector = new Vector<String>();
		vector.add("�⼺��");
		vector.add("������");
		vector.add("�����");
		vector.add(2, "����ȣ");
		
		System.out.println(vector);
		System.out.println("----------------------------------------------");
		
		if(list.contains("����ȣ")) {
			System.out.println(list.indexOf("����ȣ") + "��° ��ġ");
			System.out.println(list.get(2));
			System.out.println(list.lastIndexOf("����ȣ") + "��° ��ġ");
			System.out.println(list.set(0, "�ڼ���"));
			System.out.println();
			// search, elementAt
		}
		else {
			System.out.println("�������� ����.");
		}
		
		if(vector.contains("�⼺��")) {
			System.out.println(vector.indexOf("�⼺��") + "��° ��ġ");
			System.out.println(vector.get(2));
			System.out.println(vector.lastIndexOf("�⼺��") + "��° ��ġ");
			System.out.println(vector.elementAt(1));
			System.out.println(vector.firstElement());
			System.out.println(vector.lastElement());
		}
		
		vector.set(1, "���θ�");
		vector.setElementAt("�ڼ���", 2);
		System.out.println(vector);
		
		System.out.println(list.size());
		System.out.println(vector.size());
		System.out.println("==============================================================");
		
		for(String k : list) {
			System.out.println(k);
		}
		System.out.println("==============================================================");
		
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			String res = (String)it.next();
		}
		
		
	}
}
