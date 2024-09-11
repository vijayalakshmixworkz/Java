package com.xworkz.override.runner;

import com.xworkz.override.things.Jeans;

public class JeansRunner {
	public static void main(String[] args) {
        Jeans jeans1 = new Jeans("Levi's", "32", "Blue", 2999, "Denim", "Slim Fit");
        Jeans jeans2 = new Jeans("Wrangler", "32", "Blue", 2799, "Denim", "Slim Fit");

        System.out.println(jeans1.equals(jeans2)); // true
	}

}
