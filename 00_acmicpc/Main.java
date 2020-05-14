
import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] data = str.split(" ");
		int n1 = Integer.parseInt(data[0]);
		int n2 = Integer.parseInt(data[1]);
		int n3 = Integer.parseInt(data[2]);
		int num;
		int i = 0;
		
		if(n1 != 15 && n2 != 28 && n3 != 19) {
			while(true) {
				num = 15 * i + n1;
				if(num % 28 == n2 && num % 19 == n3) {
					System.out.println(num);
					break;
				}
				i++; 
			}
		
		}
		else {

			
		}
			
	}
	
}

