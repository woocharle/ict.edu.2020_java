class Ex14{
	public static void main(String[] args){
		
		int su1 = 90;
		int su2 = 80;

		char su3 = 'a';
		char su4 = 'A';

		double su5 = 97.0;
		double su6 = 78.0;

		boolean	res = su1 > su2;
		System.out.println("결과: " + res);

		res = su3 > su4;
		System.out.println("결과: " + res);

		res = su5 > su6;
		System.out.println("결과: " + res);

		res = su1 > su3;
		System.out.println("결과: " + res);

		res = su1 > su5;
		System.out.println("결과: " + res);
	
		res = su3 == su5;
		System.out.println("결과: " + res);

	}

}