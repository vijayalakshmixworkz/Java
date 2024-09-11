package com.xworkz.override.things;

public class BedSheet {
	
	    private String brand;
	    private String fabric;
	    private String color;
	    private String size;
	    private int threadCount;
	    private double price;

	    public BedSheet(String brand, String fabric, String color, String size, int threadCount, double price) {
	        this.brand = brand;
	        this.fabric = fabric;
	        this.color = color;
	        this.size = size;
	        this.threadCount = threadCount;
	        this.price = price;
	    }

	    @Override
	    public String toString() {
	        return "BedSheet{" +
	                "brand='" + brand + '\'' +
	                ", fabric='" + fabric + '\'' +
	                ", color='" + color + '\'' +
	                ", size='" + size + '\'' +
	                ", threadCount=" + threadCount +
	                ", price=" + price +
	                '}';
	    }

	    @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (o == null || getClass() != o.getClass()) return false;
	        BedSheet bedsheet = (BedSheet) o;
	        return fabric.equals(bedsheet.fabric) && color.equals(bedsheet.color) && size.equals(bedsheet.size);
	    }

	   
	}

