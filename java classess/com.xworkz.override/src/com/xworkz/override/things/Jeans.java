package com.xworkz.override.things;

public class Jeans {
	
	    private String brand;
	    private String size;
	    private String color;
	    private double price;
	    private String material;
	    private String fitType;

	    public Jeans(String brand, String size, String color, double price, String material, String fitType) {
	        this.brand = brand;
	        this.size = size;
	        this.color = color;
	        this.price = price;
	        this.material = material;
	        this.fitType = fitType;
	    }

	    @Override
	    public String toString() {
	        return "Jeans{" +
	                "brand='" + brand + '\'' +
	                ", size='" + size + '\'' +
	                ", color='" + color + '\'' +
	                ", price=" + price +
	                ", material='" + material + '\'' +
	                ", fitType='" + fitType + '\'' +
	                '}';
	    }

	    @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (o == null || getClass() != o.getClass()) return false;
	        Jeans jeans = (Jeans) o;
	        return size.equals(jeans.size) && color.equals(jeans.color) && fitType.equals(jeans.fitType);
	    }

}
