package com.xworkz.examplesForInterfaces.runner;

import com.xworkz.examplesForInterfaces.things.KSRRailwayStation;
import com.xworkz.examplesForInterfaces.things.RailwayImplementation;

public class RailwaySTationRunner {
	public static void main(String[] args) {
        KSRRailwayStation station = new RailwayImplementation();

        station.ticketingRule();
        station.platformTicketRule();
        station.luggageRule();
        station.queueRule();
        station.noSmokingRule();
        station.noAlcoholRule();
        station.passengerConductRule();
        station.emergencyExitsRule();
        station.timelinessRule();
        station.lostAndFoundRule();
        station.securityCheckRule();
        station.cleanlinessRule();
        station.unattendedBaggageRule();
        station.boardingRule();
        station.restrictedAreaRule();
    }
}
