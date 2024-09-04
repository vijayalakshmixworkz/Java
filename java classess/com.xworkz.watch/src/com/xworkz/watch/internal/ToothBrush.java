package com.xworkz.watch.internal;

public class ToothBrush {
	
	private String brand;
	private double cost;
	private boolean soft;
	
	public ToothBrush(String brand)
	{
		this.brand=brand;
	}
	
	public ToothBrush(double cost,boolean soft) {
		this.cost=cost;
		this.soft=soft;
	}
	
	public void brush(String brand)
	{
		System.out.println("running brush in toothbrush");
	}
	public void brush(double cost)
	{
		System.out.println("running brush in toothbrush with double");
	}
}
