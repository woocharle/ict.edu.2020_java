package com.ict.edu08;

/* �������̽� 
	- ����: ���񽺸� �����ϴ� ���, 
	- Ư¡: ����� �߻�޼ҵ��� �̷������. �����ڰ� ����. (��ü ���� �� �� ������ �� ��.)
	        �����ϰ� ���� ���(�������̽��� ū ����)�� �����ϴ�. 
	        class�� body������ �Ʒ��ִ°� ���� ������ interface�� body������ ��δ� static final�� ���ֵȴ�. 
			interface�� abstract�� �� �ᵵ �߻�޼ҵ带 ������ �� �ִ�.
	- ��Ӱ���
	  �Ϲ�Ŭ����: �ݵ�� �������̵� �� ��.
	  �߻�Ŭ����: �������̵� �� �ʿ䰡 ����.
	  �������̽�: �������̵� �� �ʿ䰡 ����.
			
	- ����: class�� class�� ����� �� extends
			interface�� interface�� ����� �� extends
			class�� interface�� ����� �� implements
			ex) public class Calc implements Add, Sub 
						
			implements�� �߻�޼ҵ带 ������ �ǹ��Ѵ�.
			interface�� class�� ���� ������� �ʴ´�.
			
	- interface: ������ �����ϴ� ���. 
	
*/
public interface Ex01 {
	int su1 = 10;
	static int su2 = 20;
	final int SU3 = 30;
	static final int SU4 = 40; 
	
	//public void play() {};
	
	//�Ϲ����� �߻� �޼ҵ�
	public abstract void play();
	
	public void sound();
	
}
