package com.ict.edu;

/*  Thread.
 	- �������� ���� �ֱ�: ppt�� Thread �����ֱ� �׸� �ʱ��� ��.
    - Thread Class�� start(), run()�� �����Ѵ�.
    - �ڵ� ������ ���� �켱������ ����. 
    - Thread�� �̸��� ���� �� �ִ�. ex) new Thread([class�� ������ ��ü], [�̸�(String)])
    - sleep(millis): ����_�ش� millis�� ���� ��� �� ��, millis: 1/1000��
	- ���� ������: 
	  �Ϲ� �������� �۾��� ���� �������� ������ �����ϴ� ������. 
	  �Ϲ� �����尡 �����ϸ� ���� ������� ���������� ���� ��.
	  setDaemon(boolean e): e�� true: main�� �����ϸ� thread ����, false: main�� �����ص� thread �۵�.
    
    - join(): ���� �����忡�� ���ϴ� �ܺ� �����尡 ���������� �����·� ���� �ִٰ� 
  	          �� �����尡 �����ϸ� �����ϰ� �ϴ� ��ɾ�. join�� ȣ���� �����尡 ������ ������ �����ϴ�.
    
    - ex)
      com.ict.edu2: ����ó�� 
      com.ict.edu3: Runnable �̿�.
      com.ict.edu4: Thread ���� ����. (setDeamon, join)
  	
  	Synchronized
  	- ppt�� synchronized �帧�� �����ֱ� �׸� �ʱ��� ��.
  	- �Ӱ迵��: ��Ƽ�����忡�� �������� ���Ǵ� ����, 
  			    ���� ���� ���� �����尡 ���İ��� �ٸ� �����忡�� ������� ���ѱ�� ������ �߻��Ѵ�.
  			    �̸� �ذ��ϱ� ���� ����� ����ȭ ó���̴�. 
  			  
  	- ����ȭó��: �Ӱ迵���� synchronized ���� ����ϸ� �ȴ�.
  				  ���� �������� �����尡 ���� ������ �ٸ� ������� ������ �� ����.
  	- wait(): ������ �����带 ��� ���·� ����� method
  	          �����带 Ǯ������ ������ �״�� �����·� ������.  
  	- wait()�� �����带 Ǯ���ִ� ������ notify(), notifyAll() �̴�.
  	   
  	
  	- com.ict.edu5: synchronized.
  	- Thread�� run()�� ���� �ٸ� �޼ҵ忡�� ���� �� �ִ�.
  	- ���� 674p
  	
  	
  	
*/

//�̱� ������
public class Ex01 {
	public static void main(String[] args) {
		// ���� ���� ���� ������
		System.out.println(Thread.currentThread().getName());
	
		Ex02 test = new Ex02();
		test.play();
		System.out.println(1);
		String name = test.sound();
		System.out.println(name);
		System.out.println(2);
		
		System.out.println("========================================================================");
		// �̱� ������
		Ex03 test2 = new Ex03();
		System.out.println(Thread.currentThread().getName() + " 1");
		test2.go();
		System.out.println(Thread.currentThread().getName() + " 2");
		test2.run();
		
		//test2.start();
		System.out.println(Thread.currentThread().getName() + " 3");
		
		
		System.out.println("========================================================================");
		
		System.out.println(Thread.currentThread().getName() + " 1");
		test2.go();
		System.out.println(Thread.currentThread().getName() + " 2");
		//test2.run();
		
		test2.start();
		System.out.println(Thread.currentThread().getName() + " 3");
		
		
	}
	
}
