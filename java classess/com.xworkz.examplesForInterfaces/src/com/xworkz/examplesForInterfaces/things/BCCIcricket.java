package com.xworkz.examplesForInterfaces.things;

public class BCCIcricket {
	private CricketRule cricketRule;
	public void setCricketRule(CricketRule cricketRule) {
		this.cricketRule=  cricketRule;
		
	}
	public void check()
	{
		if( cricketRule!=null)
		{
			System.out.println("is not null");
			cricketRule.powerplay();
		}
		else
		{
			System.out.println("cricketRule is null");
		}
	}
	

}
