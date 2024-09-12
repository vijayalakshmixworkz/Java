package com.xworkz.override.things;

public class EmployeeObject {
	
	    String name;
	    static String companyName;
	    
	    // Static block (runs once)
	    static {
	        companyName = "Tech Innovations Ltd.";
	        System.out.println("Static block executed. Company Name: " + companyName);
	    }
	    
	    // Instance initializer block (runs each time an object is created)
	    {
	        System.out.println("Instance block executed.");
	    }

	    // Constructor
	    public EmployeeObject(String name) {
	        this.name = name;
	        System.out.println("Constructor called for: " + name);
	    }
	}

	


