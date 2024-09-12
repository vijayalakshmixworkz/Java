package com.xworkz.override.runner;

import com.xworkz.override.things.Calculator;

public class CalculatorRunner {

	    public static void main(String[] args) {
	        Calculator calc = new Calculator();
	        
	        // Calls the method that adds two integers
	        System.out.println("Sum of two integers: " + calc.add(10, 20));

	        // Calls the method that adds three integers
	        System.out.println("Sum of three integers: " + calc.add(10, 20, 30));

	        // Calls the method that adds two double values
	        System.out.println("Sum of two doubles: " + calc.add(10.5, 20.3));
	    }

}
