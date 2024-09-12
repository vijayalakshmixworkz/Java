package com.xworkz.override.things;

public class Employee {
	
	    static String companyName;
	    
	    // Static block for static initialization
	    static {
	        companyName = "Tech Innovations Ltd.";
	        System.out.println("Static block executed. Company Name: " + companyName);
	    }

	    public Employee(String name) {
	        System.out.println("Constructor called for: " + name);
	    }
	}

	


