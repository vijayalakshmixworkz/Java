package com.xworkz.examplesForInterfaces.runner;

import com.xworkz.examplesForInterfaces.things.AITCollege;
import com.xworkz.examplesForInterfaces.things.CollegeImplentation;

public class CollegeRulesRunner {

	public static void main(String[] args) {
		AITCollege aitcollege= new CollegeImplentation();
		aitcollege.academicRules();
		aitcollege.attendance();
		aitcollege.discipline();
		aitcollege.display();
		aitcollege.hostelfee();
		aitcollege.libraryRules();
		aitcollege.noOfPlacements();
		aitcollege.safety();
		aitcollege.SecurityRules();
		aitcollege.name();
		
	}

}
