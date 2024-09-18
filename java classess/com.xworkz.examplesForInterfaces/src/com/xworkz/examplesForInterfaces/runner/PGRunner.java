package com.xworkz.examplesForInterfaces.runner;

import com.xworkz.examplesForInterfaces.things.BnglrPG;
import com.xworkz.examplesForInterfaces.things.PGRule;
import com.xworkz.examplesForInterfaces.things.PGimpl;

public class PGRunner {

	public static void main(String[] args) {
PGRule pgrule=new PGimpl();
System.out.println(pgrule.costPerMonth());
System.out.println(pgrule.wifi());
BnglrPG bnglr=new BnglrPG();
bnglr.setPG(pgrule);
bnglr.check();
	}

}
