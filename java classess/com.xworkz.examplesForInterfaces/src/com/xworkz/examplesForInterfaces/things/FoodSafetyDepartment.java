package com.xworkz.examplesForInterfaces.things;

public class FoodSafetyDepartment {
	private HotelRules hotelrules;
	public void setinspection(HotelRules hotelrules)
	{
		this.hotelrules=hotelrules;
		System.out.println("set inspection is running");
	}
	void inspection()
	{
		System.out.println(" inspection is running");
	}

}
