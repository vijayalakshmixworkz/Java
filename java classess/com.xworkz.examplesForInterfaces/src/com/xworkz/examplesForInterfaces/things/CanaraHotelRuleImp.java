package com.xworkz.examplesForInterfaces.things;

public class CanaraHotelRuleImp implements HotelRules {

	@Override
	public boolean cleanPremises() {
		System.out.println("clean Premises");
		return true;
	}

}
