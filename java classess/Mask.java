//Create instance using each const , need to print all the references after creation of the instance
//Mask : double cost,char size,String material
//No parameter const
//Constructor to init cost
//Constructor to init size
//Constructor to init material
//Constructor to init cost ,size and material
//Constructor to init cost and size
class Mask {
    double cost;
    char size;
    String material;

    public Mask() {
        System.out.println("No parameter constructor");
    }

    Mask(double cost) {
        this.cost = cost;
        System.out.println("Constructor with cost parameter");
    }

    public Mask(char size) {
        this.size = size;
        System.out.println("Constructor with size parameter");
    }

    public Mask(String material) {
        this.material = material;
        System.out.println("Constructor with material parameter");
    }

    public Mask(double cost, char size, String material) {
        this.cost = cost;
        this.size = size;
        this.material = material;
        System.out.println("Constructor with cost, size, and material parameters");
    }

    public Mask(double cost, char size) {
        this.cost = cost;
        this.size = size;
        System.out.println("Constructor with cost and size parameters");
    }

   
}