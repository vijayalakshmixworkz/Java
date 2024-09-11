package com.xworkz.override.things;

public class Bulb {
	
	    private String brand;
	    private int wattage;
	    private String color;
	    private boolean isLED;
	    private double price;
	    private String shape;

	    public Bulb(String brand, int wattage, String color, boolean isLED, double price, String shape) {
	        this.brand = brand;
	        this.wattage = wattage;
	        this.color = color;
	        this.isLED = isLED;
	        this.price = price;
	        this.shape = shape;
	    }

	    @Override
	    public String toString() {
	        return "Bulb{" +
	                "brand='" + brand + '\'' +
	                ", wattage=" + wattage +
	                ", color='" + color + '\'' +
	                ", isLED=" + isLED +
	                ", price=" + price +
	                ", shape='" + shape + '\'' +
	                '}';
	    }

	    @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (o == null || getClass() != o.getClass()) return false;
	        Bulb bulb = (Bulb) o;
	        return wattage == bulb.wattage && isLED == bulb.isLED && color.equals(bulb.color);
	    }

	   
	}


