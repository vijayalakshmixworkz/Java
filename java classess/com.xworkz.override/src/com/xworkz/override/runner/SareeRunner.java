package com.xworkz.override.runner;

import com.xworkz.override.things.Saree;

public class SareeRunner {
	public static void main(String[] args) {
        Saree saree1 = new Saree("Nalli", "Silk", "Red", "Floral", 7999, "Wedding");
        Saree saree2 = new Saree("Kanchipuram", "Silk", "Red", "Floral", 6999, "Party");

        System.out.println(saree1.equals(saree2)); // true
    }

}
