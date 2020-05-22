package com.ict.edu;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;

public class Ex11 {
	public static void main(String[] args) {
		/*  Map �������̽� : Key�� Value�� �����ϴ� ������ �̷����.
			Ư¡
			 - Key�� �ߺ��� �� ����. �ߺ��� �ϸ� ���������.
			 - key�� ȣ���ϸ� Value�� ���´�.
			 - Key�� ������ ���� => keySet()
			 - add() ��� put(key, value)�� �߰� 
			 
			Map���� (key ���ڷ� �����.)
		
			
		*/
		
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(0, "�ѱ�");
		map1.put(1, "�̱�");
		map1.put(2, "�߱�");
		map1.put(3, "�±�");
		map1.put(4, "����");
		map1.put(5, "�ѱ�");
		map1.put(3, "�ε�");
		
		System.out.println(map1);
		
		System.out.println("---------------------------------------------------");
		System.out.println(map1.get(4));
		
		
		// map ���
		// key�� 0 ~ map1.size ������ ���� �ʱ� ������ �ι�° ���� ����ؾ� �Ѵ�.
		// ����õ
		System.out.println("---------------------------------------------------");
		for (int i = 0; i < map1.size(); i++) {
			System.out.print(map1.get(i) + " ");
		}
		
		// ��õ
		System.out.println("---------------------------------------------------");
		for(Integer k : map1.keySet()) {
			System.out.print(map1.get(k) + " ");
		}
		
		System.out.println();
		System.out.println("---------------------------------------------------");
		
		
		// key�� ���ڿ���
		HashMap<String, String> map2 = new HashMap<String, String>();
		
		map2.put("�̸�", "��浿");
		map2.put("����", "43");
		map2.put("�ּ�", "����� ������ ���е�");
		map2.put("����", "��");
		map2.put("���", "ȫ�῵ȭ ����");
		
		System.out.println(map2.get("�̸�"));
		System.out.println(map2.get("����"));
		System.out.println(map2.get("�ּ�"));
		System.out.println(map2.get("����"));
		System.out.println(map2.get("���"));
		
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
