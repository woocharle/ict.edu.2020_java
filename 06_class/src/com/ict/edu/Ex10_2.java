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
		
	// 합계 구하기 
	public int s_sum(int kor, int eng, int math) {
		sum = kor + eng + math;
		return sum;
	}
	
	// 평균 구하기
	public double s_avg() {
		avg = (int)(10 * sum / 3.0) / 10.0;
		return avg;
	}
	
	// 학점 구하기
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
	
	
	// 평균 구하기 
	
	
	// 학점 구하기 
	
	
}
