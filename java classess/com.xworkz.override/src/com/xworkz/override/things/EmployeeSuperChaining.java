package com.xworkz.override.things;

import com.xworkz.override.things.PersonSuperChaining.Person;

public class EmployeeSuperChaining extends PersonSuperChaining {
	
	    int employeeId;
	    
	    // Child class constructor
	    public EmployeeSuperChaining(String name, int employeeId) {
	        super(name); // Calls the parent class (Person) constructor
	        this.employeeId = employeeId;
	        System.out.println("Employee constructor called. Employee ID: " + employeeId);
	    }
	}


