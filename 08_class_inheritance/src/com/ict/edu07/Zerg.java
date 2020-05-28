package com.ict.edu07;

public class Zerg extends Unit{

	public Zerg() {
		// TODO Auto-generated constructor stub
	}
	
    public Zerg(String name, int energy, boolean fly) {
    	this.name = name;
    	this.energy = energy;
    	this.fly = fly;
    }
	
	
	@Override
	public void decEnergy() {
		energy = energy - 9;
		// TODO Auto-generated method stub
	}

	
	
}
