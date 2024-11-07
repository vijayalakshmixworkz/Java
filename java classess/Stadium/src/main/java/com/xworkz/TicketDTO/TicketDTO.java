package com.xworkz.TicketDTO;

public class TicketDTO {
private String stadiumName;
private int ticket;
private long primaryContact;
private String email;
public TicketDTO()
{
	
}
public TicketDTO(String stadiumName, int ticket, long primaryContact, String email) {
	super();
	this.stadiumName = stadiumName;
	this.ticket = ticket;
	this.primaryContact = primaryContact;
	this.email = email;
}
public String getStadiumName() {
	return stadiumName;
}
public void setStadiumName(String stadiumName) {
	this.stadiumName = stadiumName;
}
public int getTicket() {
	return ticket;
}
public void setTicket(int ticket) {
	this.ticket = ticket;
}
public long getPrimaryContact() {
	return primaryContact;
}
public void setPrimaryContact(long primaryContact) {
	this.primaryContact = primaryContact;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((email == null) ? 0 : email.hashCode());
	result = prime * result + (int) (primaryContact ^ (primaryContact >>> 32));
	result = prime * result + ((stadiumName == null) ? 0 : stadiumName.hashCode());
	result = prime * result + ticket;
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	TicketDTO other = (TicketDTO) obj;
	if (email == null) {
		if (other.email != null)
			return false;
	} else if (!email.equals(other.email))
		return false;
	if (primaryContact != other.primaryContact)
		return false;
	if (stadiumName == null) {
		if (other.stadiumName != null)
			return false;
	} else if (!stadiumName.equals(other.stadiumName))
		return false;
	if (ticket != other.ticket)
		return false;
	return true;
}
@Override
public String toString() {
	return "TicketDTO [stadiumName=" + stadiumName + ", ticket=" + ticket + ", primaryContact=" + primaryContact
			+ ", email=" + email + "]";
}



}
