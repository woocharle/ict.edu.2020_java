package com.ict.edu;

public class Ex09 {
	private String name;
	private int sum;
	private double avg;
	private String grade;
	
	//getter 
	
	public String getName() {
		return name;
	}
	
	public int g_sum() {
		return sum;
	}
	
	public double g_avg() {
		return avg;
	}
	
	public String g_grade() {
		return grade;
	}

	// setter 
	public void setName(String name) {
		this.name = name;
	}
		
	// �հ� ���ϱ� 
	public void s_sum(int kor, int eng, int math) {
		sum = kor + eng + math;
	}
	
	// ��� ���ϱ�
	public void s_avg() {
		avg = (int)(10 * sum / 3.0) / 10.0;
	}
	// ���� ���ϱ�
	public void s_hak() {
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
	}
	
	// ��� ���ϱ� 
	
	
	// ���� ���ϱ� 
	
	
}
