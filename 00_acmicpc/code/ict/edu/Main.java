package code.ict.edu;

import java.io.*;
import java.util.HashSet;

public class Main {
	static int[][] arr;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] data = str.split(" ");
		int x = Integer.parseInt(data[0]);
		int y = Integer.parseInt(data[1]);
		
		arr = new int[x][y];
		
		for (int i = 0; i < x; i++) {
			str = br.readLine();
			data = str.split(" ");
			for (int j = 0; j < y; j++) {
				arr[i][j] = Integer.parseInt(data[j]);
			}
			
		}
		
		int max = 0;
		int m1 = 0;
		int[] figs = new int[3];
		
		for (int i = 0; i < arr.length; i++) {
			m1 = fig1(i, arr);
			if(m1 > figs[0]) {
				figs[0] = m1;
			}
		}
		
		for (int i = 0; i < y; i++) {
			m1 = fig2(i, arr);
			if(m1 > figs[1]) {
				figs[1] = m1;
			}
		}
		
		figs[2] = fig3(x , y, arr);
		
		for (int i = 0; i < figs.length; i++) {
			if(figs[i] > max) {
				max = figs[i];
			}
		}
		
		System.out.println(max);
		
	}
	
	public static int fig1(int k, int[][] arr) {
		int max = 0;
		int sum;
		int a = arr[k].length - 4;
		
		for (int i = 0; i < a + 1; i++) {
			sum = 0;
			for (int j = 0; j < 4; j++) {
				sum += arr[k][i + j];
			}
			if(sum > max) {
				max = sum;
			}
		}
			
		return max;
		
	}
		
	public static int fig2(int k, int[][] arr) {
		int max = 0;
		int sum;
		int a = arr.length - 4;
	
		for (int i = 0; i < a + 1; i++) {
			sum = 0;
			for (int j = 0; j < 4; j++) {
				sum += arr[a + j][k];
			}
			if(sum > max) {
				max = sum;
			}
		}
		return max;
		
	}
	
	public static int fig3(int x, int y, int[][] arr) {
		int max = 0;
		int sum;
		
		for (int i = 1; i < x - 1; i++) {
			sum = s_fig(i , y, arr);
			if(max < sum) {
				max = sum;
			}
		}
						
		return max;
		
	}
	
	public static int s_fig(int x , int y, int[][] arr) {
		int max = 0;
		HashSet<Integer> res = new HashSet<Integer>();
		
		for (int i = 1; i < y - 1; i++) {
			// ㅏ ㅜ ㅓ ㅗ, 응용한 번개 모양, L자
			res.add(arr[x][i] + arr[x + 1][i - 1] + arr[x][i - 1] + arr[x - 1][i - 1]);  // ㅏ
			res.add(arr[x][i] + arr[x - 1][i] + arr[x + 1][i] + arr[x][i + 1]);  // ㅏ
			res.add(arr[x - 1][i] + arr[x + 1][i - 1] + arr[x][i - 1] + arr[x - 1][i - 1]);  // L자 1
			res.add(arr[x + 1][i] + arr[x + 1][i - 1] + arr[x][i - 1] + arr[x - 1][i - 1]);  // L자 2	
			res.add(arr[x][i] + arr[x - 1][i] + arr[x + 1][i] + arr[x - 1][i + 1]); // L자 1
			res.add(arr[x][i] + arr[x - 1][i] + arr[x + 1][i] + arr[x + 1][i + 1]); // L자 2	
			res.add(arr[x][i] + arr[x][i - 1] + arr[x + 1][i] + arr[x - 1][i - 1]);  //  번개
			res.add(arr[x][i] + arr[x][i - 1] + arr[x - 1][i] + arr[x + 1][i - 1] );  // 번개 
			
			res.add(arr[x][i] + arr[x - 1][i - 1] + arr[x - 1][i] + arr[x - 1][i + 1]);  // ㅜ
			res.add(arr[x][i] + arr[x][i - 1] + arr[x][i + 1] + arr[x + 1][i]);  // ㅜ
			res.add(arr[x][i - 1] + arr[x - 1][i - 1] + arr[x - 1][i] + arr[x - 1][i + 1]);  // L자 1
			res.add(arr[x][i + 1] + arr[x - 1][i - 1] + arr[x - 1][i] + arr[x - 1][i + 1]);  // L자 2
			res.add(arr[x][i] + arr[x][i - 1] + arr[x][i + 1] + arr[x + 1][i - 1]); 
			res.add(arr[x][i] + arr[x][i - 1] + arr[x][i + 1] + arr[x + 1][i + 1]); 
			res.add(arr[x][i] + arr[x - 1][i] + arr[x - 1][i - 1] + arr[x][i + 1]);  // 번개 
			res.add(arr[x][i] + arr[x - 1][i] + arr[x][i - 1] + arr[x - 1][i + 1]);  // 번개 
			
			res.add(arr[x][i] + arr[x - 1][i + 1] + arr[x][i + 1] + arr[x + 1][i + 1]); // ㅓ
			res.add(arr[x][i] + arr[x - 1][i] + arr[x + 1][i] + arr[x][i - 1]); // ㅓ
			res.add(arr[x - 1][i] + arr[x - 1][i + 1] + arr[x][i + 1] + arr[x + 1][i + 1]); // L자 1
			res.add(arr[x + 1][i] + arr[x - 1][i + 1] + arr[x][i + 1] + arr[x + 1][i + 1]); // L자 2
			res.add(arr[x][i] + arr[x - 1][i] + arr[x + 1][i] + arr[x - 1][i - 1]); // L
			res.add(arr[x][i] + arr[x - 1][i] + arr[x + 1][i] + arr[x + 1][i - 1]); // L
			res.add(arr[x][i] + arr[x][i + 1] + arr[x - 1][i + 1] + arr[x + 1][i]); // 번개 
			res.add(arr[x][i] + arr[x][i + 1] + arr[x - 1][i] + arr[x + 1][i + 1]); // 번개 
			
			res.add(arr[x][i] + arr[x + 1][i + 1] + arr[x + 1][i] + arr[x + 1][i - 1]); // ㅗ
			res.add(arr[x][i] + arr[x][i - 1] + arr[x][i + 1] + arr[x - 1][i]); // ㅗ
			res.add(arr[x][i - 1] + arr[x + 1][i + 1] + arr[x + 1][i] + arr[x + 1][i - 1]); // L자 1
			res.add(arr[x][i + 1] + arr[x + 1][i + 1] + arr[x + 1][i] + arr[x + 1][i - 1]); // L자 2
			res.add(arr[x][i] + arr[x][i - 1] + arr[x][i + 1] + arr[x - 1][i - 1]); // L자 1
			res.add(arr[x][i] + arr[x][i - 1] + arr[x][i + 1] + arr[x - 1][i + 1]); // L자 2
			res.add(arr[x][i] + arr[x + 1][i] + arr[x + 1][i + 1] + arr[x][i - 1]); // 번개 
			res.add(arr[x][i] + arr[x + 1][i] + arr[x][i + 1] + arr[x + 1][i - 1]); // 번개 
			
			// 네모
			res.add(arr[x][i] + arr[x][i - 1] + arr[x - 1][i - 1] + arr[x - 1][i]);
			res.add(arr[x][i] + arr[x - 1][i] + arr[x - 1][i + 1] + arr[x][i + 1]);
			res.add(arr[x][i] + arr[x][i + 1] + arr[x + 1][i + 1] + arr[x + 1][i]);
			res.add(arr[x][i] + arr[x + 1][i] + arr[x + 1][i - 1] + arr[x][i - 1]);
	
		}
		
		for(int k : res) {
			if(k > max) {
				max = k;
			}
		}
		
		return max;
	
	}
	
}
