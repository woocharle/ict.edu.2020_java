import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String data = br.readLine();
		int num = Integer.parseInt(data);
		int tmp = num;
		int cnt = 0;
		
		while(tmp != 1) {
			tmp = tmp / 3;
			cnt++; 
		}
			
		for (int i = 0; i < num; i++) {
			String str_t = "";
			for (int j = 0; j < num ; j++) {
				String str = "*";
				for(int k = 1; k < 3; k++) {
					if(i % Math.pow(3, k) == 1 && j % (int)Math.pow(3, k) == 1) {
						str = " ";
					}
				
					if(k > 1) {
						if(i % Math.pow(3, k) < 2 * Math.pow(3, k - 1) - 1 && 
								i % Math.pow(3, k) >= Math.pow(3, k - 1)) {
							if(j % Math.pow(3, k) < 2 * Math.pow(3, k - 1) - 1 && 
								j % Math.pow(3, k) >= Math.pow(3, k - 1)){
								str = " ";
							}
							
						}
						
					}
				
				}
				str_t += str;
			}
			System.out.println(str_t);
			
		}
		
		/*
		for(int i = 0 ; i < cnt; i++) {			
			for (int j = (int)Math.pow(3, i) ; j < num; j += Math.pow(3, i + 1)) {
				for (int k = (int)Math.pow(3, i); k < num; k += Math.pow(3, i + 1)) {
					for(int l = 0; l < Math.pow(3, i); l++) {
						for(int m = 0; m < Math.pow(3, i) ; m++) {
							st[j + l][k + m] = " ";
						}
					}
						
				}
				
			}

		}
		*/

	}

}

