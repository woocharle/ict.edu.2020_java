package com.ict.edu6;


import java.util.ArrayList;
import java.util.List;

public class Car {
	private List<String> carList=null;
	
	//������
	public Car() {
		carList = new ArrayList<String>();
	}
	
	public String getCar() {
		String carName = null;
		switch ((int)(Math.random() * 3)) {
			case 0: carName = "K7"; break;
			case 1: carName = "���׽ý�"; break;
			case 2: carName = "����"; break;
			
		}
		return carName;
	}
	
	public synchronized String pop() {
		String carName = null;
		if(carList.size() == 0) {
			try {
				System.out.println("���� ����� ������ �� ���� ��ٸ�����.");
				this.wait();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		carName = (String)carList.remove(carList.size() - 1);
		System.out.println("�մ��� ���� �簬���ϴ�. �մ��� ������ ���̸��� =>\" " + carName + "\"" );
		
		return carName;
	
	}
	
	public synchronized void push(String car) {
		carList.add(car);
		System.out.println("���� ����� �����ϴ�. ���̸��� \"" + car + "\"");
		
		if(carList.size() == 5) {
			this.notify();
		}
	}
	
}
