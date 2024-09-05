package com.xworkz.inherit.runner;

import com.xworkz.inherit.things.Bike;
import com.xworkz.inherit.things.Car;

public class TransportRunner {
		
		    public static void main(String[] args) {
		        Car car = new Car();
		        Bike bike = new Bike();

		        car.start();  // Inherited from Vehicle
		        car.drive();  // Specific to Car

		        bike.start(); 
		        bike.ride(); 
		    }
		}
