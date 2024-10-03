package com.xworkz.enumProject;

public class TicketBookDTO {
    private String movieName;
    private String theaterName;
    private TicketType ticketType;
    private SeatType seatType;

    public TicketBookDTO(String movieName, String theaterName, TicketType ticketType, SeatType seatType) {
        this.movieName = movieName;
        this.theaterName = theaterName;
        this.ticketType = ticketType;
        this.seatType = seatType;
    }

    public String getMovieName() {
        return movieName;
    }

    public String getTheaterName() {
        return theaterName;
    }

    public TicketType getTicketType() {
        return ticketType;
    }

    public SeatType getSeatType() {
        return seatType;
    }
}



