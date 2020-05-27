package com.ict.edu10;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class VO implements Externalizable{
	private String name;
	private int sum;
	private double avg;
	private String grd;
	private int rank = 1;
	
	public VO() {}
	
	public VO(String name, int kor, int eng, int math) {
		this.name = name;
		this.sum = kor + eng + math;
		this.avg = (int)(sum / 3.0 * 10) / 10.0;
		this.grd = grade(avg);
	}
	
	
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		name = (String) in.readObject();
		sum = (int) in.readObject();
		avg = (int) in.readObject();
		grd = (String) in.readObject();
		rank = (int) in.readObject();
		
	}
	
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(name);
		out.writeObject(sum);
		out.writeObject(avg);
		out.writeObject(grd);
		out.writeObject(rank);
		
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
