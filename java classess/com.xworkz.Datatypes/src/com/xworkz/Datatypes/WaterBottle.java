package com.xworkz.Datatypes;
//2. WaterBottle : quantity,color,fill(),empty(),crush();

//Gunashree,Shwetha,Devu

public class WaterBottle {
	public String quantity="1 ltr";
	public String color;

	public WaterBottle() {
		System.out.println("created WaterBottle using no-arg const..");

	}

	public void fill() {
		System.out.println("running fill in WaterBottle");
	}
	public void empty()
	{
		System.out.println("running empty in WaterBottle");
	}
	public void crush()
	{
		System.out.println("running crush  in WaterBottle");
	}

}
