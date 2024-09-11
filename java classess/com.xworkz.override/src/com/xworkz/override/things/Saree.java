package com.xworkz.override.things;

public class Saree {
	
	    private String brand;
	    private String fabric;
	    private String color;
	    private String design;
	    private double price;
	    private String occasion;

	    public Saree(String brand, String fabric, String color, String design, double price, String occasion) {
	        this.brand = brand;
	        this.fabric = fabric;
	        this.color = color;
	        this.design = design;
	        this.price = price;
	        this.occasion = occasion;
	    }

	    @Override
	    public String toString() {
	        return "Saree{" +
	                "brand='" + brand + '\'' +
	                ", fabric='" + fabric + '\'' +
	                ", color='" + color + '\'' +
	                ", design='" + design + '\'' +
	                ", price=" + price +
	                ", occasion='" + occasion + '\'' +
	                '}';
	    }

	    @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (o == null || getClass() != o.getClass()) return false;
	        Saree saree = (Saree) o;
	        return fabric.equals(saree.fabric) && color.equals(saree.color) && design.equals(saree.design);
	    }

	    
	}


