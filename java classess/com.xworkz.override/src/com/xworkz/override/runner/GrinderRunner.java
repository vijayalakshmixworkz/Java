package com.xworkz.override.runner;

import com.xworkz.override.things.Grinder;

public class GrinderRunner {


		// TODO Auto-generated method stub
		 public static void main(String[] args) {
		        Grinder grinder1 = new Grinder("Bajaj", 3, 500, false, 3499, "Plastic");
		        Grinder grinder2 = new Grinder("Preethi", 3, 500, true, 3999, "Plastic");

		        System.out.println(grinder1.equals(grinder2)); // true
		    }

	}


