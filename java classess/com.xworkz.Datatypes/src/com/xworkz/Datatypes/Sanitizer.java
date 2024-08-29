package com.xworkz.Datatypes;
//4 principles:polymorphism,inheritance,encapsulation,
public class Sanitizer {
	private String brand;
	private double price;
	private int quantity;
	public Sanitizer(String brand, double price, int quantity) {
		super();
		this.brand = brand;
		this.price = price;
		this.quantity = quantity;
	}
	public Sanitizer()
	{
		super();//constructor chaining
		System.out.println("created sanitizer uing no-arg constructor");
	}
	 public void killGerms()
	{
		System.out.println("Running killgerms");
	}
	public void show()
	{
		System.out.println("brand:"+brand);
		System.out.println("price:"+price);
		System.out.println("quantity:"+quantity);
	}

}
