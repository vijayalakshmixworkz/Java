package com.xworkz.inherit.runner;

import com.xworkz.inherit.things.Toy;

public class ToyRunner {
	public static void main(String[] args) {
		Toy toy1=new Toy(91,2,true,"shoppingDolls","soft fabric");
		Toy toy2=new Toy(91,2,true,"stufftree","unique dolls");
		boolean same=toy1.equals(toy2);
		System.out.println("toy 1 is same as toy2");
		
		
		

}
}