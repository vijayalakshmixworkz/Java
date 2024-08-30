package com.xworkz.august.things;

public class GrtGold extends Gold{
public GrtGold(int carat)
{
	super(carat);//not create a copy
	System.out.println("running int const in GrtGold");
}
public GrtGold(int carat,double const)
{
	super(carat,cost);
	System.out.println("running int,double,const in GrtGold");
}
}
