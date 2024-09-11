package com.xworkz.override.runner;

import com.xworkz.override.things.BedSheet;

public class BedSheetRunner {
	public static void main(String[] args) {
	
	        BedSheet bedsheet1 = new BedSheet("D'Decor", "Cotton", "Blue", "King", 300, 2499);
	        BedSheet bedsheet2 = new BedSheet("Bombay Dyeing", "Cotton", "Blue", "King", 350, 2799);

	        System.out.println(bedsheet1.equals(bedsheet2)); // true
	    }

}
