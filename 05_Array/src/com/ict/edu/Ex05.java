package com.ict.edu;

public class Ex05 {
	public static void main(String[] args) {
		String[] name = {"김호중", "영탁  ", "이찬원", "정동원", "임영웅"};
		int[] kor = {80, 90, 80, 70, 100};
		int[] eng = {80, 95, 85, 70, 100};
		int[] mat = {100, 100, 100, 100, 100};
		
		int[] sum = new int[5];
		double[] avg = new double[5] ;
		String[] grd = new String[5];
		int[] rank = {1, 1, 1, 1, 1};
		
		for (int i = 0; i < name.length; i++) {
			sum[i] = kor[i] + eng[i] + mat[i];
			int avg_0 = (int)(sum[i] * 10 / 3.0);
			avg[i] = avg_0 / 10.0;
			
			if (avg[i] >= 90) {
				grd[i] = "A";
			}
			else if (avg[i] >= 80) {
				grd[i] = "B";
			}			
			else if (avg[i] >= 70) {
				grd[i] = "C";
			}
			else {
				grd[i] = "F";
			}
			
		}
		
		for(int i = 0; i < rank.length; i++) {
			for (int j = 0; j < rank.length; j++) {
				if(avg[i] < avg[j]) {
					rank[i] += 1;
				}
			}
		}
		
		System.out.println("이 름\t총 점\t평 균\t학 점\t순 위");
		for (int i = 0; i < rank.length; i++) {
			System.out.println(name[i] +"\t" + sum[i] +"\t" + avg[i] +"\t" + grd[i] +"\t" + rank[i]);
		}
		
		System.out.println();
		System.out.println("2중 배열 이용");
		
		String[][] data = new String[6][5];
		data[0][0] = "이 름";	data[0][1] = "총 점";	data[0][2] = "평 균";	data[0][3] = "학 점"; data[0][4] = "순 위";
		
		for (int i = 1; i <= 5; i++) {
			data[i][0] = name[i - 1];
			data[i][1] = Integer.toString(sum[i - 1]);
			data[i][2] = Double.toString(avg[i - 1]);
			data[i][3] = grd[i - 1];
			data[i][4] = Integer.toString(rank[i - 1]);			
		}
		
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(data[i][j] + "\t");
			}
			System.out.println();
		}
		
		
	}
}
