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
		
		String str12 = "대한민국";
		String str13 = str12.replace("대한민국", "KOREA");
		System.out.println(str12);
		System.out.println(str13);
		System.out.println("==================================================================");
		
		
		//11. contain: 문자열에 해당 문자열이 있는지 확인 
		//String 자체는 변경이 되지 않는다. 그래서 잘못 짜면 메모리 소모가 심하다.
		String str14 = "KOREA @ 대한민국";
		boolean b1 = str14.contains("@");
		System.out.println(b1);
		
		b1 = str14.contains("민국");
		System.out.println(b1);
		
		b1 = str14.contains("$");
		System.out.println(b1);
		
		b1 = str14.contains("KOR");
		System.out.println(b1);
		
		b1 = str14.contains("kor");
		System.out.println(b1);
		
		//12. isEmpty():boolean
		//해당문자열이 비어있으면 true, 아니면 false
		
		String str15 ="";
		b1 = str15.isEmpty();
		System.out.println(b1);

		str15 = "대한민국";
		b1 = str15.isEmpty();
		System.out.println(b1);
		System.out.println("===================================================================");
		
		//13. split(String regex) : String[]
		//split(String regex, int limit) : String[]
		//String regex : 구분자(나눌기준), int limit => 나눌 배열의 크기
		
		String str16 = "사과,딸기,망고 오렌지,파인애플,두리안";
		String[] arr1 = str16.split(",");
		for (String k : arr1) {
			System.out.println(k);
		}
		System.out.println();
		
		String[] arr2 = str16.split(" ");
		for (String k : arr2) {
			System.out.println(k);
		}
		System.out.println();

		String[] arr3 = str16.split(",", 3);
		for (String k : arr3) {
			System.out.println(k);
		}
		
		//14.substring(int beginIndex) : String
		//   시작위치부터 끝까지 추출
		//   substring(int beginIndex, int endIndex) 
		//   시작 위치부터 끝위치 전까지 문자 추출
		String str17 = "010-7777-9999";
		String b2 = str17.substring(4, 8);
		System.out.println(b2);
		System.out.println("===================================================================");
		
		b2 = str17.substring(0, 3);
		System.out.println(b2);
		System.out.println("===================================================================");
		
		String str18 = "770707-1";
		b2 = str18.substring(7, 8);
		System.out.println(b2);
		System.out.println("===================================================================");
		
		//숫자를 집어넣어서 바꾸기 indexof 와 replace
		
		b2 = str18.substring(str18.indexOf("-") + 1 , str18.indexOf("-") + 2);
		System.out.println(b2);
		System.out.println("===================================================================");
				
		//15. toLowerCase(), toUppercase() : 소문자, 대문대로 바꾸는 것.
		
		String str19 = "대한 kOREa 19";
		String b3 = str19.toLowerCase();
		System.out.println(b3);
		
		b3 = str19.toUpperCase();
		System.out.println(b3);
		
		System.out.println("===================================================================");
		
		//16. toString() : String
		// 형을 String으로 형변환
		String str20 = "java 8 자바 8";
		String msg = str20.toString();
		System.out.println(msg);
		System.out.println(str20);
		
		
		System.out.println("===================================================================");
		
		//17. trim() : String
		//해당문자열의 앞, 뒤 공백제거, 중간의 공백은 제거하지 못한다.
		
		String str21 = "java 8 자바 8  ";
		msg = str21.trim();
		int chk = str21.length();
		System.out.println(str21 + ", 문장의 길이: " + chk);
		chk = msg.length();
		System.out.println(msg + ", 문장의 길이: " + chk);
		
		//18. valueOf(자료형) : static String
		//어떤 자료형이든 String으로 변경 시킨다.
		
		boolean bo1 = true;
		char ch1 = 'A';
		int num1 = 34;
		long num2 = 58L;
		float num3 = 3.14f;
		double num4 = 342.12;
		
		System.out.println(bo1);
		System.out.println(ch1);
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println("===================================================================");
		
		//System.out.println(bo1 + 1);
		System.out.println(ch1 + 1);
		System.out.println(num1 + 1);
		System.out.println(num2 + 1);
		System.out.println(num3 + 1);
		System.out.println(num4 + 1);
		System.out.println("===================================================================");
		
		System.out.println(String.valueOf(bo1) + 1);
		System.out.println(String.valueOf(ch1) + 1);
		System.out.println(String.valueOf(num1) + 1);
		System.out.println(String.valueOf(num2) + 1);
		System.out.println(String.valueOf(num3) + 1);
		System.out.println(String.valueOf(num4) + 1);
		System.out.println("===================================================================");
		
		System.out.println(bo1 + "1");
		System.out.println(ch1 + "1");
		System.out.println(num1 + "1");
		System.out.println(num2 + "1");
		System.out.println(num3 + "1");
		System.out.println(num4 + "1");
		System.out.println("===================================================================");
		
		/*19. Wrapper class:
		  - 각 자료형의 형태를 가진 문자열을 진짜 자료형으로 변경시키는 클라스
		  - 원래 의미는 기본 자료형을 객체로 만들 때 사용하는 클래스 (이제는 자동으로 만들어짐)
		  - 문자열을 boolean형으로 : Boolean.parseBoolean();, true와 false밖에 못 들어간다.
		  - 문자열을 정수형으로: Integer.parseInt();
		  - 문자열을 long형으로 : Long.parseLong();, 문자열안에 숫자만 들어가야 하며 숫자 뒤에 L을 붙이면 오류가 난다. ex) 100L 은 오류
		  - 문자열을 float으로 : Float.parseFloat();, long과 마찬가지로 숫자 뒤에 f를 붙여도 오류가 나지 않는다.
		  - 문자열을 double로 : Double.parseDouble();
		  - 문자열을 문자로 바꾸는 Wrapper class는 없다.
		*/
		
		String message = "true";
		boolean m1 = Boolean.parseBoolean(message);
		System.out.println(m1);
		System.out.println("==================================================================="); 
		
		message = "241";
		int m2 = Integer.parseInt(message);
		System.out.println(message + 100);
		System.out.println(m2 + 100);
		System.out.println("==================================================================="); 
		
		message = "241";
		int m3 = Integer.parseInt(message);
		System.out.println(message + 100);
		System.out.println(m3 + 100);
		System.out.println("==================================================================="); 
		
		message = "3.14f";
		float m4 = Float.parseFloat(message);
		System.out.println(message + 10);
		System.out.println(m4 + 10);
		System.out.println("==================================================================="); 
		
		message = "3.14";
		double m5 = Double.parseDouble(message);
		System.out.println(message + 10);
		System.out.println(m5 + 10);
		System.out.println("==================================================================="); 
		
		// 20. toCharArray() : char[]
		// 해당문자열을 char[]로 만들어줌.
		message = "java 자바 JAVA 大韓民國 2020";
		byte[] m7 = message.getBytes();
		for(byte k : m7) {
			System.out.print(k + " ");
		}
		System.out.println("===================================================================");
		
		char[] m8 = message.toCharArray();
		for(char k : m8) {
			System.out.print(k + " ");
		}
		
		
		
	}
}
