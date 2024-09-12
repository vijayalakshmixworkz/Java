package com.xworkz.override.things;

	final class Vehicle {
	    public void run() {
	        System.out.println("The vehicle is running.");
	    }
	}

	// This will cause a compile-time error because Vehicle is a final class
	// class Car extends Vehicle {
//	     public void run() {
//	         System.out.println("The car is running.");
//	     }
	// }

	
}
