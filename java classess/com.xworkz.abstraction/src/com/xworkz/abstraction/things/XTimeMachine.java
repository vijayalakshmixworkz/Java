package com.xworkz.abstraction.things;

public class XTimeMachine extends TimeMachine {
	
	public XTimeMachine()
	{
		// chaining 
		super();// we are calling the constructor of parent class.
		System.out.println("no-arg const of XTimeMachine");
	}

	@Override
	public void travelPast() {
		// TODO Auto-generated method stub
		System.out.println("running travelPast in XTimeMachine");
		System.out.println("this is just started");
		
	}

}
