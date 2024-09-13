package com.xworkz.septwelve.runner;

import com.xworkz.septwelve.things.FileOperations;

public class FileOperationsRunner {
	
	    public static void main(String[] args) {
	        // Create an instance of FileOperations
	        FileOperations fileOps = new FileOperations();

	        // File paths
	        String inputFilePath = "file:///C:/Users/kumrk/Downloads/Shalini%20G%20K%20(1).pdf";   // File to read from
	        String outputFilePath = "output.txt"; // File to write to

	        // Reading from the input file
	        fileOps.readFromFile(inputFilePath);

	        // Writing name, email, and mobile to the output file
	        String name = "Vijayalakshmi";  
	        String email = "viji@gmail.com"; 
	        String mobile = "1234567890";

	        fileOps.writeToFile(outputFilePath, name, email, mobile);
	    }
	}


