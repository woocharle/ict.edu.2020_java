package code.ict.edu;

import java.io.*;


public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		int n = Integer.parseInt(str);
		int cnt = 0;
		
		for (int i = n - 1; i > 0; i--) {
			int m = n - i;
			
			
			int a = chk(m);
			int b = 0;

			
			
			cnt += perm(i + a + b, i, a, b);
			
			
			
		}
		
		
		System.out.println(perm(5, 3, 2, 0));
		
	
	}
	
	public static int perm(int t, int a, int b, int c) {
		int tf = 1;
		int af = 1;
		int bf = 1;
		int cf = 1;
		
		for (int i = t; i > 1; i--) {
			tf *= i;
		}
		
		for (int i = a; i > 1; i--) {
			af *= i;
		}
		
		for (int i = b; i > 1; i--) {
			bf *= i;
		}
		
		for (int i = c; i > 1; i--) {
			cf *= i;
		}
		
		return tf / af / bf / cf;
		
	}
	
	public static int chk(int m) {
		int res = 0;
		if(m <= 3) {
			switch (m) {
				case 1: res = 1; break;
				case 2: res = 1; break;
				case 3: res = 1; break;
		
			}
		}
		// 3이하인 경우
		
		return res;
	}
	
}
