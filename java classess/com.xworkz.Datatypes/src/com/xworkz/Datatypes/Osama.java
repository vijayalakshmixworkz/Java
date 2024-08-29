package com.xworkz.Datatypes;

public class Osama {
	// parameter
	public void wash(Sanitizer sanitizer)
	{
		if(sanitizer!=null) {
		sanitizer.killGerms();
		sanitizer.show();
		
	}
		else
		{
			System.out.println("null");
		}


	}
}
