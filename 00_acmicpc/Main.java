
import java.io.*;
import java.util.*;

public class Main{
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
		
		
		
		int[] fig = new int[6];
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			fig[0]= fig1(i, arr);
		}
		
		for (int i = 0; i < y; i++) {
			fig[1] = fig1(i, arr);
		}
		

	}
	
	public static int fig1(int k, int[][] arr) {
		int max = 0;
		int sum = 0;
		int a = arr.length - 4;
		int b = arr[k].length - 4;
		
		for (int i = 0; i < b + 1; i++) {
			for (int j = 0; j < 4; j++) {
				sum += arr[k][i + j];
			}
			if(sum > max) {
				max = sum;
			}
		}
		
		for (int i = 0; i < a + 1; i++) {
			for (int j = 0; j < 4; j++) {
				sum += arr[a + j][k];
			}
			if(sum > max) {
				max = sum;
			}
		}

	
		
		return max;
	}
	
	
	
	
	public static int fig2(int x, int y, int[][] arr) {
		int max = 0;
		
		return max;
	}
	
	public static int fig3(int x, int y, int[][] arr) {
		int max = 0;
		
		return max;
	}
	
	public static int fig4(int x, int y, int[][] arr) {
		int max = 0;
		
		return max;
	}
	
	public static int fig5(int x, int y, int[][] arr) {
		int max = 0;
		
		return max;
	}
	
	
	
	
	
}

