package com.xworkz.septwelve.runner;
import java.time.temporal.ChronoUnit;

import com.xworkz.septwelve.things.DateTimeOperation;
public class DateTimeOperationRunner {
	

	
	    public static void main(String[] args) {
	        // Create an instance of DateTimeOperations
	        DateTimeOperation dateTimeOps = new DateTimeOperation();

	        // 1. Create and print a past date (10 days ago)
	        System.out.println("Past Date: " + dateTimeOps.createPastDate(10));

	        // 2. Create and print a future date (30 days from now)
	        System.out.println("Future Date: " + dateTimeOps.createFutureDate(30));

	        // 3. Create and print a past datetime (2 weeks ago)
	        System.out.println("Past DateTime: " + dateTimeOps.createPastDateTime(2, ChronoUnit.WEEKS));

	        // 4. Create and print a future datetime (3 months from now)
	        System.out.println("Future DateTime: " + dateTimeOps.createFutureDateTime(3, ChronoUnit.MONTHS));
	    }
	}


