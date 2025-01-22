abstract class Animal {
    // Abstract method (does not have a body)
    public abstract void sound();
    
    // Regular method
    public void eat() {
        System.out.println("This animal eats food");
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.sound(); // Outputs: Dog barks
        dog.eat();   // Outputs: This animal eats food
    }
}
