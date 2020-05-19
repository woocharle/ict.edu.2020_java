package com.ict.edu;

public class Ex12 {
	// ��� �ʵ�
	private String name;
	private int sum;
	private double avg;
	private String grade;
	private int rank;
	
	//������
	
	public Ex12() {
		// ���� ������
	}

	public Ex12(String name, int kor, int eng, int math, int rank) {
		this.name = name;
		this.sum = s_sum(kor, eng, math);
		this.avg = s_avg();
		this.grade = s_hak();
		this.rank = rank;
		
	}
	
	
	//getter 
	
	public String getName() {
		return name;
	}
	
	public int getSum() {
		return sum;
	}
	
	public double getAvg() {
		return avg;
	}
	
	public String getHak() {
		return grade;
	}
	
	public int getRank() {
		return rank;
	}

	// setter 
	public void setName(String name) {
		this.name = name;
	}
	
	// �հ� ���ϱ� 


	public int s_sum(int kor, int eng, int math) {
		return kor + eng + math;
	}
	
	// ��� ���ϱ�
	

	public double s_avg() {
		return (int)(10 * sum / 3.0) / 10.0;
	}


	// ���� ���ϱ�
	
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
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
	
	// ���� ���ϱ� 
	
	public void setRank(int rank) {
		this.rank = rank;
	}

	public int s_rank(int rank) {
		this.rank = rank + 1;
		return rank;
	}

	
}

