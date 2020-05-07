class Ex09{
	public static void main(String[] args){
		int s1 = 9;
		int s2 = 4;
		int res = 0;
		
		res = s1 + s2;
		System.out.println("결과 : " + res);

		res = s1 - s2;
		System.out.println("결과 : " + res);

		res = s1 * s2;
		System.out.println("결과 : " + res);

		System.out.println("나눗셈의 두 가지 타입 \n");
		res = s1 / s2;
		System.out.println("몫만 만든다.");
		System.out.println("결과 : " + res);

		double result = (double)s1/ s2;

		System.out.println("실수형으로 만들어서 뽑는다.");
		System.out.println("결과 : " + result);

		res = s1 % s2;
		System.out.println("결과 : " + res);

		

	}

}
