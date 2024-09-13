package com.xworkz.septwelve.things;

public class Person {
	
	    private String name;
	    private String email;
	    private int age;
	    private String mobileNo;

	    // Constructor
	    public Person(String name, String email, int age, String mobileNo) {
	        this.name = name;
	        this.email = email;
	        this.age = age;
	        this.mobileNo = mobileNo;
	    }

	    // Getter methods
	    public String getName() {
	        return name;
	    }

	    public String getEmail() {
	        return email;
	    }

	    public int getAge() {
	        return age;
	    }

	    public String getMobileNo() {
	        return mobileNo;
	    }

	    // Method to print the details of the person
	    public void printPersonDetails() {
	        System.out.println("Name: " + name);
	        System.out.println("Email: " + email);
	        System.out.println("Age: " + age);
	        System.out.println("Mobile No: " + mobileNo);
	        System.out.println("-------------------------");
	    }
	}


