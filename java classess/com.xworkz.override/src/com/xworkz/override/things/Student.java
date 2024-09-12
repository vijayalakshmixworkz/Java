package com.xworkz.override.things;


	class Student extends Person {
	    // This will cause a compile-time error because displayInfo() is final in the Person class
	    // public void displayInfo() {
	    //     System.out.println("This is from the Student class.");
	    // }
	}

}
