package com.xworkz.things;

	import com.xworkz.things.Hat;

	public class Upendra {
		public void wear()
		{
			Hat hat= new Hat();//allocate-->copy-->default values-->invoke constructor-->Chaining-->Initialize the variables-->Return that location
		    hat.shade();
		    System.out.println(hat.color);
		
		}

	}

