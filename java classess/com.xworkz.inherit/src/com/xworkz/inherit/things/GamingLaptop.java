package com.xworkz.inherit.things;


	//Derived class from Laptop, implementing another interface
	public class GamingLaptop extends Laptop implements Portable {
		public void carry() {
			System.out.println("Carrying the Gaming Laptop...");
		}

		public void game() {
			System.out.println("Playing games on Gaming Laptop...");
		}
	}


