class Ex04{
	public static void main(String[] args){
		byte b1 = 127;
		System.out.println(b1);

		byte b2 = 15 + 12;
		System.out.println(b2);

		short s1 = -32768;
		System.out.println(s1);

		short s2 = 32767;
		System.out.println(s2);

		int su1 = 247;
		int su2 = 777777;
		System.out.println(su1);
		System.out.println(su2);

		long num1 = 124L;      //  long은 기본적으로 L이나 l을 붙이지만 생략가능.
		long num2 = 124;
		System.out.println(num1);
		System.out.println(num2);	


		long num3 = su1;
		System.out.println(num3);

		long num4 = s1;
		System.out.println(num4);

		int su3 = s1;
		System.out.println(su3);		

		char c1 = 'A';
		int su4 = c1;
		System.out.println(su4);	
		
	}

}