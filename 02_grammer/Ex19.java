
public class Ex19 {
	public static void main(String[] args) {
		int k1 = 7;
		String res = k1 % 2 == 1 ? "홀수" : "짝수";
		System.out.println(res);
		
		
		int k2 = 76;
		res = k2 > 60  ? "합격" : "불합격";
		System.out.println(res);		
		
		
		char k3 = 'H';
		res = (k3 >= 'A' && k3 <= 'Z') ? "대문자" : "소문자";
		System.out.println(res);
		
		// 초과근무 수당 시급 8590, 초과할 경우 1.5배, 근무시간 10배
		
		int time = 10;
		int dan = 8590;
		//double salary = time > 8 ? (8 * dan + (time - 8) * 1.5 * dan) : time * dan; 
		//System.out.println("오늘 일당은 "  + (int)salary + "원 입니다.");

		int salary = time > 8 ? (8 * dan) + (int)((time - 8) * 1.5 * dan) : time * dan; 
		
		System.out.println("오늘 일당은 "  + salary + "원 입니다.");
		
	}
	
}
















