package com.xworkz.holiday.things;


		//invoke method of parent
		//check instanceof
		//cast and invoke method of child


public class Dancer {
    public void use(Belt belt) {
        // Invoke method of parent
        belt.tie();
        
        // Check instanceof
        if (belt instanceof LeatherBelt) {
            // Cast and invoke method of child
            LeatherBelt leatherBelt = (LeatherBelt) belt;
            leatherBelt.clip();
        }
    }

    public static void main(String[] args) {
        Dancer dancer = new Dancer();
        Belt belt = new Belt();
        LeatherBelt leatherBelt = new LeatherBelt();
        
        System.out.println("Using Belt:");
        dancer.use(belt);
        
        System.out.println("Using LeatherBelt:");
        dancer.use(leatherBelt);
    }
}
