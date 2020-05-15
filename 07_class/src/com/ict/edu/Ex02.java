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
		
		
		
		
		
		
		//String ��ü�� ������ ���� �ʴ´�. �׷��� �߸� ¥�� �޸� �Ҹ� ���ϴ�.
		
		
	}
}
