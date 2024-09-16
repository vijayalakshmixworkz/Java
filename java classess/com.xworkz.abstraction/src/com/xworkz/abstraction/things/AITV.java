package com.xworkz.abstraction.things;

public abstract class AITV {
	private String brand;
	private int Size;
	
	public void connectToInternet()// we can use concrete methods also
	{
		System.out.println("running connectToInternet in AITV ");
	}
	
	@Override
	public String toString() {
		return "AITV [brand=" + brand + ", Size=" + Size + "]";
	}

	public AITV(String brand, int size) {
		super();
		this.brand = brand;
		this.Size = size;
		System.out.println("running constructor in AITV");
	}
	public abstract void pickChannel();

}
