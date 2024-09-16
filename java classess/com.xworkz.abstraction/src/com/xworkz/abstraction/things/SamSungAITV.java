package com.xworkz.abstraction.things;
// this class is complete because it do not have abstract methods

public class SamSungAITV extends AITV {

	public SamSungAITV(String brand, int size) {
		super(brand, size);
		System.out.println("");
	}

	@Override
	public void pickChannel() {
		// TODO Auto-generated method stub
		System.out.println("running pick channel is samsung");
		
	}

}
