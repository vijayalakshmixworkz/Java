package com.xworkz.abstraction.runner;

import com.xworkz.abstraction.things.TimeMachine;
import com.xworkz.abstraction.things.XTimeMachine;

public class TimeMachineRunner {
	public static void main(String[] args)
	{
		TimeMachine timeMachine =new XTimeMachine();
		timeMachine.travelPast();
	}

}
