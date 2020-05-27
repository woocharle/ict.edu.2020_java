package com.ict.edu06;

import java.io.Serializable;

//  ��ü�� ������ ����ϴ� Ŭ����
// Serializable �������̽��� ����ȭ�� �� �ִ�.
// ����ȭ ���� ��Ű�� ���: ���� �տ� transient ���� ���.

public class VO implements Serializable {
	private String name;
	private int age;
	transient private double weight;
	transient private boolean gender;
	
	public VO(){}

	public VO(String name, int age, double weight, boolean gender) {
		super();
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.gender = gender;
	}

	// getter, setter
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}
	
	
}
