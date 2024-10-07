package com.xworkz.enumProject.Runner;

import com.xworkz.enumProject.DTO.CustomerDTO;
import com.xworkz.enumProject.DTO.TicketBookDTO;
import com.xworkz.enumProject.collections.ProductType;
import com.xworkz.enumProject.collections.SeatType;
import com.xworkz.enumProject.collections.TicketType;

public class EnumRunner {
	
	    public static void main(String[] args) {
	        
	        CustomerDTO customer = new CustomerDTO("Sumedh", "sumedh4444.com", ProductType.KITCHEN);
	        System.out.println("Customer Name: " + customer.getName());
	        System.out.println("Customer Email: " + customer.getEmail());
	        System.out.println("Product Type: " + customer.getProductType());

	        
	        TicketBookDTO ticket = new TicketBookDTO("Sanam teri kasam", "PVRF", TicketType.ONLINE, SeatType.RECLINER);
	        System.out.println("\nMovie Name: " + ticket.getMovieName());
	        System.out.println("Theater Name: " + ticket.getTheaterName());
	        System.out.println("Ticket Type: " + ticket.getTicketType());
	        System.out.println("Seat Type: " + ticket.getSeatType());
	        System.out.println("Ticket Cost: $" + ticket.getTicketType().getCost());
	        System.out.println("Seat Number: " + ticket.getSeatType().getSeatNo());
	    }
	}


