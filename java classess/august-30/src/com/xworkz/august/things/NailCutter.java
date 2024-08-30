package com.xworkz.august.things;
//class 
//datatype
public class NailCutter {
	private double weight;
	private String material;
	// without chaining you cannot have a constructor
	public NailCutter(double weight,String material) {
		super();//calling the no-argument  constructor of the parent class
		this.weight=weight;
		this.material=material;
		System.out.println("running nailcutter constructor using double and string");
	}
	public NailCutter()
	{
		System.out.println("running no-arg constructor");
	}

}
