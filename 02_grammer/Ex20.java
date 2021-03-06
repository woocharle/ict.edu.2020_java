
public class Ex20 {
	public static void main(String[] args) {
		// char c1이 대문자 인지 소문자 인지 판별하자.
		
		char c1 = 'Q';
		String res = (c1 >= 'A' && c1 <= 'Z') ? "대문자" : ((c1 >= 'a' && c1 <= 'z') ? "소문자" : "기타") ;
		System.out.println("결과: " + res);
		
		// int k2 가 90이상이면, 80이상이면 B
		int point = 94;
		String grade = point >= 90 ? "A" : (point >= 80 ? "B" : "F") ;
		System.out.println("학점: " + grade);
		
		// int k3가 1 또는 3이면 남자, 2 또는 4여자, 나머지는 외국인 
		int k3 = 1;
		res = (k3 == 1 || k3 == 3) ? "남자" : ((k3 == 2 || k3 == 4) ? "여자" : "기타") ;
		System.out.println("결과: " + res);
		
		// int k4가 1 또는 3이면 남자, 2 또는 4여자, 나머지는 외국인 
		// 1 또는 2이면 1900년생, 3 또는 4 이면 2000년 생
		int k4 = 1;
		res = (k4 == 1 || k4 == 3) ? (k4 == 1 ? "1900년대 태어난 남자" : "2000년대 태어난 남자") 
				: ((k4 == 2 || k4 == 4) ? (k4 == 2 ? "1900년대 태어난 여자" : "2000년대 태어난 여자")  : "기타") ;
		System.out.println("결과: " + res);
		
	}
}
