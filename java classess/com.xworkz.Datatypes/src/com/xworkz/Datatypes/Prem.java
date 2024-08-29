package com.xworkz.Datatypes;

public class Prem {
	// instance variable
	public void sanitize()
	{
		Sanitizer sanitizer=new Sanitizer("Dettol",50,100);
		sanitizer.killGerms();
		sanitizer.show();
	}

}
