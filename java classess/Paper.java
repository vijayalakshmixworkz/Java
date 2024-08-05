 class Paper {
     double thickness;
     String size;
     String quality;
     String color;

    // 1. Constructor
    public Paper(double thickness, String size, String quality, String color) {
        this.thickness = thickness;
        this.size = size;
        this.quality = quality;
        this.color = color;
    }

    // 2. Static Factory Method
    public static Paper createPaper(double thickness, String size, String quality, String color) {
        return new Paper(thickness, size, quality, color);
    }

    // 3. Setters for initialization
    public void setThickness(double thickness) {
        this.thickness = thickness;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // 4. Direct assignment (Literals)
    public void setDefaultValues() {
        this.thickness = 0.1;
        this.size = "A4";
        this.quality = "Standard";
        this.color = "White";
    }

    // Method to display all instance variables
    public void displayInfo() {
        System.out.println("Thickness: " + thickness + "mm, Size: " + size + ", Quality: " + quality + ", Color: " + color);
    }

    public static void main(String[] args) {
        // Using Constructor
        Paper paper1 = new Paper(0.2, "A3", "High", "Blue");
        paper1.displayInfo();

        // Using Static Factory Method
        Paper paper2 = Paper.createPaper(0.15, "Letter", "Premium", "Green");
        paper2.displayInfo();

        // Using Setters
        Paper paper3 = new Paper(0.0, null, null, null);
        paper3.setThickness(0.3);
        paper3.setSize("A5");
        paper3.setQuality("Low");
        paper3.setColor("Yellow");
        paper3.displayInfo();

        // Using Direct Assignment (Literals)
        Paper paper4 = new Paper(0.0, null, null, null);
        paper4.setDefaultValues();
        paper4.displayInfo();
    }
}
