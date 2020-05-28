package com.ict.edu07;

public class Main {
	public static void main(String[] args) {
		Protoss p = new Protoss("zealot", 100, false);
		Zerg z = new Zerg("hydra", 100, false);
		Terran t = new Terran("wraith", 100, true);
		
		p.decEnergy();
		System.out.println(p.name + ":" + p.energy);
		
		p.decEnergy();
		System.out.println(p.name + ":" + p.energy);
		
		System.out.println();
		
		z.decEnergy();
		System.out.println(z.name + ":" + z.energy);
		
		z.decEnergy();
		System.out.println(z.name + ":" + z.energy);
		
		System.out.println();
		
		t.decEnergy();
		System.out.println(t.name + ":" + t.energy);
		
		t.decEnergy();
		System.out.println(t.name + ":" + t.energy);
		
		
		
	}
	
}
