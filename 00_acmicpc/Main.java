import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int num = Integer.parseInt(str);
		int[] res = new int [num]; 
		
		for(int i = 0; i < num ; i++) {
				str = br.readLine();
				String data[] = str.split(" "); 
				int dep = Integer.parseInt(data[0]);
				int arr = Integer.parseInt(data[1]);
				int dis = arr - dep;
				double move = 0;
				res[i] = 0;
				double cnt = 0;
				
				do{
					cnt += 1; 
					move = Math.pow(cnt, 2) + cnt;	
					
				}while(move >= dis);

				if(move - cnt >= dis) {
					cnt -= 1;
				}
			
				
				res[i] = (int)cnt;
				
		}
		
		for (int i = 0; i < num; i++) {
			System.out.println(res[i]);
		}

	}

}

