class Ex05{
	public static void main(String[] args){
		float su1 = 24; 		// 정수가 실수로
		System.out.println(su1);

		/*
		float su2 = 31.4;		//f를 붙이지 않으면 오류생김.
		System.out.println(su2);
		*/

		float su2 = 31.4f;
		System.out.println(su2);

		char c1 = 97;
		System.out.println(c1);

		float su3 = c1;
		System.out.println(su3);

		double su4 = 3.14;
		System.out.println(su4);

		double su5 = su3;
		System.out.println(su5);

		double su6 = c1;
		System.out.println(su6);

	}

}