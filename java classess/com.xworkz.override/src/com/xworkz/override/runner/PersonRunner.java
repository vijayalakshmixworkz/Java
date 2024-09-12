package com.xworkz.override.runner;

import com.xworkz.override.things.Student;

public class PersonRunner {
	
	    public static void main(String[] args) {
	        Student student = new Student();
	        student.displayInfo(); // Outputs: This is final method from the Person class.
	    }
	}

