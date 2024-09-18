package com.xworkz.examplesForInterfaces.things;

public class CKMTrafficRules {
	private TrafficRules trafficRules;

	public void setTraffic(TrafficRules trafficRules) {
		this.trafficRules = trafficRules;
		System.out.println("set traffic is running in ckm");
	}

	public void check() {
		if (trafficRules != null) {
			System.out.println(" traffic rul is not null");
			String valid = trafficRules.licenceNo();
			if (valid!=null) {
				System.out.println(" license number is valid");
			}
			else
			{
				System.out.println("invalid");
			}
		}
			else
			{
				System.out.println("traffic is null");
			}
		}
	}
