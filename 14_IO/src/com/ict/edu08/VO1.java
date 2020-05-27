package com.ict.edu08;

import java.io.Serializable;

public class VO1 implements Serializable {
	private String name;
	private int sum;
	private double avg;
	private String grd;
	private int rank = 1;
	
	public VO1() {}
	
	public VO1(String name, int kor, int eng, int math) {
		this.name = name;
		this.sum = kor + eng + math;
		this.avg = (int)(sum / 3.0 * 10) / 10.0;
		this.grd = grade(avg);
		
	}

	public String grade(double avg) {
		String res = null;
		
		if(avg>=90) {
			res = "A";
		}else if(avg >= 80) {
			res = "B";
		}else if(avg >= 70) {
			res = "C";
		}else {
			res = "F";
		}
		
		return res;
	}
	
	public int r_rank() {
		return rank++;
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

	public String getGrd() {
		return grd;
	}

	public int getRank() {
		return rank;
	}

}
