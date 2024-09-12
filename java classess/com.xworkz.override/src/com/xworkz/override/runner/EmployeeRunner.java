package com.xworkz.override.runner;

import com.xworkz.override.things.Employee;

public class EmployeeRunner {
	
	    public static void main(String[] args) {
	        // Static block will be executed when the class is loaded
	        System.out.println("Main method started.");
	        
	        Employee e1 = new Employee("Rahul");
	        Employee e2 = new Employee("Priya");
	    }
	}
