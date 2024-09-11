package com.xworkz.override.runner;

import com.xworkz.override.things.Bulb;

public class BulbRunner {
	 public static void main(String[] args) {
	        Bulb bulb1 = new Bulb("Philips", 9, "White", true, 199, "Round");
	        Bulb bulb2 = new Bulb("Syska", 9, "White", true, 149, "Round");

	        System.out.println(bulb1.equals(bulb2)); // true
	    }

}
