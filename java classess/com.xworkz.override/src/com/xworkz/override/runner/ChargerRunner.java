package com.xworkz.override.runner;

import com.xworkz.override.things.Charger;
import com.xworkz.override.things.NokiaCharger;

public class ChargerRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Charger charger=new Charger();
		charger.charging();
		charger.fastcharging();
		
		NokiaCharger nokiacharger=new NokiaCharger();
		nokiacharger.charging();
		nokiacharger.fastcharging();
		

	}

}
