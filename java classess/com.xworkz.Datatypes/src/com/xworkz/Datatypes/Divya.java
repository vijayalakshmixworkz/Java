package com.xworkz.Datatypes;

public class Divya {
	public void safeguard()
	{
		Shoe shoe=null;

	if(shoe!=null) {
		shoe.safeguard();
		System.out.println(shoe.brand);
	}
	else
	{
		System.out.println("Shoe is null");
	}
}
}

