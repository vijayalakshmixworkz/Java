// Kerosene: double price,int quantity,boolean quality
// No Parameter const
// Constructor to init price,quantity and quality
// Constructor to init quality
// Constructor to init price

class Kerosene {
    double price;
    int quantity;
    boolean quality;
	
    public Kerosene() {
        System.out.println("No parameter constructor");
    }

    public Kerosene(double price, int quantity, boolean quality) {
        this.price = price;
        this.quantity = quantity;
        this.quality = quality;
        System.out.println("Constructor with price, quantity, and quality parameters called");
    }

    // Constructor to init quality
    public Kerosene(boolean quality) {
        this.quality = quality;
        System.out.println("Constructor with quality parameter called");
    }

    public Kerosene(double price) {
        this.price = price;
        System.out.println("Constructor with price parameter called");
    }

    @Override
    public String toString() {
        return "Kerosene [price=" + price + ", quantity=" + quantity + ", quality=" + quality + "]";
    }

   
}