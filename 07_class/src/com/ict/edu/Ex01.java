package com.ict.edu;

public class Ex01 {
	// String Ŭ���� �ֿ� �޼ҵ�
	public static void main(String[] args) {
		// 1. String ��ü ���� 
		
		String str1 = "abc";
		
	    char data[] = {'a', 'b', 'c'};
	    String str2 = new String(data);
	    System.out.println(str2);
	    
	    byte[] data2 = {97, 98, 99};
	    String str3 = new String(data2);
	    
	    String data3 = "ABC";
	    String str4 = new String(data3);
	    
	    char[] data4 = {'A', 'B', 'C'};
	    String str5 = new String(data4);
	    
	    System.out.println(str1);
	    System.out.println(str2);
	    System.out.println(str3);
	    System.out.println(str4);
	    System.out.println(str5);
	    
	    
	    /* String�� "==" ǥ���� �� �� ����. �ֳ��ϸ� if���� �ش� ���ڿ��� ������ �ƴ� �ּ��� ��ġ���θ� 
	    // �Ǵ��ϱ� �����̴�. �׷��Ƿ� ���ڿ����� �����Ͱ� ���ٶ�� ���� 
	      2. equals(), equalsIgnoreCase() �޼ҵ带 ����Ѵ�.
	    */
	    if(str1 == str2) {
	    	System.out.println("����.");
	    }
	    else {
	    	System.out.println("�ٸ���.");
	    }
	    
	    if(str4.equals(str5)) {
	    	System.out.println("����.");
	    }
	    else {
	    	System.out.println("�ٸ���.");
	    }
	    
	    
	}

}
