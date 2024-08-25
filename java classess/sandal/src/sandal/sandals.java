package sandal;
public class Sandal {
    String brand;
    char size;
    double cost;
    String color;
    Sandal(String brand, char size, double cost, String color) {
        this.brand = brand;
        this.size = size;
        this.cost = cost;
        this.color = color;
    }
    void show() {
        System.out.println("Sandal [Brand: " + brand + ", Size: " + size + ", Cost: ₹" + cost + ", Color: " + color + "]");
    }
}
class Market {
    String name;
    String location;

    Market(String name, String location) {
        this.name = name;
        this.location = location;
    }

    void show() {
        System.out.println("Market [Name: " + name + ", Location: " + location + "]");
    }
}

class SideDish {
    String name;
    double price;
    String type;

    SideDish(String name, double price, String type) {
        this.name = name;
        this.price = price;
        this.type = type;
    }

    void show() {
        System.out.println("SideDish [Name: " + name + ", Price: ₹" + price + ", Type: " + type + "]");
    }
}

public class Main {
    public static void main(String[] args) {
        Sandal[] sandals = new Sandal[5];
        sandals[0] = new Sandal("Bata", 'M', 799.99, "Black");
        sandals[1] = new Sandal("Nike", 'L', 1599.49, "White");
        sandals[2] = new Sandal("Adidas", 'S', 1299.99, "Blue");
        sandals[3] = new Sandal("Puma", 'M', 899.99, "Red");
        sandals[4] = new Sandal("Reebok", 'L', 1199.49, "Green");

        Market[] markets = new Market[5];
        markets[0] = new Market("Sarojini", "Delhi");
        markets[1] = new Market("Dadar", "Mumbai");
        markets[2] = new Market("Chickpet", "Bangalore");
        markets[3] = new Market("Lajpat Nagar", "Delhi");
        markets[4] = new Market("T Nagar", "Chennai");

        SideDish[] sideDishes = new SideDish[5];
        sideDishes[0] = new SideDish("Paneer Tikka", 250.00, "Vegetarian");
        sideDishes[1] = new SideDish("Chicken Wings", 300.00, "Non-Vegetarian");
        sideDishes[2] = new SideDish("Aloo Tikki", 100.00, "Vegetarian");
        sideDishes[3] = new SideDish("Fish Fry", 350.00, "Non-Vegetarian");
        sideDishes[4] = new SideDish("Samosa", 50.00, "Vegetarian");

        for (Sandal sandal : sandals) {
            if (sandal != null) {
                sandal.show();
            } else {
                System.out.println("Data is null");
            }
        }

        for (Market market : markets) {
            if (market != null) {
                market.show();
            } else {
                System.out.println("Data is null");
            }
        }

        for (SideDish sideDish : sideDishes) {
            if (sideDish != null) {
                sideDish.show();
            } else {
                System.out.println("Data is null");
            }
        }
    }
}
