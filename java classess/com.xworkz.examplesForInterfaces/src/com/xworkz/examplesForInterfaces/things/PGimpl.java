package com.xworkz.examplesForInterfaces.things;

public class PGimpl implements PGRule{

	@Override
	public double costPerMonth() {
		return 65000;
	}

	@Override
	public boolean wifi() {

		 return true;
	}

}
