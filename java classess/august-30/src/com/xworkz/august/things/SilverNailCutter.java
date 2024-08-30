package com.xworkz.august.things;

;

public class SilverNailCutter {
	//it is a datatype
	// 4 principles
	//used as reference or parent
	// has a implicit no-arg const
	//has const chaining
	// create copies,using new keyword
	// can be access controlled: public or package default
	public class SilverNailCutter extends NailCutter{
		
		public SilverNailCutter(double weight,String material)
		{
			super(weight,material);//init variables from parent // super chaining
		}

	}

}
