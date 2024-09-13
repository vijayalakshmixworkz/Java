package com.xworkz.septwelve.things;

	import java.time.LocalDate;
	import java.time.LocalDateTime;
	import java.time.temporal.ChronoUnit;

	public class DateTimeOperation {

	    // Method to create a past date 
	    public LocalDate createPastDate(int days) {
	        return LocalDate.now().minusDays(days);
	    }

	    // Method to create a future date 
	    public LocalDate createFutureDate(int days) {
	        return LocalDate.now().plusDays(days);
	    }

	    // Method to create a past datetime 
	    public LocalDateTime createPastDateTime(long amount, ChronoUnit unit) {
	        return LocalDateTime.now().minus(amount, unit);
	    }

	    // Method to create a future datetime 
	    public LocalDateTime createFutureDateTime(long amount, ChronoUnit unit) {
	        return LocalDateTime.now().plus(amount, unit);
	    }
	}


