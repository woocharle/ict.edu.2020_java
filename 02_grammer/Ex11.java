class Ex11{
	public static void main(String[] args){
		// 홍길동이의 국, 영, 수 평균 구하기 

		String name = "홍길동";
		int kor = 90;
		int eng = 80;
 		int mat = 80;
		int sum = kor + eng + mat;
		
		double avg = sum / 3.0;
		int num = (int)(avg * 10);
		avg = num / 10.0;	

		System.out.println("이름: " + name);
		System.out.println("총점: " + sum);
		System.out.println("평균: " + avg);			
		

		// 카페모카가 6500이다. 친구와 둘이서 15000원을 내고 주문했다.
		// 잔돈은 얼마인가?(부가세 10% 포함 해서 계산하시오.)
		
		
		int moka = 6500;
		int pp = 2;
		int total = 15000;
		double per = 1.1; 
		
		int res = total - (int)(moka * pp * per);
	
		System.out.println("거스름돈은 " + res + "원");
	
	}

}