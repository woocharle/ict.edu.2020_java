package com.ict.edu01;

//추상클래스를 이용한 방법 추상 메소드를 가지고 있는 클래스

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

// member 클래스
class AbsTest implements Abs{
	public void printData() {
		System.out.println("data1 : " + data);
		
	}
}

// anonymous 클래스 예시
class AbsTest2{
	//추상클래스를 상속받지 않고 바로 객체 생성.
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
		
		//호출 예시
		AbsTest2 abstest2 = new AbsTest2();
		abstest2.abs.printData();
		
		AbsTest3 abstest3 = new AbsTest3();
		abstest3.play();
		
		
	}
}

