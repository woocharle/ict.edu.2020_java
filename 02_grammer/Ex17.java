class Ex17 {
	public static void main(String[] args) {

		System.out.println("대입연산자: 특정 값이나 객체의 주소를 변수에 기억시킬 때 사용 (저장)");

		int su1 = 7;
		int tmp = su1;

		System.out.println(su1 + "에 4를 +=, -=, *=. /=, %= 으로 대입한다.\n");

		su1 += 4;
		System.out.println(su1);

		su1 = tmp;
		su1 -= 4;
		System.out.println(su1);

		su1 = tmp;
		su1 *= 4;
		System.out.println(su1);

		su1 = tmp;
		su1 /= 4;
		System.out.println(su1);

		su1 = tmp;
		su1 %= 4;
		System.out.println(su1);

	}

}