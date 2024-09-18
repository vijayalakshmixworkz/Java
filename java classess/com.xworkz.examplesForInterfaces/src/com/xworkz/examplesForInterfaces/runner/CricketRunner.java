package com.xworkz.examplesForInterfaces.runner;

import com.xworkz.examplesForInterfaces.things.BCCIcricket;
import com.xworkz.examplesForInterfaces.things.CAcricketRule;
import com.xworkz.examplesForInterfaces.things.CricketRule;

public class CricketRunner {

	public static void main(String[] args) {
		CricketRule cricketRule = new CAcricketRule();
		BCCIcricket bcci = new BCCIcricket();
		bcci.setCricketRule(cricketRule);// association
		bcci.check();
	}

}
