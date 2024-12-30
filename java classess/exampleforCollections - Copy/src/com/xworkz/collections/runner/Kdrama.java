package com.xworkz.collections.runner;

import java.util.ArrayList;
import java.util.Collection;
public class Kdrama {
	public static void main(String[] args) {
		Collection<String> strings= new ArrayList<>();
		strings.add("W2");
		strings.add("playful");
		strings.add("boys over flower");
		strings.add("vincenzo");
		strings.add("squid game");
		strings.add("18 again");
		strings.add("moving");
		strings.add("strat up");
		strings.add("mouse");
		strings.add("the heirs");
		strings.add("kingdom");
	System.out.println("kdrama names"+strings);
	System.out.println("count "+strings.size());
	strings.clear();
	System.out.println("count after clear "+  strings.size());
	}
	

}
