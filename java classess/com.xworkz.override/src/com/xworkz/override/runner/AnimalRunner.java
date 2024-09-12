package com.xworkz.override.runner;

import com.xworkz.override.things.Animal;
import com.xworkz.override.things.Animal.Cat;
import com.xworkz.override.things.Animal.Dog;

public class AnimalRunner {
	public class Main {
	    public static void main(String[] args) {
	        // Creating an Animal reference to a Dog object (Polymorphism)
	        Animal animal = new Dog();
	        animal.sound();  // Output: Dog barks

	        // Changing the reference to a Cat object
	        animal = new Cat();
	        animal.sound();  // Output: Cat meows
	    }

}
}
