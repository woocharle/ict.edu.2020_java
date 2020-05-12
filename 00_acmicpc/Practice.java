import java.util.Arrays;

public class Practice {
	//반복 함수로 구구단 만들기
	static int[][] gugudan;
	static int n;
	
	public static void main(String[] args) {
		
		n = 9;
		gugudan = new int[n][n];
			
		sj(0, 0, 3);
	
		for (int i = 0; i < gugudan.length; i++) {
			for (int j = 0; j < gugudan.length; j++) {
				System.out.print(gugudan[i][j] + " ");
			}
			System.out.println();
		}
		
		
	}
	
	public static void sj(int a, int b, int c) {
		int dan = 0;
		if(c == 1) {
			gugudan[a][b] = (a + 1) * (b + 1);
			return; 
		}
		
		dan = c - 1;
		
		for(int i = 0; i <= c ; i++) {
			for (int j = 0; j <= c; j++) {
				sj(a + i * dan, b + j * dan, dan);
			}
		}
		

			
	}
	
}
