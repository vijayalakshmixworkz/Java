package com.xworkz.examplesForInterfaces.things;

public class RailwayImplementation implements KSRRailwayStation {
	
	public void ticketingRule() {
	        System.out.println("1. All passengers must carry a valid ticket before entering the platform.");
	    }

	    @Override
	    public void platformTicketRule() {
	        System.out.println("2. People without a travel ticket must purchase a platform ticket to access the platform.");
	    }

	    @Override
	    public void luggageRule() {
	        System.out.println("3. Passengers are allowed only a limited amount of luggage as per the ticket class.");
	    }

	    @Override
	    public void queueRule() {
	        System.out.println("4. Passengers must stand in queue while purchasing tickets and boarding the train.");
	    }

	    @Override
	    public void noSmokingRule() {
	        System.out.println("5. Smoking is strictly prohibited on platforms and inside the trains.");
	    }

	    @Override
	    public void noAlcoholRule() {
	        System.out.println("6. Alcohol consumption is prohibited on railway premises and inside the trains.");
	    }

	    @Override
	    public void passengerConductRule() {
	        System.out.println("7. Passengers must behave respectfully with staff and fellow passengers.");
	    }

	    @Override
	    public void emergencyExitsRule() {
	        System.out.println("8. Emergency exits must be kept clear and should only be used during emergencies.");
	    }

	    @Override
	    public void timelinessRule() {
	        System.out.println("9. Passengers should arrive at the station at least 30 minutes before the scheduled departure.");
	    }

	    @Override
	    public void lostAndFoundRule() {
	        System.out.println("10. Lost items must be reported to the Lost & Found office for retrieval.");
	    }

	    @Override
	    public void securityCheckRule() {
	        System.out.println("11. Passengers must comply with security checks, including baggage scans and metal detectors.");
	    }

	    @Override
	    public void cleanlinessRule() {
	        System.out.println("12. Passengers must dispose of waste in designated bins to maintain station cleanliness.");
	    }

	    @Override
	    public void unattendedBaggageRule() {
	        System.out.println("13. Unattended baggage may be removed and checked by security for safety reasons.");
	    }

	    @Override
	    public void boardingRule() {
	        System.out.println("14. Passengers should board the train only after it has come to a complete stop and follow designated boarding gates.");
	    }

	    @Override
	    public void restrictedAreaRule() {
	        System.out.println("15. Passengers are not allowed to enter restricted areas such as tracks, train maintenance areas, or staff-only zones.");
	    }
		@Override
		public void Display() {
			
		}


}
