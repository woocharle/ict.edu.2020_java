class Ex06{
	public static void main(String[] args){
		System.out.println("���ڵ��� ũ�⿡ ���� ���� ����");
		System.out.println("byte < short < char < int < long < float < double");
		System.out.println("1. �ڵ�����ȯ");
		
		int s1 = 'A';
		System.out.println(s1);

		long s2 = 241;
		System.out.println(s2);

		float s3 = s2;
		System.out.println(s3);

		double s4 = s3;
		System.out.println(s4);

		System.out.println("2.ĳ����: �ڱ⺸�� ���� �ڷ������� ������ �� ���� �߻��� ���� ������ �� ��ȯ");
		System.out.println("������ ��ȯ�ϸ� �����Ͱ� ����� �� �ִ�.");		

		byte b1 = (byte)(129);
		System.out.println(b1);

		int b2 = 110;
		byte b3 = (byte)b2;
		System.out.println(b3); 

		float b4 = (float)34.125;
		System.out.println(b4);

		int b5 = (int)87.82;
		System.out.println(b5);

		double b6  = 87.12;
		
		System.out.println(b6);
		
		//3. char��ȯ
		char c1 = 'a' + 2;
		System.out.println(c1);

		char c2 = 97 + 2;
		System.out.println(c2);

		int b7 = c2;
		System.out.println(b7);


	}
}