
public class Ex18 {
	public static void main(String[] args) {
		System.out.println("���ǿ�����(���׿�����)");
		System.out.println("����: ���庯�� = ���ǽ� ? ���϶� ���� ���� : ������ �� ���๮��");
		System.out.println("���ǽĿ� ���� ����: boolean�� -> �񱳿���, ��������, boolean");
		
		String res = true ? "�հ�" : "���հ�";	
		System.out.println("���: " + res);
		
		int point1 = false ? 10 : 20 ;
		long point2 = true ? 10 : 20 ; 
		double point3 = true ? 10 : 24.7 ; 

		// ����� 90�̻��̸� 'A' �ƴϸ� 'B'
		double avg = 87.6;
		int result = avg >= 90 ? 'A' : 'B'; 
		
		System.out.println((char)result);
	
		
	}
	
}