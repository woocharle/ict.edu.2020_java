package com.ict.edu;

public class Ex02 {
	public static void main(String[] args) {
		String str = "ICT인재개발원 2강의장";
		
		// 3. charAt(int index) : char
		// 위치정보가 숫자로 들어오면 해당 위치의 글자를 추출
		
		char c1 = str.charAt(5);
		System.out.println(c1);
	
		String str2 = "대한민국 I love you 123";

		for(int i = 0; i < str2.length(); i++) {
			c1 = str2.charAt(i);
			if (c1 >= 'a' && c1 <= 'z') {
				c1 = (char)(c1 - 32);
			}
			System.out.print(c1);
			
		}
		System.out.println();
		
		// 4. concat(String str)
		// 입력된 문자열을 해당 문자열과 합친다.
		
		str = "대한민국";
		str2 = "KOREA";
		String res = str.concat(str2);
		System.out.println(res);
		
		String str3 = "Korea";
		String str4 = "KOREA";
		
		if(str3.equals(str4)) {
			System.out.println("같다.");
		}
		else {
			System.out.println("다르다");
		}
		
		if(str3.equalsIgnoreCase(str4)) {
			System.out.println("같다.");
		}
		else {
			System.out.println("다르다");
		}
		
		System.out.println();
		
		//5. format (String format, Object ... args)
		//형식을 지정하고 형식에 맞춰 생성
		String str5 = "ICT 인재 개발원";
		res = String.format("%s", str5);
		System.out.println(res);
		System.out.println();
		res = String.format("%30s", str5);
		System.out.println(res);
		System.out.println();
		
		// 6. getBytes(): byte[]
		// 해당문자열을 byte로 변환시킨다.
		// 보통 입출력할 때 사용한다.
		
		String str6 = "java";
		byte[] b= str6.getBytes();
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + "  ");
		}
		System.out.println();
		
		//7. indexOf(int ch), indexOf(String str) :
		// char나 string이 들어오면 위치값을 알려줌.
		String str10 = "BufferedReader";
		
		//'r'의 위치값을 찾아라.
		
		int k1 = str10.indexOf("r");
		System.out.println(k1);
		System.out.println();
		
		k1 = str10.indexOf("er");
		System.out.println(k1);
		System.out.println();

		k1 = str10.indexOf("K");
		System.out.println(k1);
		System.out.println();
		
		//8. indexOf(int ch, int fromIndex), indexOf(String str, int fromInder) :
		// 여기서 int fromIndex란 시작위치를 말한다. 
		//목적: 해당 문자열의 첫번째 순서뿐만 아니라 두번째 이상의 원하는 순서의 문자를 찾을 때 쓴다.
		
		k1 = str10.indexOf("r", str10.indexOf('r') + 1);
		System.out.println(k1);
		System.out.println();

		k1 = str10.indexOf("K");
		System.out.println(k1);
		System.out.println();
		
		k1 = str10.lastIndexOf("ed");
		System.out.println(k1);
		
		//9. length(): int 
		//해당문자열의 길이를 구함. (for문에 많이 사용)
		
		String str11 = "abcABC123가나다";
		k1 = str11.length();
		System.out.println("길이: " + k1);
		
		//10. replace:  문자열 중 문자를 다른 문자로 고칠 때 
		
		
		
		
		
		
		//String 자체는 변경이 되지 않는다. 그래서 잘못 짜면 메모리 소모가 심하다.
		
		
	}
}
