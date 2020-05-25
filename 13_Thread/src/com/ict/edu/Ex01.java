package com.ict.edu;

/*  Thread.
 	- ppt�� Thread �����ֱ� �׸� �ʱ��� ��.
    - Thread Class�� start(), run()�� �����Ѵ�.
    - Thread�� �̸��� ���� �� �ִ�. ex) new Thread([class�� ������ ��ü], [�̸�(String)])
    
    - com.ict.edu2: ����ó�� 
    - com.ict.edu3: Runnable �̿�.
    - com.ict.edu4: Thread ���� ����. (setDeamon, join)
  	
  	Synchronized
  	- ppt�� synchronized �帧�� �����ֱ� �׸� �ʱ��� ��.
  	- �Ӱ迵��: ��Ƽ�����忡�� �������� ���Ǵ� ����, 
  			    ���� ���� ���� �����尡 ���İ��� �ٸ� �����忡�� ������� ���ѱ�� ������ �߻��Ѵ�.
  			    �̸� �ذ��ϱ� ���� ����� ����ȭ ó���̴�. 
  			  
  	- ����ȭó��: �Ӱ迵���� synchronized ���� ����ϸ� �ȴ�.
  				  ���� �������� �����尡 ���� ������ �ٸ� ������� ������ �� ����.
  	
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
