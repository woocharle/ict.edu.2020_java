class Ex16{
	public static void main(String[] args){
		
		int su1 = 10;
		int su2 = 7;
		boolean result = false;
		
		System.out.println("||(����) \n");
		
		result = (su1 >= 7) || (su2 >= 5);         	// true = true || true
		System.out.println("��� : " + result);

		result = (su1 >= 7) || (su2 <= 5); 		// true = true || false
		System.out.println("��� : " + result);

		result = (su1 <= 7) || (su2 >= 5); 		// true = false || true
		System.out.println("��� : " + result);

		result = (su1 <= 7) || (su2 <= 5); 		// false = false || false
		System.out.println("��� : " + result);

		System.out.println("\n==============================================================\n");

		System.out.println("OR�� �������� true�� ����� true�̰�, �� ������ �������� �ʴ´�. \n");
		result = ((su1 = su1 + 2) > su2) || (su1 == (su2 = su2 + 5));
		System.out.println("���: " + result);
		System.out.println("su1: " + su1);
		System.out.println("su2: " + su2 + "\n");

		System.out.println("==============================================================\n");
		
		System.out.println("!(�� ����)\n");

		result = true;

		System.out.println(result);
		System.out.println(! result);
		System.out.println(!! result);		
		System.out.println(!!! result);

	}

}