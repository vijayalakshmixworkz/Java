package com.xworkz.function.runner;

import com.xworkz.function.things.Labour;
import com.xworkz.function.things.Starter;
import com.xworkz.function.things.FoodApp;
public class StartRunner {
	public static void main(String[] args) {
		
	Starter starter=()->
	{
	System.out.println("running on in lambda expression");
	};
	Labour labour=new Labour();
	labour.startMotor(starter);
	
	FoodApp foodApp=(String item)->{
		System.out.println("Food App "+item);
	};
labour.orderFood(foodApp);
}
}

