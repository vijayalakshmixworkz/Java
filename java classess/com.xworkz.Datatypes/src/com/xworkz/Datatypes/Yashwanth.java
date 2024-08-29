package com.xworkz.Datatypes;

public class Yashwanth {
	// instance variable
	// to initialize-literala,ref,constructor,methods.
	private Sanitizer sanitizer;
	public Yashwanth(Sanitizer sanitizer)
	{
		this.sanitizer=sanitizer;
	}

	public void killGerms() {

		if (sanitizer != null) {
			sanitizer.killGerms();
			sanitizer.show();

		} else {
			System.out.println("sanitizer is null");
		}

	}
}
