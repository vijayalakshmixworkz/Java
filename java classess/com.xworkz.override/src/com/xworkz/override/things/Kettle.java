package com.xworkz.override.things;

public class Kettle {
	
	    private String brand;
	    private double capacity;
	    private String color;
	    private boolean isElectric;
	    private double power;
	    private String material;

	    public Kettle(String brand, double capacity, String color, boolean isElectric, double power, String material) {
	        this.brand = brand;
	        this.capacity = capacity;
	        this.color = color;
	        this.isElectric = isElectric;
	        this.power = power;
	        this.material = material;
	    }

	    @Override
	    public String toString() {
	        return "Kettle{" +
	                "brand='" + brand + '\'' +
	                ", capacity=" + capacity +
	                ", color='" + color + '\'' +
	                ", isElectric=" + isElectric +
	                ", power=" + power +
	                ", material='" + material + '\'' +
	                '}';
	    }

	    @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (o == null || getClass() != o.getClass()) return false;
	        Kettle kettle = (Kettle) o;
	        return capacity == kettle.capacity && isElectric == kettle.isElectric && material.equals(kettle.material);
	    }

	    
	}


