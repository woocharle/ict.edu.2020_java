package com.ict.edu;


/*  ����ó��:  
		����: ���������� ���Ḧ �������� ����� ����, ���� �߻��� ���ܿ� ���� ó���� ���ش�. 
		
		try ~ catch ~ Exception(),  
	 	 - ���ǻ���: ���� catch���� �� �� Exception ���� �ݵ�� catch�� �߿��� ���� �� �ؿ� �� ��.
	 	 - ����: Ex01 ~ 03
	 	 - return: JVM���� ȣ��
	 	
	 	throws
	 	 - ����: ��������, ���� �絵
	 	 - ���: ���� �߻��ϸ� ����ó���� ���� �ʰ�, �ڽ��� ȣ���� ������ ���ܰ�ü�� �����Ѵ�.
	 	 - ���߿� �� ����ó���� �ϴ� ���� ����.
	 	 - ����: Ex04
	 	 
	 	finally
	 	 - ����: ���ܹ߻� ���ο� ������� ������ ����.
	 	 - �뵵: Database, I/O, network���� �̿�.
	 	 - catch�� return�� �־ finally�� ������ �����ϰ� ����.
	 	
	 	����: try{
					���ܰ� �߻��� �� �ִ� ����
			  }
			  catch(���ܹ߻� ��ü e){
			  		���� �߻��� ó���ϴ� �����;
			  }
			  catch(���ܹ߻� ��ü e){
			  		���� �߻��� ó���ϴ� �����;
					return;
			  }
			  ...
			  finally{
			  		������ �����ؾ��� ���ܹ߻� ���ο� ������� ������ ����.
			  }
	 	
			 
*/
public class Ex01 {
	public static void main(String[] args) {
		try {
			int[] var = {10, 20 , 30};
			for (int i = 0; i <= 4; i++) {
				System.out.println(1);
				System.out.println(2);
				System.out.println("var[" + i +"] = " + var[i]);
				System.out.println(3);
				System.out.println(4);
			}
			
		} 
		catch (Exception e) {
			System.out.println("���ܹ߻�");
		}

		System.out.println("�����ϼ̽��ϴ�.");
	}
}
