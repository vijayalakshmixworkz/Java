package com.xworkz.Datatypes;
//1. Shoe : brand,cost, safeGuard(),enhanceWalk() ;
//Divya: local shoe ,Omkar: Param ,Harshitha: instance variable

//NOTE: DONT FORGET NULL CHECK


//2. WaterBottle : quantity,color,fill(),empty(),crush();

//Gunashree,Shwetha,Devu

//3. You need to Think : Object : two variable,three methods

//Decide three class and use what u thought

public class Shoe {
	public String brand="Power";
	public double cost;

	public Shoe() {
		System.out.println("created Shoe using no-arg const..");

	}

	public void safeguard() {
		System.out.println("running safeguard in shoe");
	}
	public void enhancewalk()
	{
		System.out.println("running enhance walk in shoe");
	}

}
