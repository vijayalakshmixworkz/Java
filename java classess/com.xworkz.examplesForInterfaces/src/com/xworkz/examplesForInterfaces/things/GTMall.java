package com.xworkz.examplesForInterfaces.things;

public class GTMall {
	private MallRules mallrules;
	public void GTMall(MallRules mallrules) {
		this.mallrules= mallrules;
	}
public void check()
{
	if(mallrules!=null) {
		System.out.println("mallrules is not null");
		boolean mall=mallrules.validId();
		if (mall) {
			System.out.println(" mallrule  is valid");
		}
		else
		{
			System.out.println("mall rule is invalid");
		}
	}
		else
		{
			System.out.println("mallrule  is null");
		}
	}
}
