package com.xworkz.examplesForInterfaces.runner;

import com.xworkz.examplesForInterfaces.things.IndianTrafficRules;
import com.xworkz.examplesForInterfaces.things.TrafficImplementation;

public class TrafficRuleRunner {
	public static void main(String[] args) {
		IndianTrafficRules traffic = new TrafficImplementation();

        traffic.speedLimit();
        traffic.stopAtRedLight();
        traffic.useSeatbelt();
        traffic.noOvertakingInSchoolZone();
        traffic.noHonking();
        traffic.useIndicators();
        traffic.followTrafficSignals();
        traffic.helmetCheck();
        traffic.headlightsOn();
        traffic.noMobilePhoneUse();
        traffic.laneDiscipline();
        traffic.giveWayToEmergencyVehicle();
        traffic.parkingInDesignatedArea();
        traffic.stopAtZebraCrossing();
    }
}


