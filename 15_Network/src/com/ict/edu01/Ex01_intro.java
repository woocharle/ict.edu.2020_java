package com.ict.edu01;

import java.net.InetAddress;
import java.net.UnknownHostException;

/*  
	InetAddress
     - �ڹٿ��� IP�ּҸ� ǥ���ϴ� Ŭ����, �����ڰ� ���������� ������� �ʴ´�.
     - 6���� static �޼ҵ� ���
     �� localhost��? ���� ���� ����ϰ� �ִ� ��ǻ�͸� ���Ѵ�.  
 
 	URL(Unifrom Resource Locator)Ŭ����
 	 - ���ͳݿ��� ���� ������ �ڿ��� �ּ�.
 	 - final Ŭ�����̴�. (��� �Ұ�)
 	 - ������ ���� �ڿ��� ����� �����´�.
 	 - ����) Ex02
 	 
 	URLConnection clase 
 	 - ������ ������ �ڿ��� ����� ���� ������ ��� �������� ������ �� �ִ�.
 	 - ����) Ex03
 	 
 	 �� ũ�Ѹ��̶�? �л� ����� �����ϴ� ���. �ҽ��� �����Ǿ��ٰ� �Ժη� �����ϸ� �� �ȴ�.
 	 
 	���ͳ� ����
 	 - ����� �ٵ�� ����.
 	 - ��� ������ ������ �� �������� �ؼ��ϰ� �����Ѵ�.
 	 - ��� ������ ���� ���. (Ex03 ����)
 	 - �Ľ�: � ���������� ���� ���ϴ� �����͸� Ư�� �����̳� ������ �����ؼ� �����ϴ� ��.
 	 - xml
 	   ����: eXtensible Markup Language => Ȯ��� �� �ִ� ǥ�� ���.
 	   ����ڰ� �±׸� ���� ����� �� �ִ�.
 	   <�����±� �Ӽ� = "��"> ���� </���±�> 
 	   Markup Language: �±� <>
 	
 	 - xml �Ľ�(parsing): xml�� ������ �����͸� ���ϴ� �����͸� ����, �����ϴ� ���.
 	 - DOM(Document Object Modeling) ���: ���������� �±׸� �ؼ��ϰ� ǥ���ϴ� ���.
 	 
 	 - JSON(JavaScript Object Notation)
 	   ������ ������Ʈ�� �����ϱ� ���� �ΰ��� ���� �� �ִ� �ؽ�Ʈ�� ����ϴ� ������ ǥ�� ����.
 	   "�Ӽ�-�� ��" �Ǵ� "Ű-�� ��"���� �̷����.
 	   �񵿱� ������/���� ����� ����, �аԴ� XML�� ��ü�ϴ� �ֿ� ������ �����̶�� �Ѵ�.
 	 
 	 
 	
 */

public class Ex01_intro {
	public static void main(String[] args) {
		try {
			InetAddress addr = InetAddress.getLocalHost();
			System.out.println("�̸� : " + addr.getHostName());
			System.out.println("�ּ� : " + addr.getHostAddress());
			System.out.println("toString() : " + addr.toString());
			System.out.println("=======================================================");
			
			addr = InetAddress.getByName("www.naver.com");
			System.out.println("�̸� : " + addr.getHostName());
			System.out.println("�ּ� : " + addr.getHostAddress());
			System.out.println("toString() : " + addr.toString());
			System.out.println("=======================================================");
			
			byte[] b = {(byte) 210,89,(byte) 164,90};
			addr = InetAddress.getByAddress(b);
			System.out.println("�̸� : " + addr.getHostName());
			System.out.println("�ּ� : " + addr.getHostAddress());
			System.out.println("toString() : " + addr.toString());
			System.out.println("=======================================================");
			
			//InetAddress�� �迭�� ���
			InetAddress[] addrs = InetAddress.getAllByName("m.naver.com");
			for (InetAddress k : addrs) {
				System.out.println("�̸� : " + k.getHostName());
				System.out.println("�ּ� : " + k.getHostAddress());
				System.out.println("toString() : " + k.toString());
				System.out.println("------------------------------------------------------");
			}
			
			
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
