package com.ict.edu;

public class Ex04 {
	//member field
	
	private String name;
	private int sum;
	private double avg;
	private String grd;
	private int rank;
	
	public Ex04() {}
	
	public Ex04(String name, int kor, int eng, int mat) {
		this.name = name;
		this.sum = s_sum(kor, eng, mat);
		this.avg = s_avg(sum);
		this.grd = grade(avg);
		this.rank = 1;
	
	}
	
	// member method

	// calc
	public int s_sum(int kor, int eng, int mat ) {
		return kor + eng + mat;
	}
	
	public double s_avg(int sum) {
		return (int)(sum / 3.0 * 10) / 10.0;
	}
	
	public String grade(double avg) {
		
		if(avg >= 90) {
			grd = "A";
		}
		else if(avg >= 80) {
			grd = "B";
		}
		else if(avg >= 70) {
			grd = "C";
		}
		else {
			grd = "F";
		}
		
		
		
		return grd;
	}
	
	
	public int s_rank() {
		return rank++;
	}
	

	// getter ¿Í setter
	//name
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	//Sum
	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}
	
	// Average
	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}
	

	// grade
	public String getGrd() {
		return grd;
	}

	public void setGrd(String grd) {
		this.grd = grd;
	}

	// Rank
	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}
	
	
	
	
}
