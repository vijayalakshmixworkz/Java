package com.xworkz.override.things;
// if we use final, we cannot inherit it.
// we cannot use it as parent
// you cannot modify the class
// it is called as immutable class.
public final   class Charger {
	public void charging() {
		System.out.println("charging in charger");
	}
	public void fastcharging() {
		System.out.println("fastcharging in charger");
	}

	

}
