package com.ict.edu01;

import java.net.InetAddress;
import java.net.UnknownHostException;

/*  
     코드변경 수정.
	InetAddress
     - 자바에서 IP주소를 표현하는 클래스, 생성자가 존재하지만 사용하지 않는다.
     - 6개의 static 메소드 사용
     ※ localhost란? 현재 내가 사용하고 있는 컴퓨터를 말한다.  
 
 	URL(Unifrom Resource Locator)클래스
 	 - 인터넷에서 접근 가능한 자원의 주소.
 	 - final 클래스이다. (상속 불가)
 	 - 원격지 서버 자원의 결과만 가져온다.
 	 - 예제) Ex02
 	 
 	URLConnection clase 
 	 - 원격지 서버의 자원의 결과와 원격 서버의 헤더 정보들을 가져올 수 있다.
 	 - 예제) Ex03
 	 
 	 ※ 크롤링이란? 분산 저장된 수집하는 기술. 소스가 공개되었다고 함부로 공유하면 안 된다.
 	 
 	인터넷 정보
 	 - 헤더와 바디로 나뉨.
 	 - 헤더 정보를 가지고 웹 브라우저가 해석하고 실행한다.
 	 - 헤더 정보를 얻어내는 방법. (Ex03 참고)
 	 - 파싱: 어떤 페이지에서 내가 원하는 데이터를 특정 패턴이나 순서로 추출해서 가공하는 것.
 	 - xml
 	   정의: eXtensible Markup Language => 확장될 수 있는 표시 언어.
 	   사용자가 태그를 만들어서 사용할 수 있다.
 	   <시작태그 속성 = "값"> 내용 </끝태그> 
 	   Markup Language: 태그 <>
 	
 	 - xml 파싱(parsing): xml로 구성된 데이터를 원하는 데이터만 추출, 가공하는 방법.
 	 - DOM(Document Object Modeling) 방식: 웹브라우저가 태그를 해석하고 표현하는 방식.
 	 
 	 - JSON(JavaScript Object Notation), JSON 파일읽기 Ex06참고
 	   데이터 오브젝트를 전달하기 위해 인간이 읽을 수 있는 텍스트를 사용하는 개방형 표준 포맷.
 	   "속성-값 쌍" 또는 "키-값 쌍"으로 이루어짐.
 	   비동기 브라우저/서버 통신을 위해, 넓게는 XML을 대체하는 주요 데이터 포맷이라고도 한다.
 	   
 	   JSON 파일 읽기: JSON을 읽는 외부라이브러리 연결하기
 	   해당프로젝트에서 마우스 오른쪽 => Build path => 
 	 
 	
 */

public class Ex01_intro {
	public static void main(String[] args) {
		try {
			InetAddress addr = InetAddress.getLocalHost();
			System.out.println("이름 : " + addr.getHostName());
			System.out.println("주소 : " + addr.getHostAddress());
			System.out.println("toString() : " + addr.toString());
			System.out.println("=======================================================");
			
			addr = InetAddress.getByName("www.naver.com");
			System.out.println("이름 : " + addr.getHostName());
			System.out.println("주소 : " + addr.getHostAddress());
			System.out.println("toString() : " + addr.toString());
			System.out.println("=======================================================");
			
			byte[] b = {(byte) 210,89,(byte) 164,90};
			addr = InetAddress.getByAddress(b);
			System.out.println("이름 : " + addr.getHostName());
			System.out.println("주소 : " + addr.getHostAddress());
			System.out.println("toString() : " + addr.toString());
			System.out.println("=======================================================");
			
			//InetAddress를 배열로 사용
			InetAddress[] addrs = InetAddress.getAllByName("m.naver.com");
			for (InetAddress k : addrs) {
				System.out.println("이름 : " + k.getHostName());
				System.out.println("주소 : " + k.getHostAddress());
				System.out.println("toString() : " + k.toString());
				System.out.println("------------------------------------------------------");
			}
			
			
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
