package com.xworkz.override.things;

public class Grinder {
    private String brand;
    private int jarCount;
    private int power;
    private boolean isWetGrinder;
    private double price;
    private String material;

    public Grinder(String brand, int jarCount, int power, boolean isWetGrinder, double price, String material) {
        this.brand = brand;
        this.jarCount = jarCount;
        this.power = power;
        this.isWetGrinder = isWetGrinder;
        this.price = price;
        this.material = material;
    }

    @Override
    public String toString() {
        return "Grinder{" +
                "brand='" + brand + '\'' +
                ", jarCount=" + jarCount +
                ", power=" + power +
                ", isWetGrinder=" + isWetGrinder +
                ", price=" + price +
                ", material='" + material + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Grinder grinder = (Grinder) o;
        return jarCount == grinder.jarCount && power == grinder.power && material.equals(grinder.material);
    }

   
}



