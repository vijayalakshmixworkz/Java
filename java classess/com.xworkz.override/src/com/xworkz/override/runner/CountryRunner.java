package com.xworkz.override.runner;

import com.xworkz.override.things.Country;

public class CountryRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	        Country country1 = new Country("India", "New Delhi", 1393409038, 3287263, "Asia", "INR");
	        Country country2 = new Country("China", "Beijing", 1444216107, 9596961, "Asia", "CNY");

	        System.out.println(country1.equals(country2)); // false
	    }

	}

