import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		int n = 1;
		int a;
		String str_t; 
		
		do {
			String str = br.readLine();
			int input = Integer.parseInt(str);
			a = input;
			if (a != 0){
				
			}
			
		} while(a != 0);
		
		//System.out.println(str_t);

		
		

		/*
		// 에라토스테네스의 체 
		
		int[] chk = new int[b + 1];
			
		for(int i = 0; i <= b ; i++) {
			if(i < 2) {
				chk[i] = 0;
			}
			else {
				chk[i] = i;
			}
		}
		
		for(int i = 2; i <= b; i++) {
			for(int j = 2 * i ; j <= b; j += i) {
				chk[j] = 0;
			}
		}
		
		// 거르기 완료
		
		for(int i = a; i <= b; i++) {
			if(chk[i] != 0) {
				System.out.println(chk[i]);
			}
		
		}
		*/
	}

}

