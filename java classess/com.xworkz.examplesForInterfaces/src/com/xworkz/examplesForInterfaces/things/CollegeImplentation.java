package com.xworkz.examplesForInterfaces.things;

public class CollegeImplentation implements AITCollege  {

	@Override
	public void academicRules() {
		System.out.println("academic rules");
		
	}

	@Override
	public boolean discipline() {
		return true;
	}

	@Override
	public double hostelfee() {
		return 90000;
	
	}

	@Override
	public int attendance() {
		System.out.println("attendence");
		return 80;
	}

	@Override
	public void libraryRules() {
		System.out.println("library");
		
	}

	@Override
	public void safety() {
		System.out.println("safety");
		
	}

	@Override
	public boolean SecurityRules() {
		System.out.println("security rules");
		return false;
	}

	@Override
	public int noOfPlacements() {
		System.out.println("no of placements");
		return 100;
	}

	@Override
	public String name() {
		System.out.println(" AIT");
		return null;
	}

	@Override
	public void display() {
System.out.println("AIT college have rules");		
	}

}
