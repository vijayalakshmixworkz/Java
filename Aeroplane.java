// Aeroplane: String company,int noOfSeats,double ticketPrice,String source,String destination
// No Parameter const
// Constructor to init all instance variables
// Constructor to init company,source,destination
// Constructor to init company,ticketPrice,source,destination

class Aeroplane {
    String company;
    int noOfSeats;
    double ticketPrice;
    String source;
    String destination;

    public Aeroplane() {
        System.out.println("No parameter constructor called");
    }

    public Aeroplane(String company, int noOfSeats, double ticketPrice, String source, String destination) {
        this.company = company;
        this.noOfSeats = noOfSeats;
        this.ticketPrice = ticketPrice;
        this.source = source;
        this.destination = destination;
        System.out.println("Constructor with all instance variables called");
    }
    public Aeroplane(String company, String source, String destination) {
        this.company = company;
        this.source = source;
        this.destination = destination;
        System.out.println("Constructor with company, source, and destination parameters called");
    }
    public Aeroplane(String company, double ticketPrice, String source, String destination) {
        this.company = company;
        this.ticketPrice = ticketPrice;
        this.source = source;
        this.destination = destination;
        System.out.println("Constructor with company, ticketPrice, source, and destination parameters called");
    }

    
}