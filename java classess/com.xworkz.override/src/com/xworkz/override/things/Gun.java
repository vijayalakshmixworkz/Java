package com.xworkz.override.things;

	public class Gun {
	    private String model;
	    private String caliber;
	    private int magazineCapacity;
	    private String manufacturer;
	    private double weight;
	    private String type;

	    public Gun(String model, String caliber, int magazineCapacity, String manufacturer, double weight, String type) {
	        this.model = model;
	        this.caliber = caliber;
	        this.magazineCapacity = magazineCapacity;
	        this.manufacturer = manufacturer;
	        this.weight = weight;
	        this.type = type;
	    }

	    @Override
	    public String toString() {
	        return "Gun{" +
	                "model='" + model + '\'' +
	                ", caliber='" + caliber + '\'' +
	                ", magazineCapacity=" + magazineCapacity +
	                ", manufacturer='" + manufacturer + '\'' +
	                ", weight=" + weight +
	                ", type='" + type + '\'' +
	                '}';
	    }

	    @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (o == null || getClass() != o.getClass()) return false;
	        Gun gun = (Gun) o;
	        return caliber.equals(gun.caliber) && magazineCapacity == gun.magazineCapacity && type.equals(gun.type);
	    }
	}

	    


