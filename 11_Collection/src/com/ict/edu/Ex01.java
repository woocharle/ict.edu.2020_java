
package com.ict.edu;

public class Ex01 {
	/*  제네릭과 컬렉션
	제네닉: 컬렉션이 어떤 객체들로 이뤄졌는지 표시하는 객체 타입.
	컬렉션: 객체들을 모아서 관리하는 인터페이스들을 말함.
	API
	 - <T> => 객체 타입, <E> => 요소, 컬렉션 안에 존재하는 객체 하나를 의미한다.
	Map형식: <K, V> => Key(키값), Value(데이터값)
			 key와 value는 1:1 대응, ** key를 호출하면 value가 나온다.
	형식: 컬렉션<제네닉>
	최상위 컬렉션은 Collection<E>, Map<K, V> 
 	 - Collection<E>를 상속받은 자식들: Set<E>, List<E>, Queue<E>
	
	Collection의 메소드.
	add(E e): boolean => 해당 컬렉션에 객체 추가, 성공하면 true, 실패하면 false
	 				  => 보통은 리턴값을 잘 받지 않는다.
	addAll(Collection<? extends E> c) : boolean
	  => 특정 컬렉션에 있는 모든 요소들을 다른 컬렉션에 추가
	clear(): void => 모든 요소 삭제.
	contains(Object o) : boolean => 해당컬렉션에 인자로 들어온 객체가 존재하면 true, 
									존재하지 않으면 false.
	isEmpty(): boolean  => 해당 컬렉션이 비어있으면 true, 비어잇지 않으면 false
	iterator(): Iterator<E> => 컬렉션 안에 존재하는 객체들을 순서대로 접근하기 위한 
	 						   Iterator 객체를 반환, 컬렉션 안에 존재하는 객체를 하나씩 꺼내서 작업할 때 사용
	remove(Object o) : boolean => 인자로 들어오는 객체 삭제. 성공 true, 실패하면 false. 
								루프문으로 삭제를 할 때 인자를 삭제하면 범위 자체가 변하기 때문에 break문을 써서 탈출시켜야 한다. 
	size() : int => 컬렉션안에 존재하는 객체의 수(for문에 사용.)
	toArray() : 컬렉션을 배열로 만들때 사용.	   
	
	Set인터페이스를 구현한 클래스: HashSet, TreeSet;
	 - 특징: 중복 안 됨, 정렬 안 됨.(TreeSet은 항상 오름차순상태)
	 - 형식:  
	   컬렉션 생성: HashSet<제네릭 = 객체타입 = 클래스> 참조변수 = new HashSet<제네릭>() ;
	   
	 - 작동방식  
	   오토박싱 : 변수를 자동으로 객체로 만든다. 자료형이 무조건 맞아야 한다. 
	   언박싱: 객체를 일반적으로 사용하는 자료형을 전환.
	   하나씩 보기<개선된 for문, iterator를 써야 한다.>
	  
	   
	   * Map<K, V>은 개선된 for문을 못 쓰고 iterator만 써야 한다. 
	   
	 - 예제: Ex02
	   for문이용
	   iterator 이용
	 - 예제: Ex03  
	   
	
*/
	
	
	
	
}
