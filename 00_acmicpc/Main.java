
import java.io.*;
import java.util.*;

public class Main{
	static int[] data;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str_1 = br.readLine();
		String str_2 = br.readLine();
		String[] input_1 = str_1.split(" ");
		String[] input_2 = str_2.split(" ");
		
		int num = Integer.parseInt(input_1[0]);
		int std = Integer.parseInt(input_1[1]);
		data = new int[num];
		
	 	
		for (int i = 0; i < data.length; i++) {
			data[i] = Integer.parseInt(input_2[i]);
		}
		
		int[] n_case = new int [num - 2];  
		int max = 0;
		for(int i = 0; i < n_case.length; i++) {
			n_case[i] = jack(i, std, data);
			//System.out.println(n_case[i]);
			if(n_case[i] > max) {
				max = n_case[i];
			}
		}
		
		System.out.println(max);
			
	}
	
	public static int jack(int c, int std , int[] data) {		
		int max = 0;
		
		for (int i = c + 1; i < data.length - 1 ; i++) {
			int sum = data[c] + data[i];
			for (int j = i + 1; j < data.length; j++) {
				sum += data[j];
				if(sum > max && sum <= std) {
					max = sum;
				}
				sum -= data[j];
			}
		}
		
		return max;
	}

	
}

