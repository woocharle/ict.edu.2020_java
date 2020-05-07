import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int num = Integer.parseInt(str);
		
		int[] num_1 = new int[num]; //입력 데이터 층
		int[] num_2 = new int[num]; //입력 데이터 호수
		
		for(int i = 0; i < num ; i++) {
			num_1[i] = Integer.parseInt(br.readLine());
			num_2[i] = Integer.parseInt(br.readLine());
			System.out.println(rule(num_1[i], num_2[i]));
		}
		
	}

	public static int rule(int row, int col) {
		
		int sum = 0;
		int[] num = new int[col];
		int[] tmp = new int[col];
		
		for(int i = 0; i < col; i++) {
			num[i] = i + 1;
			tmp[i] = num[i];
		}
		
		for(int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				sum = 0;
				for(int k = 0; k <= j; k++) {
					sum += tmp[k];
				}	
				num[j] = sum;
				//System.out.println(num[j]);
			}
			for(int j = 0; j < col; j++) {
				tmp[j] = num[j];
			}

		}
		
		sum= num[col - 1];
	
		return sum;
		
	}

}

