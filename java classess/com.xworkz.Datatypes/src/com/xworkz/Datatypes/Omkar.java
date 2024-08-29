package com.xworkz.Datatypes;

public class Omkar {
	public void safeguard(Shoe  shoe)
	{
	if(shoe!=null) {
		shoe.safeguard();
		System.out.println(shoe.cost);
	}
	else
	{
		System.out.println("shoe is null");
	}

}
}
