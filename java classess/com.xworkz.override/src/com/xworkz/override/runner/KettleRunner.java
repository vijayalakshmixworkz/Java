package com.xworkz.override.runner;

import com.xworkz.override.things.Kettle;

public class KettleRunner {
	public static void main(String[] args) {
        Kettle kettle1 = new Kettle("Philips", 1.5, "White", true, 1500, "Steel");
        Kettle kettle2 = new Kettle("Prestige", 1.5, "Black", true, 1800, "Steel");

        System.out.println(kettle1.equals(kettle2)); // true
    }

}
