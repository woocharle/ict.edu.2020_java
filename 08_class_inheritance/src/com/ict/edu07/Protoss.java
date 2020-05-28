package com.ict.edu07;

public class Protoss extends Unit{

	//constructor
	public Protoss() {
		// TODO Auto-generated constructor stub
	}
	
	
    public Protoss(String name, int energy, boolean fly) {
    	this.name = name;
    	this.energy = energy;
    	this.fly = fly;
    }
	
    
	//member method
	//abstract method
	public void decEnergy() {
		energy = energy - 2;	
	}	
	
	
	
	
}
