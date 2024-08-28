package com.xworkz.things;


public class Sandal {
    String brand;
    char size;
    double cost;
    String color;
    Sandal(String brand, char size, double cost, String color) {
        this.brand = brand;
        this.size = size;
        this.cost = cost;
        this.color = color;
    }
    void show() {
        System.out.println("Sandal [Brand: " + brand + ", Size: " + size + ", Cost: ₹" + cost + ", Color: " + color + "]");
    }
}




