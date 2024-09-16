package com.xworkz.examplesForInterfaces.things;

// data type: 7 ways : 4 variables + return type +extends+ implements
// class: 6 ways
public interface HospitalRule {
	
	static String STATE="karnataka";
	// use upper case to name the variable, when it is static and final
	//variable should be public
	// it is implicitly final. so you have to initialize it
	// can have literals only.
	boolean maintainSilence();
	// method should be public
	// it is implicitly abstract method i.e it does not have a body.
	int visitersAllowed();
	
	

}
