package com.xworkz.things;

public class Market {
	
	    String name;
	    String location;

	    Market(String name, String location) {
	        this.name = name;
	        this.location = location;
	    }

	    void show() {
	        System.out.println("Market [Name: " + name + ", Location: " + location + "]");
	    }
	}

