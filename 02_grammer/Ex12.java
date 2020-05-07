class Ex12{
	public static void main(String[] args){
	
		int t = 3989;
		int tmp = t;
		int hr = 3989 / 3600;

		t = t % 3600;
		int m = t / 60;
		int s = t % 60;

		System.out.println(tmp + "초는 " + hr + "시 " + m + "분 " + s + "초");


	
	}

}