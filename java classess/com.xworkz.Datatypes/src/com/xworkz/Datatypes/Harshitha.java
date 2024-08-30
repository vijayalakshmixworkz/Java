package com.xworkz.Datatypes;


public class Harshitha {
	Shoe shoe;

	public void wear()
	{
		if(shoe!=null) {
	    shoe.enhancewalk();
	    shoe.safeguard();
	    System.out.println(shoe.brand);
		}else {
			
			System.out.println("null pointer exception");
		}
	
	}

}
