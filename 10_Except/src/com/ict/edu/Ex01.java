package com.ict.edu;


/*  예외처리:  
		목적: 비정상적인 종료를 정상적인 종료로 유도, 예외 발생시 예외에 대한 처리를 해준다. 
		
		try ~ catch ~ Exception(),  
	 	 - 주의사항: 다중 catch문을 할 때 Exception 사용시 반드시 catch문 중에서 제일 맨 밑에 쓸 것.
	 	 - 예시: Ex01 ~ 03
	 	 - return: JVM으로 호출
	 	
	 	throws
	 	 - 정의: 예외전가, 예외 양도
	 	 - 기능: 예외 발생하면 예외처리를 하지 않고, 자신을 호출한 곳으로 예외객체를 전달한다.
	 	 - 나중에 라도 예외처리를 하는 것이 좋다.
	 	 - 예시: Ex04
	 	 
	 	finally
	 	 - 정의: 예외발생 여부와 상관없이 수행할 영역.
	 	 - 용도: Database, I/O, network에서 이용.
	 	 - catch에 return이 있어도 finally의 영역을 수행하고 간다.
	 	
	 	형식: try{
					예외가 발생할 수 있는 문장
			  }
			  catch(예외발생 객체 e){
			  		예외 발생시 처리하는 문장들;
			  }
			  catch(예외발생 객체 e){
			  		예외 발생시 처리하는 문장들;
					return;
			  }
			  ...
			  finally{
			  		무조건 실행해야할 예외발생 여부와 상관없이 수행할 영역.
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
			System.out.println("예외발생");
		}

		System.out.println("수고하셨습니다.");
	}
}
