package com.ict.edu;

public class Ex01 {
	// String 클래스 주요 메소드
	public static void main(String[] args) {
		// 1. String 객체 생성 
		
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
	    
	    
	    /* String은 "==" 표현을 쓸 수 없다. 왜냐하면 if문이 해당 문자열의 내용이 아닌 주소의 일치여부를 
	    // 판단하기 때문이다. 그러므로 문자열에서 데이터가 같다라는 뜻은 
	      2. equals(), equalsIgnoreCase() 메소드를 써야한다.
	    */
	    if(str1 == str2) {
	    	System.out.println("같다.");
	    }
	    else {
	    	System.out.println("다르다.");
	    }
	    
	    if(str4.equals(str5)) {
	    	System.out.println("같다.");
	    }
	    else {
	    	System.out.println("다르다.");
	    }
	    
	    
	}

}
