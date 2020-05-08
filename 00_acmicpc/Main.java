import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int n = Integer.parseInt(str);
		int[] num = new int[n];
		String[] res = new String[n];
		
		for (int i = 0; i < n; i++) {
			str = br.readLine();
			num[i] = Integer.parseInt(str);
			//int cnt = 0;
			int min = 0;
			int max = 0;
			
			// 에라토스테네스의 체
			int[] chk = new int[num[i] + 1];
				
			for(int j = 0; j < chk.length ; j++) {
				if(j < 2) {
					chk[j] = 0;
				}
				else {
					chk[j] = j;
				}
			}
			
			for(int j = 2; j < chk.length ; j++) {				
				for(int k = 2 * j ; k < chk.length; k += j) {
					chk[k] = 0;
				}
				
			}
			// 거르기 완료
			for(int j = 0; j <chk.length; j++) {
				if(chk[j] == 0) {
					continue;
				}
				if(chk[j] != 0) {
					//cnt++;
					// option
					if(chk[j] <= num[i] / 2) {
						min = chk[j];
					}
					if(chk[j] == num[i] - min) {
						max = chk[j];
						break;
					}
					
				}
			}
			
			res[i] = Integer.toString(min) + " " + Integer.toString(max);
		}
		
		for (int i = 0; i < n; i++) {
			System.out.println(res[i]);
		}
	
	}

}

