package com.ict.edu01;

interface  I {
	public void play();
	
}

class Bumper_Car implements I{
	public void play() {
		System.out.println("����ī");
		
	}
}

class Baseball implements I{
	public void play() {
		System.out.println("����ī");
	}
}


class K_land{
	void autoPlay(I i) {
		i.play();
	}
}


public class Ex09 {
	public static void main(String[] args) {
		K_land k_land = new K_land();
		k_land.autoPlay(new I() {

			public void play() {
				System.out.println("ȸ����");// TODO Auto-generated method stub
				
			}
		});
		System.out.println("=======================================================");
		int k = 1;
		I i = null;
		if(k == 1) {
			i = new Bumper_Car();
		}
		else if(k == 2) {
			i = new Baseball();
		}
		
		k_land.autoPlay(i);
		
	}
}
