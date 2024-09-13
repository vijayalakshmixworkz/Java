package com.xworkz.septwelve.things;
	import java.io.BufferedReader;
	import java.io.FileReader;
	import java.io.FileWriter;
	import java.io.IOException;

	public class FileOperations {

	    // Method to read a file and print its contents to the console
	    public void readFromFile(String inputFilePath) {
	        try (BufferedReader br = new BufferedReader(new FileReader(inputFilePath))) {
	            String line;
	            System.out.println("Reading from file: " + inputFilePath);
	            while ((line = br.readLine()) != null) {
	                System.out.println(line);  // Print each line from the file
	            }
	        } catch (IOException e) {
	            System.out.println("Error reading the file: " + e.getMessage());
	        }
	    }

	    // Method to write name, email, and mobile number to a file
	    public void writeToFile(String outputFilePath, String name, String email, String mobile) {
	        try (FileWriter writer = new FileWriter(outputFilePath)) {
	            writer.write("Name: " + name + "\n");
	            writer.write("Email: " + email + "\n");
	            writer.write("Mobile: " + mobile + "\n");
	            System.out.println("Data successfully written to file: " + outputFilePath);
	        } catch (IOException e) {
	            System.out.println("Error writing to the file: " + e.getMessage());
	        }
	    }
	}



