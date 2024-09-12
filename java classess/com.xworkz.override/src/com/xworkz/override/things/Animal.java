package com.xworkz.override.things;

public class Animal {
	class Animal {
	    // Method to be overridden by subclasses
	    void sound() {
	        System.out.println("Animal makes a sound");
	    }
	}

	class Dog extends Animal {
	    // Overriding the sound method in the Dog class
	    @Override
	    void sound() {
	        System.out.println("Dog barks");
	    }
	}

	class Cat extends Animal {
	    // Overriding the sound method in the Cat class
	    @Override
	    void sound() {
	        System.out.println("Cat meows");
	    }
	}

	
	}


}
