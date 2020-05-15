package com.ict.edu;

public class Ex04 {
	int k1 = 10;
	String str= "";
	
	//오버로딩
	public void add() {
		k1++;
	}
	
	public void add(int s) {
		k1 = k1 + s;
	}
	
	public void add(float s) {
		k1 = k1 + (int)s;
	}
	
	public void add(double s) {
		k1 = k1 + (int)s;
	}
	
	public void add(int s1, int s2) {
		k1 = s1 + s2;
	}	
	
	
	public void add(String s){
		str = s;
	}
	
	public void add(int s1, String s2){
		k1 = s1;
		str = s2;
	}
	
	public void add(String s2, int s1){
		k1 = s1;
		str = s2;
	}
	
	public void plus(int s) {
		k1 = k1 + s;
	}
	
	public void calc(int s1, int s2) {
		k1 = s1 + s2;
	}	
	
}
