package com.ict.edu;

public class Ex07 {
	public static void main(String[] args) {
		System.out.println("while��");
	
		System.out.println("---------------- for vs while ----------------");
		
		System.out.println("for�� �̿�");
		for (int i = 0; i < 11; i++) {
			System.out.print(i + " ");
		}
		
		System.out.println("\n");
		
		System.out.println("while�� �̿�");
		int k1 = 0;
		
		while (k1 < 11) {
			System.out.print(k1 + " ");
			k1 += 1;
		}
		
		System.out.println("\n");
		
		System.out.println("while��(true) �̿�");
		
		k1 = 0;
		
		while (true) {
			if (k1 > 10) break;
			System.out.print(k1 + " ");
			k1 += 1;
		}
		
		System.out.println("\n");
		System.out.println("���� \n");
		
		// 0 ~ 10���� ¦���� ���
		
		k1 = 0;
		
		while (k1 < 11) {
			if(k1 % 2 == 0) {
				System.out.print(k1 + " ");
			}
			k1 += 1;
		}
		
		System.out.println("\n");
		
		// 0 ~ 10���� Ȧ���� ���
		
		k1 = 0;
		
		while (k1 < 11) {
			if(k1 % 2 != 0) {
				System.out.print(k1 + " ");
			}
			k1 += 1;
		}
		
		System.out.println("\n");
		
		// 0 ~ 50���� 7�� ����� ���
		
		k1 = 1;
		
		while (k1 <= 50) {
			if(k1 % 7 == 0) {
				System.out.print(k1 + " ");
			}
			k1 += 1;
		}
		

		// a ~ g���� ���
		
		System.out.println("\n");
		
		char c1 = 'a';
		
		while (c1 <= 'g') {
			System.out.print(c1 + " ");
			
			c1 += 1;
		}

		System.out.println("\n");
		
		// 5�� (������)
		
		k1 = 1;
		
		while(k1 < 10) {
			System.out.println(5 + " x " + k1 + " = " + k1 * 5);
			k1++; 
		}
		
		System.out.println();
	
		/* �Ʒ��� ������ ����Ͻÿ�.
		0 0 0 0
		0 0 0 0
		0 0 0 0
		0 0 0 0
		*/
		
		k1 = 0;
		/*
		while(k1 < 4) {
			for(int i = 0; i < 4; i++) {
				System.out.print("0 ");
			}
			System.out.println();
			k1++;
		}
		*/
		
		while(k1 < 4) {
			System.out.print("0 0 0 0 \n");
			k1++;
		}
		
		System.out.println("\nHomework \n");
		System.out.println("0 ���� 10 ������");
		
		k1 = 0;
		int sum = 0;
		while(k1 < 10) {
			k1++;
			sum += k1;
		}
		
		System.out.println(sum + "\n");
		
		System.out.println("0 - 10 Ȧ���� ��");

		k1 = 0;
		sum = 0;
		while(k1 < 10) {
			k1++;
			if(k1 % 2 == 1) {
				sum += k1;
			}
		}
		
		System.out.println(sum + "\n");		
		
		
		System.out.println("0 - 10 ¦���� ��");
		
		k1 = 0;
		sum = 0;
		while(k1 < 10) {
			k1++;
			if(k1 % 2 != 1) {
				sum += k1;
			}
		}
		
		System.out.println(sum + "\n");		
		
		System.out.println("0 - 10 Ȧ��, ¦���� �հ�");
		
		k1 = 0;
		int sum_even = 0;
		int sum_odd = 0;
		while(k1 < 10) {
			k1++;
			if(k1 % 2 != 1) {
				sum_even += k1;
			}
			else {
				sum_odd += k1;
			}
		}
		
		System.out.println("Ȧ��" + sum_odd);		
		System.out.println("¦��" + sum_even + "\n");		
		
		System.out.println("7!�� ��.");
		
		k1 = 7;
		sum = 1;
		
		while(k1 > 0) {
			sum *= k1;
			k1--;
		}
		
		System.out.println(sum + "\n");		
		
	}
}