
import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] name = str.split("-");
		char[] data = new char [name.length]; 
		str = "";
		
		for(int i = 0; i < data.length; i++) {
			data[i] = name[i].charAt(0);
			str += Character.toString(data[i]); 
		}
		
		System.out.println(str);
			
	}
	
}

