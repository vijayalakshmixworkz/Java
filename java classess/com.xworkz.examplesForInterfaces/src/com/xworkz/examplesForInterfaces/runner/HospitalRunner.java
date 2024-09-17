package com.xworkz.examplesForInterfaces.runner;

import com.xworkz.examplesForInterfaces.things.GovtHospitalRule;
import com.xworkz.examplesForInterfaces.things.GovtHospitalRuleImp;

public class HospitalRunner {

	public static void main(String[] args) {
		GovtHospitalRule govtHospitalRule=new GovtHospitalRuleImp();
		System.out.println(govtHospitalRule.STATE);
		govtHospitalRule.maintainSilence();
		govtHospitalRule.visitersAllowed();
		govtHospitalRule.serve();
		
		
	}
	
}
