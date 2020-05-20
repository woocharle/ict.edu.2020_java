package com.ict.edu01;

//�߻�Ŭ������ �̿��� ��� �߻� �޼ҵ带 ������ �ִ� Ŭ����

/*
abstract class Abs{
	int data = 10000;
	public abstract void printData();
}

class AbsTest extends Abs{
...
}

*/


interface Abs{
	int data = 10000;
	public abstract void printData();
}

// member Ŭ����
class AbsTest implements Abs{
	public void printData() {
		System.out.println("data1 : " + data);
		
	}
}

// anonymous Ŭ���� ����
class AbsTest2{
	//�߻�Ŭ������ ��ӹ��� �ʰ� �ٷ� ��ü ����.
	Abs abs = new Abs() {
		public void printData() {
			System.out.println("data2 : " + data);
		}
	};
}

class AbsTest3{
	public void play() {
		new Abs() {
			@Override
			public void printData() {
				System.out.println("data3 : " + data);
				
			}
		}.printData();;
	}
}


public class Ex07 {
	public static void main(String[] args) {
		AbsTest abstest = new AbsTest(); 
		abstest.printData();
		
		//ȣ�� ����
		AbsTest2 abstest2 = new AbsTest2();
		abstest2.abs.printData();
		
		AbsTest3 abstest3 = new AbsTest3();
		abstest3.play();
		
		
	}
}

