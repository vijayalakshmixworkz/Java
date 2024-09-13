package com.xworkz.septwelve.runner;

import com.xworkz.septwelve.things.Person;

public class PersonRunner {

	    public static void main(String[] args) {
	        // 1. Create 5 copies of Person
	        Person person1 = new Person("Arun", "arun@example.com", 25, "9876543210");
	        Person person2 = new Person("Vikram", "vikram@example.com", 30, "9876543211");
	        Person person3 = new Person("Neha", "neha@example.com", 28, "9876543212");
	        Person person4 = new Person("Priya", "priya@example.com", 26, "9876543213");
	        Person person5 = new Person("Raj", "raj@example.com", 27, "9876543214");

	        // 2. Create an array of Person and add all 5 copies into the array
	        Person[] personArray = {person1, person2, person3, person4, person5};

	        // 3. Use forEach to print all details of the person
	        for (Person person : personArray) {
	            person.printPersonDetails();
	        }
	    }
	}



