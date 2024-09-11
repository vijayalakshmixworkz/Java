package com.xworkz.override.things;

public class Helmet {
	
	    private String brand;
	    private String size;
	    private String color;
	    private String type;
	    private double weight;
	    private double price;

	    public Helmet(String brand, String size, String color, String type, double weight, double price) {
	        this.brand = brand;
	        this.size = size;
	        this.color = color;
	        this.type = type;
	        this.weight = weight;
	        this.price = price;
	    }

	    @Override
	    public String toString() {
	        return "Helmet{" +
	                "brand='" + brand + '\'' +
	                ", size='" + size + '\'' +
	                ", color='" + color + '\'' +
	                ", type='" + type + '\'' +
	                ", weight=" + weight +
	                ", price=" + price +
	                '}';
	    }

	    @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (o == null || getClass() != o.getClass()) return false;
	        Helmet helmet = (Helmet) o;
	        return size.equals(helmet.size) && color.equals(helmet.color) && type.equals(helmet.type);
	    }

	   
	}



