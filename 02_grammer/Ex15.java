class Ex15{
	public static void main(String[] args){
		
		int su1 = 10;
		int su2 = 7;
		boolean result = false;
		
		System.out.println("&&(논리곱) \n");
		
		result = (su1 >= 7) && (su2 >= 5);         	// true = true && true
		System.out.println("결과 : " + result);

		result = (su1 >= 7) && (su2 <= 5); 		// false = true && false
		System.out.println("결과 : " + result);

		result = (su1 <= 7) && (su2 >= 5); 		// false = false && true
		System.out.println("결과 : " + result);

		result = (su1 <= 7) && (su2 <= 5); 		// false = false && false
		System.out.println("결과 : " + result);

		System.out.println("\n==============================================================\n");

		result = ((su1 = su1 + 2) > su2) && (su1 == (su2 = su2 + 5));
		System.out.println("결과: " + result);
		System.out.println("su1: " + su1);
		System.out.println("su2: " + su2 + "\n");

		System.out.println("==============================================================\n");
		
		System.out.println("AND는 false를 만나면 결과는 false이고, 뒤 조건은 연산하지 않는다. \n");
		result = ((su1 = su1 + 2) < su2) && (su1 == (su2 = su2 + 5));
		System.out.println("결과: " + result);
		System.out.println("su1: " + su1);
		System.out.println("su2: " + su2+ "\n");

		su1 = 34;
		
		System.out.println("su1(=" + su1 +")의 값이 20 ~ 30 사이의 값인가?");
		result = (su1 >= 20) && (su1 <= 30);
		System.out.println("결과: " + result + "\n");
	
		char c1 = 'A';

		System.out.println("char c1("+ c1+")이 소문자 일까?");	

		result = (c1 >= 'a') && (c1 <= 'z');
		System.out.println("결과: " + result + "\n");

	}

}