class Ex07{
	public static void main(String[] args){
		byte su1 = 20;
		short su2 = 25;
		int su3 = 30;
		long su4 = 35;

		float su5 = 34.1f;
		double su6 = 247.12;
		
		//byte + byte = int
		int res1 = su1 + su1;
		System.out.println(res1);
		
		int res2 = su2 + su2;
		System.out.println(res2);

		char a = 'a';
		char b = 'c';
		int c = a + b;

		System.out.println(c);
		
		System.out.println("소수 첫째짜리까지 구하기");
		double num1 = 83.5555;
		int num2 = (int)(num1 * 100); 
		num1 = (double)num2 / 100;

		System.out.println(num1);

		System.out.println("10의 자리 절삭하기"); 
		int num3 = 12758;
		num3 = num3 / 10;
		num3 = num3 * 10;
		 
		System.out.println(num3);


	}
}