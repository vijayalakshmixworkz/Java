package com.xworkz.override.things;

public class EmployeeThisChaining {

	    String name;
	    int employeeId;
	    int salary;
	    
	    // Constructor 1
	    public EmployeeThisChaining(String name) {
	        this(name, 0); // Calls Constructor 2
	        System.out.println("Constructor 1 called. Name: " + name);
	    }
	    
	    // Constructor 2
	    public EmployeeThisChaining(String name, int employeeId) {
	        this(name, employeeId, 30000); // Calls Constructor 3
	        System.out.println("Constructor 2 called. Name: " + name + ", Employee ID: " + employeeId);
	    }
	    
	    // Constructor 3
	    public EmployeeThisChaining(String name, int employeeId, int salary) {
	        this.name = name;
	        this.employeeId = employeeId;
	        this.salary = salary;
	        System.out.println("Constructor 3 called. Name: " + name + ", Employee ID: " + employeeId + ", Salary: " + salary);
	    }
	}

	