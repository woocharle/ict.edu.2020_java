class Ex01{
	public static void main(String[] args){
	//  boolean형 데이터를 저장하고 출력하는 방법
	//  1. 선언 :  자료형   이름 ;  // 선언은 처음 한번하면된다.
		boolean result ;

	//  2. 데이터 저장 ; 이름 = 데이터 (boolean);
                result =  true;
	
	//  3. 데이터를 가지고 있는 변수 출력하기 
		System.out.println(result);
		result = false;

	// 선언된 변수는 다시 선언하지 않아도 사용가능
		System.out.println(result);	
	/*
		result = "true";	
		System.out.println(result);
	*/

	}
}