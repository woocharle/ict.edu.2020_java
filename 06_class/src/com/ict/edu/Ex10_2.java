package com.ict.edu;

public class Ex10_2{
	private String name;
	private int sum;
	private double avg;
	private String grade;

	
	// setter 
	public String setName(String name) {
		this.name = name;
		return name;
	}
		
	// �հ� ���ϱ� 
	public int s_sum(int kor, int eng, int math) {
		sum = kor + eng + math;
		return sum;
	}
	
	// ��� ���ϱ�
	public double s_avg() {
		avg = (int)(10 * sum / 3.0) / 10.0;
		return avg;
	}
	
	// ���� ���ϱ�
	public String s_hak() {
		if(avg >= 90 ) {
			grade = "A";
		}
		else if(avg >= 80 ) {
			grade = "B";
		}
		else if(avg >= 70 ) {
			grade = "C";
		}
		else {
			grade = "F";
		}
		
		return grade;
	}
	
	
	// ��� ���ϱ� 
	
	
	// ���� ���ϱ� 
	
	
}
