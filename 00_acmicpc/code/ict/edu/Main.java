package code.ict.edu;

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] n0 = str.split(" ");
		int row = Integer.parseInt(n0[0]);
		int col = Integer.parseInt(n0[1]);
		char[][] arr = new char[row][col]; 
		char[][] arr1 = new char[8][8]; 
		char[][] arr2 = new char[8][8]; 
		
		for (int i = 0; i < 8; i++) {
			if(i % 2 == 0) {
				for (int j = 0; j < 8; j++) {
					if(j % 2 == 0) {
						arr1[i][j] = 'B';
						arr2[i][j] = 'W';
					} else {
						arr1[i][j] = 'W';
						arr2[i][j] = 'B';
					}
				}
			} else {
				for (int j = 0; j < 8; j++) {
					if(j % 2 == 0) {
						arr1[i][j] = 'W';
						arr2[i][j] = 'B';
					} else {
						arr1[i][j] = 'B';
						arr2[i][j] = 'W';
					}
				}
			}
			
		}
		
		for (int i = 0; i < row; i++) {
			str = br.readLine();
			for (int j = 0; j < col; j++) {
				arr[i][j] = str.charAt(j);
			}	
		}
		
		int cnt = row * col;
		int cnt1 = 0;
		int cnt2 = 0;
		
		for (int i = 0; i < row - 7; i++) {
			for (int j = 0; j < col - 7; j++) {
				cnt1 = check(arr, arr1, i, j);
				cnt2 = check(arr, arr2, i, j);
				
				if(cnt >= cnt1) {
					cnt = cnt1;
				}
				
				if(cnt >= cnt2) {
					cnt = cnt2;
				}
				
				
			}
		
		}
		

		System.out.println(cnt);
		
	}
	
	public static int check(char[][] arr1, char[][] arr2, int k, int l) {
		int cnt = 0;

		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				if(arr1[k + i][l + j] != arr2[i][j]) {
					cnt++;
				}
			
			}
		}
		return cnt;
	}

}
