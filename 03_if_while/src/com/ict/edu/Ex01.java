package com.ict.edu;

public class Ex01 {
	public static void main(String[] args) {
		int k1 = 59;
		String str = "불합격";
		if(k1 >= 60) {
			str = "합격";
		}
		
		System.out.println("결과: " + str);
		System.out.println("수고하셨습니다.");
		
		
		// 홀짝 판별
		int k2 = 59;
		str = "짝수";
		if(k2 % 2 == 1) {
			str = "홀수";
		}
		
		System.out.println("결과: " + str);
		System.out.println("수고하셨습니다.");		
		
		
		// 대문자 소문자 판별
		
		char k3 = '1';
		str = "초기화";
		
		if(k3 >= 'a' && k3 <= 'z') {
			str = "소문자";
		}
		else if(k3 >= 'A' && k3 <= 'Z'){
			str = "대문자";
		}
		else {
			str = "기타";
		}
		
		System.out.println("결과: " + str);
		System.out.println("수고하셨습니다.");	
		
		// 1 또는 3이면 남자, 아니면 여자
		
		int k4 = 1;
		
		if(k4 == 1) {
			str = "1900년대 남자";
		}
		else if(k4 == 2){
			str = "1900년대 여자";
		}
		else if(k4 == 3){
			str = "2000년대 남자";
		}
		else if(k4 == 4){
			str = "2000년대 여자";
		}
		else {
			str = "기타";
		}
		
		System.out.println("결과: " + str);
	
		int time = 10;
		int dan = 8590;
		int pay = 0;
		
		if(time < 10) {
			pay = time * dan;
		}
		else {
			pay = (int)((time - 8) * dan * 1.5) + 8 * dan;
		}
		
		System.out.println("결과: " + pay);	
		
		// 두 수 중 큰 값
		
		int k7 = 10;
		int k8 = 15;
		int result; 
		
		if(k7 < k8) {
			result = k8;
		}
		else if(k7 > k8){
			result = k7;			
		}
		else {
			result = 0;
		}	
		
		if(result != 0) {
			System.out.println("결과: " + result);	
		}
		else {
			System.out.println("결과: equal");	
		}
		
	}
}