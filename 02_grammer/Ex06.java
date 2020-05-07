class Ex06{
	public static void main(String[] args){
		System.out.println("숫자들의 크기에 따른 저장 원리");
		System.out.println("byte < short < char < int < long < float < double");
		System.out.println("1. 자동형변환");
		
		int s1 = 'A';
		System.out.println(s1);

		long s2 = 241;
		System.out.println(s2);

		float s3 = s2;
		System.out.println(s3);

		double s4 = s3;
		System.out.println(s4);

		System.out.println("2.캐스팅: 자기보다 작은 자료형으로 저장할 때 오류 발생을 위해 강제로 형 변환");
		System.out.println("강제로 변환하면 데이터가 변경될 수 있다.");		

		byte b1 = (byte)(129);
		System.out.println(b1);

		int b2 = 110;
		byte b3 = (byte)b2;
		System.out.println(b3); 

		float b4 = (float)34.125;
		System.out.println(b4);

		int b5 = (int)87.82;
		System.out.println(b5);

		double b6  = 87.12;
		
		System.out.println(b6);
		
		//3. char변환
		char c1 = 'a' + 2;
		System.out.println(c1);

		char c2 = 97 + 2;
		System.out.println(c2);

		int b7 = c2;
		System.out.println(b7);


	}
}