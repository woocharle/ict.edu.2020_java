
public class Ex19 {
	public static void main(String[] args) {
		int k1 = 7;
		String res = k1 % 2 == 1 ? "Ȧ��" : "¦��";
		System.out.println(res);
		
		
		int k2 = 76;
		res = k2 > 60  ? "�հ�" : "���հ�";
		System.out.println(res);		
		
		
		char k3 = 'H';
		res = (k3 >= 'A' && k3 <= 'Z') ? "�빮��" : "�ҹ���";
		System.out.println(res);
		
		// �ʰ��ٹ� ���� �ñ� 8590, �ʰ��� ��� 1.5��, �ٹ��ð� 10��
		
		int time = 10;
		int dan = 8590;
		//double salary = time > 8 ? (8 * dan + (time - 8) * 1.5 * dan) : time * dan; 
		//System.out.println("���� �ϴ��� "  + (int)salary + "�� �Դϴ�.");

		int salary = time > 8 ? (8 * dan) + (int)((time - 8) * 1.5 * dan) : time * dan; 
		
		System.out.println("���� �ϴ��� "  + salary + "�� �Դϴ�.");
		
	}
	
}















