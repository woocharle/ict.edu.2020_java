package com.ict.edu;

public class Ex02 {
	public static void main(String[] args) {
		String str = "ICT���簳�߿� 2������";
		
		// 3. charAt(int index) : char
		// ��ġ������ ���ڷ� ������ �ش� ��ġ�� ���ڸ� ����
		
		char c1 = str.charAt(5);
		System.out.println(c1);
	
		String str2 = "���ѹα� I love you 123";

		for(int i = 0; i < str2.length(); i++) {
			c1 = str2.charAt(i);
			if (c1 >= 'a' && c1 <= 'z') {
				c1 = (char)(c1 - 32);
			}
			System.out.print(c1);
			
		}
		System.out.println();
		
		// 4. concat(String str)
		// �Էµ� ���ڿ��� �ش� ���ڿ��� ��ģ��.
		
		str = "���ѹα�";
		str2 = "KOREA";
		String res = str.concat(str2);
		System.out.println(res);
		
		String str3 = "Korea";
		String str4 = "KOREA";
		
		if(str3.equals(str4)) {
			System.out.println("����.");
		}
		else {
			System.out.println("�ٸ���");
		}
		
		if(str3.equalsIgnoreCase(str4)) {
			System.out.println("����.");
		}
		else {
			System.out.println("�ٸ���");
		}
		
		System.out.println();
		
		//5. format (String format, Object ... args)
		//������ �����ϰ� ���Ŀ� ���� ����
		String str5 = "ICT ���� ���߿�";
		res = String.format("%s", str5);
		System.out.println(res);
		System.out.println();
		res = String.format("%30s", str5);
		System.out.println(res);
		System.out.println();
		
		// 6. getBytes(): byte[]
		// �ش繮�ڿ��� byte�� ��ȯ��Ų��.
		// ���� ������� �� ����Ѵ�.
		
		String str6 = "java";
		byte[] b= str6.getBytes();
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + "  ");
		}
		System.out.println();
		
		//7. indexOf(int ch), indexOf(String str) :
		// char�� string�� ������ ��ġ���� �˷���.
		String str10 = "BufferedReader";
		
		//'r'�� ��ġ���� ã�ƶ�.
		
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
		// ���⼭ int fromIndex�� ������ġ�� ���Ѵ�. 
		//����: �ش� ���ڿ��� ù��° �����Ӹ� �ƴ϶� �ι�° �̻��� ���ϴ� ������ ���ڸ� ã�� �� ����.
		
		k1 = str10.indexOf("r", str10.indexOf('r') + 1);
		System.out.println(k1);
		System.out.println();

		k1 = str10.indexOf("K");
		System.out.println(k1);
		System.out.println();
		
		k1 = str10.lastIndexOf("ed");
		System.out.println(k1);
		
		//9. length(): int 
		//�ش繮�ڿ��� ���̸� ����. (for���� ���� ���)
		
		String str11 = "abcABC123������";
		k1 = str11.length();
		System.out.println("����: " + k1);
		
		//10. replace:  ���ڿ� �� ���ڸ� �ٸ� ���ڷ� ��ĥ �� 
		
		String str12 = "���ѹα�";
		String str13 = str12.replace("���ѹα�", "KOREA");
		System.out.println(str12);
		System.out.println(str13);
		System.out.println("==================================================================");
		
		
		//11. contain: ���ڿ��� �ش� ���ڿ��� �ִ��� Ȯ�� 
		//String ��ü�� ������ ���� �ʴ´�. �׷��� �߸� ¥�� �޸� �Ҹ� ���ϴ�.
		String str14 = "KOREA @ ���ѹα�";
		boolean b1 = str14.contains("@");
		System.out.println(b1);
		
		b1 = str14.contains("�α�");
		System.out.println(b1);
		
		b1 = str14.contains("$");
		System.out.println(b1);
		
		b1 = str14.contains("KOR");
		System.out.println(b1);
		
		b1 = str14.contains("kor");
		System.out.println(b1);
		
		//12. isEmpty():boolean
		//�ش繮�ڿ��� ��������� true, �ƴϸ� false
		
		String str15 ="";
		b1 = str15.isEmpty();
		System.out.println(b1);

		str15 = "���ѹα�";
		b1 = str15.isEmpty();
		System.out.println(b1);
		System.out.println("===================================================================");
		
		//13. split(String regex) : String[]
		//split(String regex, int limit) : String[]
		//String regex : ������(��������), int limit => ���� �迭�� ũ��
		
		String str16 = "���,����,���� ������,���ξ���,�θ���";
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
		//   ������ġ���� ������ ����
		//   substring(int beginIndex, int endIndex) 
		//   ���� ��ġ���� ����ġ ������ ���� ����
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
		
		//���ڸ� ����־ �ٲٱ� indexof �� replace
		
		b2 = str18.substring(str18.indexOf("-") + 1 , str18.indexOf("-") + 2);
		System.out.println(b2);
		System.out.println("===================================================================");
				
		//15. toLowerCase(), toUppercase() : �ҹ���, �빮��� �ٲٴ� ��.
		
		String str19 = "���� kOREa 19";
		String b3 = str19.toLowerCase();
		System.out.println(b3);
		
		b3 = str19.toUpperCase();
		System.out.println(b3);
		
		System.out.println("===================================================================");
		
		//16. toString() : String
		// ���� String���� ����ȯ
		String str20 = "java 8 �ڹ� 8";
		String msg = str20.toString();
		System.out.println(msg);
		System.out.println(str20);
		
		
		System.out.println("===================================================================");
		
		//17. trim() : String
		//�ش繮�ڿ��� ��, �� ��������, �߰��� ������ �������� ���Ѵ�.
		
		String str21 = "java 8 �ڹ� 8  ";
		msg = str21.trim();
		int chk = str21.length();
		System.out.println(str21 + ", ������ ����: " + chk);
		chk = msg.length();
		System.out.println(msg + ", ������ ����: " + chk);
		
		//18. valueOf(�ڷ���) : static String
		//� �ڷ����̵� String���� ���� ��Ų��.
		
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
		  - �� �ڷ����� ���¸� ���� ���ڿ��� ��¥ �ڷ������� �����Ű�� Ŭ��
		  - ���� �ǹ̴� �⺻ �ڷ����� ��ü�� ���� �� ����ϴ� Ŭ���� (������ �ڵ����� �������)
		  - ���ڿ��� boolean������ : Boolean.parseBoolean();, true�� false�ۿ� �� ����.
		  - ���ڿ��� ����������: Integer.parseInt();
		  - ���ڿ��� long������ : Long.parseLong();, ���ڿ��ȿ� ���ڸ� ���� �ϸ� ���� �ڿ� L�� ���̸� ������ ����. ex) 100L �� ����
		  - ���ڿ��� float���� : Float.parseFloat();, long�� ���������� ���� �ڿ� f�� �ٿ��� ������ ���� �ʴ´�.
		  - ���ڿ��� double�� : Double.parseDouble();
		  - ���ڿ��� ���ڷ� �ٲٴ� Wrapper class�� ����.
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
		// �ش繮�ڿ��� char[]�� �������.
		message = "java �ڹ� JAVA �������� 2020";
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
