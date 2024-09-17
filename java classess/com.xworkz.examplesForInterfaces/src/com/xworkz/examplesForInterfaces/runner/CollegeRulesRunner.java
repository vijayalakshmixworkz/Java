package com.xworkz.examplesForInterfaces.runner;

import com.xworkz.examplesForInterfaces.things.AITCollege;
import com.xworkz.examplesForInterfaces.things.CollegeImplentation;

public class CollegeRulesRunner {

	public static void main(String[] args) {
		AITCollege aitcollege= new CollegeImplentation();
		System.out.println();
		System.out.println(aitcollege.attendance());
		 System.out.println(aitcollege.discipline());
		 System.out.println();
		 System.out.println(aitcollege.hostelfee());
		 System.out.println();
		 System.out.println(aitcollege.noOfPlacements());
		 System.out.println();
		 System.out.println(aitcollege.SecurityRules());
		 System.out.println(aitcollege.name());
		
	}

}
