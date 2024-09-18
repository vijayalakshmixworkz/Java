package com.xworkz.examplesForInterfaces.runner;

import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;

import com.xworkz.examplesForInterfaces.things.CanaraHotelRuleImp;
import com.xworkz.examplesForInterfaces.things.FoodSafetyDepartment;
import com.xworkz.examplesForInterfaces.things.HotelRules;

public class HotelRunner {

	public static void main(String[] args) {
		HotelRules hotelRules = new CanaraHotelRuleImp();
		System.out.println(hotelRules.cleanPremises());
		FoodSafetyDepartment foodSafetyDepartment=new FoodSafetyDepartment();
		foodSafetyDepartment.setinspection(hotelRules);
	}

}
