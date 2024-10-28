package com.xworkz.forms.service;
import com.xworkz.forms.dto.MovieTicketDTO;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class MovieService {

    public MovieService() {
        System.out.println("Created no-arg constructor of MovieService");
    }

    /**
     * Validate the MovieTicketDTO object.
     * 
     * @param movieTicketDTO
     * @return true if all fields are valid, false otherwise
     */
    public boolean validateMovieTicket(MovieTicketDTO movieTicketDTO) {
        boolean validName = validateName(movieTicketDTO.getName());
        boolean validTotalTickets = validateTotalTickets(movieTicketDTO.getTotalTickets());
        boolean validTheaterName = validateTheaterName(movieTicketDTO.getTheaterName());
        boolean validSeatType = validateSeatType(movieTicketDTO.getSeatType());
        boolean validDonation = validateDonation(movieTicketDTO.getDonation());
        boolean validDate = validateDate(movieTicketDTO.getDate());

        return validName && validTotalTickets && validTheaterName && validSeatType && validDonation && validDate;
    }

    public boolean validateName(String name) {
        if (name == null || name.trim().isEmpty() || name.length() < 3) {
            System.out.println("Invalid Name: Name must be at least 3 characters long and non-empty.");
            return false;
        }
        return true;
    }

    public boolean validateTotalTickets(int totalTickets) {
        if (totalTickets <= 0) {
            System.out.println("Invalid Total Tickets: Must be greater than 0.");
            return false;
        }
        return true;
    }

    public boolean validateTheaterName(String theaterName) {
        if (theaterName == null || theaterName.trim().isEmpty()) {
            System.out.println("Invalid Theater Name: Cannot be null or empty.");
            return false;
        }
        return true;
    }

    public boolean validateSeatType(String seatType) {
        if (seatType == null || seatType.trim().isEmpty()) {
            System.out.println("Invalid Seat Type: Cannot be null or empty.");
            return false;
        }

        String[] validSeatTypes = { "VIP cinema seating", "Banquet seating", "Retractable seats", "Stadium seating" };
        for (String validType : validSeatTypes) {
            if (validType.equalsIgnoreCase(seatType)) {
                return true;
            }
        }

        System.out.println("Invalid Seat Type: Must be one of the specified seat types.");
        return false;
    }

    public boolean validateDonation(double donation) {
        if (donation < 0) {
            System.out.println("Invalid Donation: Donation cannot be negative.");
            return false;
        }
        return true;
    }

    public boolean validateDate(String date) {
        if (date == null || date.trim().isEmpty()) {
            System.out.println("Invalid Date: Date cannot be null or empty.");
            return false;
        }

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        try {
            LocalDate parsedDate = LocalDate.parse(date, formatter);
            if (parsedDate.isBefore(LocalDate.of(2000, 1, 1)) || parsedDate.isAfter(LocalDate.of(2030, 12, 31))) {
                System.out.println("Invalid Date: Date must be between 2000-01-01 and 2030-12-31.");
                return false;
            }
        } catch (DateTimeParseException e) {
            System.out.println("Invalid Date Format: Please use 'yyyy-MM-dd'.");
            return false;
        }
        return true;
    }
}
