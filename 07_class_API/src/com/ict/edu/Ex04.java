package com.ict.edu;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex04 {
	public static void main(String[] args) {
		// 날짜 관련 클래스: 현재 사용하고 있는 컴퓨터 기준
		// Data 클래스(deprecate => 언제든지 지원을 끊을 수 있다.)
		// calendar 클래스 => Date 클래스 대신 사용 중인 클래스
		
		Date date = new Date();
		System.out.println(date);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		System.out.println(sdf.format(date));
		
		System.out.println(date.getYear() + 1900 + "년");   // 2020 - 1900 getyear는 써먹을 수 없다.
		System.out.println(date.getMonth() + 1 + "월");   // 2020 - 1900 getyear는 써먹을 수 없다.
		System.out.println(date.getDate()+1900 + "일");   // 2020 - 1900 getyear는 써먹을 수 없다.
		System.out.println(date.getHours()+1900 + "시");   // 2020 - 1900 getyear는 써먹을 수 없다.
		System.out.println(date.getMinutes()+1900 + "분");   // 2020 - 1900 getyear는 써먹을 수 없다.
		System.out.println(date.getSeconds()+1900 + "초");   // 2020 - 1900 getyear는 써먹을 수 없다.
		System.out.println("==================================================================");
		
		int k = date.getDay(); // 0 - 6 , 0 => 일요일, 6 => 토요일
		switch (k){
		case 0: System.out.println("일요일"); break;
		case 1: System.out.println("월요일"); break;
		case 2: System.out.println("화요일"); break;
		case 3: System.out.println("수요일"); break;
		case 4: System.out.println("목요일"); break;
		case 5: System.out.println("금요일"); break;
		case 6: System.out.println("토요일"); break;
		}
		System.out.println("==================================================================");
		
		//calendar클래스:  
		//Calendar (참조변수이름) = Calendar.getInstance();
		
		Calendar now = Calendar.getInstance();
		
		System.out.println(now.get(Calendar.YEAR) + "년");
		System.out.println(now.get(Calendar.MONTH) + 1 + "월");
		System.out.println(now.get(Calendar.DATE) + "일");
		System.out.println(now.get(Calendar.DAY_OF_MONTH) + "일");
		System.out.println("==================================================================");
		System.out.println(now.get(Calendar.HOUR));
		System.out.println(now.get(Calendar.HOUR_OF_DAY));  //24시간제
		
		int res = now.get(Calendar.AM_PM);
		if(res == 0){
			System.out.println("AM " + now.get(Calendar.HOUR) + "시");
		}
		else if(res == 1){
			System.out.println("PM " + now.get(Calendar.HOUR)+ "시");
		}
		
		System.out.println(now.get(Calendar.MINUTE) + "분");
		System.out.println(now.get(Calendar.SECOND) + "초");
		
		res = now.get(Calendar.DAY_OF_WEEK); // 1 - 7, 1 => 일요일, 7 => 토요일
		switch (res){
		case 1: System.out.println("일요일"); break;
		case 2: System.out.println("월요일"); break;
		case 3: System.out.println("화요일"); break;
		case 4: System.out.println("수요일"); break;
		case 5: System.out.println("목요일"); break;
		case 6: System.out.println("금요일"); break;
		case 7: System.out.println("토요일"); break;
		}
	
		
		
		
		
		
	}
}
