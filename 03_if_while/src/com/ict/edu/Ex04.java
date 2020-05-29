package com.ict.edu;

public class Ex04 {
	public static void main(String[] args) {
		
		// char k1이 A이면 아프리카, B이면 브라질, C이면 캐나다 나머지 한국
		char k1 = 'A';
		String res;
		
		switch (k1) {
		case 'A':
			res = "아프리카";
			break;
		case 'B':
			res = "브라질";
			break;
		case 'C':
			res = "캐나다";
			break;

		default:
			res = "한국";	
			break;
		}
		
		System.out.println(res);
		
		// char k2이 A,a이면 아프리카, B,b이면 브라질, C,c이면 캐나다 나머지 한국
		
		char k2 = 'a';
		res = "";
		
		switch (k2) {
		case 'A':
		case 'a': res = "아프리카";	break;
		case 'B':
		case 'b': res = "브라질"; break;
		case 'C':
		case 'c': res = "캐나다"; break;
		default: res = "한국"; break;
		}
		
		System.out.println(res);
		
		
		
		// k3가 1 또는 3이면 남자, 2 또는 4이면 여자 
		
		int k3 = 1;
		String gender = "초기화";
		
		switch (k3) {
		case 1: 
		case 3: gender = "남자"; break;
		case 2: 
		case 4: gender = "여자"; break;
		default: gender = "모름"; break;
		}
		
		System.out.println("성별: " + gender);
		
		
		// k4이 한국 = 서울, 중국 = 북경, 일본 = 동경, 미국 = 워싱턴
		
		String k4 = "한국";
		String nation = "미정";
		
		switch (k4) {
		case "한국": nation = "서울"; break;
		case "중국": nation = "북경"; break;
		case "일본": nation = "동경"; break;
		case "워싱턴": nation = "워싱턴"; break;
		default: break;
		}
		
		System.out.println(k4 + "의 수도는 " + nation);
		
		/*menu가 1이면 카페모카 3500, 2이면 카페라떼 4000, 3이면 아메리카노 3000,
		 이면 과일쥬스 3500이다. 친구와 2잔을 10000 내고 먹었다. 잔돈은 얼마인가? (부가세 10% 포함.)*/
		
		int k5 = 2;
		int price = 0;
		String menu = "미정";
		
		switch (k5) {
		case 1: menu = "카페모카"; price = 3500; break;
		case 2: menu = "카페라떼"; price = 4000; break;
		case 3: menu = "아메리카노"; price = 3000; break;
		case 4: menu = "과일쥬스"; price = 3500; break;
		}
		
		int pp = 2;
		int pay = 10000;
		int cng = pay - (int)(pp * price * 1.1); 
		
		System.out.println("메뉴는 " + menu + "거스름돈은 " + cng);
		
	    //k6의 점수가 90이상이면 A, 80이상이면 B, 70이상이면 C, 나머지는 F
		//switch case로 범위를 구하려면 아래처럼 가공을 해야 된다.
		
		int k6 = 97;
		k6 = k6 / 10;
		switch (k6) {
		case 10: 
		case 9:  res = "A"; break;
		case 8:  res = "B"; break;
		case 7:  res = "C"; break;
		default: res = "F"; break;
		}
		
		System.out.println("성적은 " + res);
	}
}
