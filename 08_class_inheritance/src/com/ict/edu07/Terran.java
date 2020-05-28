package com.ict.edu07;

public class Terran extends Unit {

	public Terran() {
		
	}
	
	public Terran(String name, int energy, boolean fly) {
		this.name = name;
		this.energy = energy;
		this.fly = fly;
	}

	public void decEnergy() {
		energy = energy - 5;
		
	}
	
}
