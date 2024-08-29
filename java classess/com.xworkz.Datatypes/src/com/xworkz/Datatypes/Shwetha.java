package com.xworkz.Datatypes;

public class Shwetha {
	
	private WaterBottle waterBottle;
	public Shwetha(WaterBottle waterBottle)
	{
		this.waterBottle=waterBottle;
	}

	public void empty() {

		if (waterBottle != null) {
			waterBottle.crush();
			waterBottle.fill();

		} else {
			System.out.println("waterBottle is null");
		}


}
}
