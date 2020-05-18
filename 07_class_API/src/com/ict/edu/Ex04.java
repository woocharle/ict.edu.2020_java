package com.ict.edu;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex04 {
	public static void main(String[] args) {
		// ��¥ ���� Ŭ����: ���� ����ϰ� �ִ� ��ǻ�� ����
		// Data Ŭ����(deprecate => �������� ������ ���� �� �ִ�.)
		// calendar Ŭ���� => Date Ŭ���� ��� ��� ���� Ŭ����
		
		Date date = new Date();
		System.out.println(date);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		System.out.println(sdf.format(date));
		
		System.out.println(date.getYear() + 1900 + "��");   // 2020 - 1900 getyear�� ����� �� ����.
		System.out.println(date.getMonth() + 1 + "��");   // 2020 - 1900 getyear�� ����� �� ����.
		System.out.println(date.getDate()+1900 + "��");   // 2020 - 1900 getyear�� ����� �� ����.
		System.out.println(date.getHours()+1900 + "��");   // 2020 - 1900 getyear�� ����� �� ����.
		System.out.println(date.getMinutes()+1900 + "��");   // 2020 - 1900 getyear�� ����� �� ����.
		System.out.println(date.getSeconds()+1900 + "��");   // 2020 - 1900 getyear�� ����� �� ����.
		System.out.println("==================================================================");
		
		int k = date.getDay(); // 0 - 6 , 0 => �Ͽ���, 6 => �����
		switch (k){
		case 0: System.out.println("�Ͽ���"); break;
		case 1: System.out.println("������"); break;
		case 2: System.out.println("ȭ����"); break;
		case 3: System.out.println("������"); break;
		case 4: System.out.println("�����"); break;
		case 5: System.out.println("�ݿ���"); break;
		case 6: System.out.println("�����"); break;
		}
		System.out.println("==================================================================");
		
		//calendarŬ����:  
		//Calendar (���������̸�) = Calendar.getInstance();
		
		Calendar now = Calendar.getInstance();
		
		System.out.println(now.get(Calendar.YEAR) + "��");
		System.out.println(now.get(Calendar.MONTH) + 1 + "��");
		System.out.println(now.get(Calendar.DATE) + "��");
		System.out.println(now.get(Calendar.DAY_OF_MONTH) + "��");
		System.out.println("==================================================================");
		System.out.println(now.get(Calendar.HOUR));
		System.out.println(now.get(Calendar.HOUR_OF_DAY));  //24�ð���
		
		int res = now.get(Calendar.AM_PM);
		if(res == 0){
			System.out.println("AM " + now.get(Calendar.HOUR) + "��");
		}
		else if(res == 1){
			System.out.println("PM " + now.get(Calendar.HOUR)+ "��");
		}
		
		System.out.println(now.get(Calendar.MINUTE) + "��");
		System.out.println(now.get(Calendar.SECOND) + "��");
		
		res = now.get(Calendar.DAY_OF_WEEK); // 1 - 7, 1 => �Ͽ���, 7 => �����
		switch (res){
		case 1: System.out.println("�Ͽ���"); break;
		case 2: System.out.println("������"); break;
		case 3: System.out.println("ȭ����"); break;
		case 4: System.out.println("������"); break;
		case 5: System.out.println("�����"); break;
		case 6: System.out.println("�ݿ���"); break;
		case 7: System.out.println("�����"); break;
		}
	
		
		
		
		
		
	}
}
