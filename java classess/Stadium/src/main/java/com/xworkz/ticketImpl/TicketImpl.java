package com.xworkz.ticketImpl;
import com.xworkz.TicketDTO.TicketDTO;
import com.xworkz.ticketService.TicketService;
public class TicketImpl implements TicketService {
	
	@Override
	public boolean validate(TicketDTO ticket) {
		// TODO Auto-generated method stub
		boolean  valid=true;

	String stadiumName=ticket.getStadiumName();
	if (stadiumName != null && !stadiumName.isEmpty() && stadiumName.length() >= 3 && stadiumName.length() <= 100) {
		System.out.println("stadiumName is  valid");
		valid = true;
	} else {
		System.out.println("stadiumName is  not valid");
		valid=false;
	}
	System.out.println("================");
	
	
	String email = ticket.getEmail();
	if (email != null && email.contains("@") && (email.endsWith(".com")) && email.length() >= 6
			&& email.length() <= 500) {
		System.out.println("email is valid");
		valid = true;
	} else {
		System.out.println("email is invalid");
		valid=false;
	}
	System.out.println("================");
	
	
	
	 int ticket=ticket.getTicket();
	 if (ticket >0) { 
			 System.out.println("ticket is  valid");
			valid = true;
		} 
	else 
		{
			System.out.println("ticket is  not valid");
			valid=false;
		}
		System.out.println("================");
		
	 long primaryContact=ticket.getPrimaryContact();
	 if (primaryContact!=0) {
		 System.out.println("primaryContact is  valid");
		valid = true;
	} else {
		System.out.println("primaryContact is  not valid");
		valid=false;
	}
	 
	return valid;
}

	
}



