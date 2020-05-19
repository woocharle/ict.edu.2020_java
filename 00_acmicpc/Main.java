
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
		
		
		int max = 0;
		int fig;
		int[] figs = new int[3];
		
		for (int i = 0; i < arr.length; i++) {
			figs[0]= fig1(i, arr);
			if(max < figs[0]) {
				max = figs[0];
			}
		}
		
		for (int i = 0; i < y; i++) {
			figs[1]= fig2(i, arr);
			if(max < figs[1]) {
				max = figs[1];
			}
		}
		
		figs[2] = fig3(x , y, arr);
		
				
		
		
		
		
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
		
		for (int i = 0; i < x - 1; i++) {
			sum = 0;
			for (int j = 0; j < y - 1; j++) {
				sum += arr[i][j] + arr[i][j + 1] + arr[i + 1][j] + arr[i + 1][j + 1];
			}
			if(sum > max) {
				max = sum;
			}
		}
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
	
	public static int fig6(int x, int y, int[][] arr) {
		int max = 0;
		
		return max;
	}
	
	
	
	
	
}

