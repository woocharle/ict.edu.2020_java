
public class Ex18 {
	public static void main(String[] args) {
		System.out.println("조건연산자(삼항연산자)");
		System.out.println("형식: 저장변수 = 조건식 ? 참일때 실행 문장 : 거짓일 때 실행문장");
		System.out.println("조건식에 들어가는 연산: boolean형 -> 비교연산, 논리연산, boolean");
		
		String res = true ? "합격" : "불합격";	
		System.out.println("결과: " + res);
		
		int point1 = false ? 10 : 20 ;
		long point2 = true ? 10 : 20 ; 
		double point3 = true ? 10 : 24.7 ; 

		// 평균이 90이상이면 'A' 아니면 'B'
		double avg = 87.6;
		int result = avg >= 90 ? 'A' : 'B'; 
		
		System.out.println((char)result);
	
		
	}
	
}
