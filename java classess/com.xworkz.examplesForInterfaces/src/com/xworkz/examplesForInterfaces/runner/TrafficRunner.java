package com.xworkz.examplesForInterfaces.runner;

import com.xworkz.examplesForInterfaces.things.CKMTrafficRules;
import com.xworkz.examplesForInterfaces.things.CKMimpl;
import com.xworkz.examplesForInterfaces.things.TrafficRules;

public class TrafficRunner {
public static void main(String[] args) {
	TrafficRules trafficRules = new CKMimpl();
	System.out.println(trafficRules.licenceNo());
	CKMTrafficRules cKMTrafficRules=new CKMTrafficRules();
	cKMTrafficRules.check();
	cKMTrafficRules.setTraffic(trafficRules);
	
	
}
}
