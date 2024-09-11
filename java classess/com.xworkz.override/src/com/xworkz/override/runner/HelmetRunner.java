package com.xworkz.override.runner;

import com.xworkz.override.things.Helmet;

public class HelmetRunner {

	
		// TODO Auto-generated method stub
		 public static void main(String[] args) {
		        Helmet helmet1 = new Helmet("Steelbird", "L", "Black", "Full-face", 1.5, 2499);
		        Helmet helmet2 = new Helmet("Vega", "L", "Black", "Full-face", 1.3, 2299);

		        // Print helmet details
		        System.out.println("Helmet 1: " + helmet1);
		        System.out.println("Helmet 2: " + helmet2);

		        // Compare the two helmets using equals method
		        System.out.println("Are the helmets equal? " + helmet1.equals(helmet2)); // true
	

	}

}
