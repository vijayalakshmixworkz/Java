package com.xworkz.examplesForInterfaces.things;

public class BnglrPG {
	private PGRule pgRule;
	public void setPG(PGRule pgRule) {
		this.pgRule=pgRule;
	}
	public void check()
	{
		if(pgRule!=null)
		{
			System.out.println("pg rule is not null");
			double cost=pgRule. costPerMonth();
			 boolean network=pgRule.wifi();
			 if(network)
			 {
				 System.out.println("network is not null");
			 }
			 else
			 {
				 System.out.println("network is null");
			 }
		}
	}
	

}
