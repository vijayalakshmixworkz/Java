package com.xworkz.function.things;

public class Labour {
public void startMotor(Starter starter) {
	if(starter !=null) {
		System.out.println("starter is not null");
		starter.on();
	}
	else {
		System.out.println("starter is null");
	}
}
public void orderFood(FoodApp foodApp)
{
	if(foodApp!=null) {
		foodApp.order("idli");
	}
}
}
