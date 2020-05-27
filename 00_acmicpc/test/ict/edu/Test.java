package test.ict.edu;

public class Test {
	public static void main(String[] args) {
		int[] list = {3, 1, 2, 4, 5};
		int tmp;
		
		for (int i = 0; i < list.length; i++) {
			for (int j = 0; j < list.length; j++) {
				if(list[i]> list[j]) {
					tmp = list[i];
					list[i] = list[j];
					list[j] = tmp;		
				}
			}
		}
		
		for (int i = 0; i < list.length; i++) {
			System.out.println(list[i]);
		}
		
	}

}
