class Ex11{
	public static void main(String[] args){
		// ȫ�浿���� ��, ��, �� ��� ���ϱ� 

		String name = "ȫ�浿";
		int kor = 90;
		int eng = 80;
 		int mat = 80;
		int sum = kor + eng + mat;
		
		double avg = sum / 3.0;
		int num = (int)(avg * 10);
		avg = num / 10.0;	

		System.out.println("�̸�: " + name);
		System.out.println("����: " + sum);
		System.out.println("���: " + avg);			
		

		// ī���ī�� 6500�̴�. ģ���� ���̼� 15000���� ���� �ֹ��ߴ�.
		// �ܵ��� ���ΰ�?(�ΰ��� 10% ���� �ؼ� ����Ͻÿ�.)
		
		
		int moka = 6500;
		int pp = 2;
		int total = 15000;
		double per = 1.1; 
		
		int res = total - (int)(moka * pp * per);
	
		System.out.println("�Ž������� " + res + "��");
	
	}

}