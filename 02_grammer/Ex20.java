
public class Ex20 {
	public static void main(String[] args) {
		// char c1�� �빮�� ���� �ҹ��� ���� �Ǻ�����.
		
		char c1 = 'Q';
		String res = (c1 >= 'A' && c1 <= 'Z') ? "�빮��" : ((c1 >= 'a' && c1 <= 'z') ? "�ҹ���" : "��Ÿ") ;
		System.out.println("���: " + res);
		
		// int k2 �� 90�̻��̸�, 80�̻��̸� B
		int point = 94;
		String grade = point >= 90 ? "A" : (point >= 80 ? "B" : "F") ;
		System.out.println("����: " + grade);
		
		// int k3�� 1 �Ǵ� 3�̸� ����, 2 �Ǵ� 4����, �������� �ܱ��� 
		int k3 = 1;
		res = (k3 == 1 || k3 == 3) ? "����" : ((k3 == 2 || k3 == 4) ? "����" : "��Ÿ") ;
		System.out.println("���: " + res);
		
		// int k4�� 1 �Ǵ� 3�̸� ����, 2 �Ǵ� 4����, �������� �ܱ��� 
		// 1 �Ǵ� 2�̸� 1900���, 3 �Ǵ� 4 �̸� 2000�� ��
		int k4 = 1;
		res = (k4 == 1 || k4 == 3) ? (k4 == 1 ? "1900��� �¾ ����" : "2000��� �¾ ����") 
				: ((k4 == 2 || k4 == 4) ? (k4 == 2 ? "1900��� �¾ ����" : "2000��� �¾ ����")  : "��Ÿ") ;
		System.out.println("���: " + res);
		
	}
}