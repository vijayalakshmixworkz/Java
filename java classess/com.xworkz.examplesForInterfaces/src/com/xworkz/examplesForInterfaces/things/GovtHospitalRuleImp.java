package com.xworkz.examplesForInterfaces.things;

public class GovtHospitalRuleImp implements GovtHospitalRule {
	
	@Override
	public boolean maintainSilence() {
		
		System.out.println("maintainSilence in HospitalRunner");
		return false;
	}

	@Override
	public int visitersAllowed() {
		System.out.println("visitersAllowed in HospitalRunner");
		return 2;
	}

	@Override
	public boolean serve() {
		System.out.println("serve in HospitalRunner");
		return true;
	} 

}

	
	
