package com.ict.edu8;


class Ex03 implements Ex01{

	public void play() {
	
	}
	public void sound() {
		
	}
	
}

abstract class Ex04 implements Ex01{
	int k1 = 10; 
	
	public abstract void leftSound();

}

abstract class Ex05 implements Ex01{
	int k1 = 10; 

}

interface Ex06 extends Ex01{
	int k1 = 10; //static final
}


class Ex07 extends Ex05{
	
	@Override
	public void play() {}
	
	@Override
	public void sound() {}
}

class Ex08 extends Ex04{
	@Override
	public void leftSound() {}
	
	@Override
	public void play() {}
	
	@Override
	public void sound() {}
}




