package com.xworkz.things;

public class SideDish {	
	    String name;
	    double price;
	    String type;

	    SideDish(String name, double price, String type) {
	        this.name = name;
	        this.price = price;
	        this.type = type;
	    }

	    void show() {
	        System.out.println("SideDish [Name: " + name + ", Price: ₹" + price + ", Type: " + type + "]");
	    }
	}


