package test.ict.edu;

import java.util.Calendar;

public class Test {
	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		
		System.out.println("������...");
		System.out.print(now.get(Calendar.YEAR) + "�� ");
		System.out.print((now.get(Calendar.MONTH)+1) + "�� ");
		System.out.print(now.get(Calendar.DAY_OF_MONTH) + "�� ");
		System.out.print(now.get(Calendar.HOUR_OF_DAY) + "�� ");
		System.out.print(now.get(Calendar.MINUTE) + "��");
		int day = now.get(Calendar.DAY_OF_WEEK);
		switch (day) {
			case 1: System.out.println(", �Ͽ���");break;
			case 2: System.out.println(", ������");break;
			case 3: System.out.println(", ȭ����");break;
			case 4: System.out.println(", ������");break;
			case 5: System.out.println(", �����");break;
			case 6: System.out.println(", �ݿ���");break;
			case 7: System.out.println(", �����");break;
		}
		
	}

}
