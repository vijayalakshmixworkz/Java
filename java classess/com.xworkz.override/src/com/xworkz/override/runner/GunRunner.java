package com.xworkz.override.runner;

import com.xworkz.override.things.Gun;

public class GunRunner {

	
		public static void main(String[] args) {
	        Gun gun1 = new Gun("Glock 19", "9mm", 15, "Glock", 0.7, "Pistol");
	        Gun gun2 = new Gun("Beretta 92", "9mm", 15, "Beretta", 0.8, "Pistol");

	        System.out.println(gun1.equals(gun2)); // true
	    }
	}

	