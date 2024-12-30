package com.xworkz.collections.runner;

import java.util.ArrayList;
import java.util.Collection;

public class Food {
public static void main(String[] args) {
	Collection<String> food=new ArrayList<>();
	food.add("momos");
	food.add("ice cream");
	food.add("pizza");
	food.add("burger");
	food.add("cake");
	food.add("maggie");
	food.add("noodles");
	food.add("veg roll");
	food.add("fruit salad");
	food.add("biriyani");
	System.out.println("food items:"+food);
	System.out.println("count"+food.size());
	food.clear();
	System.out.println("count"+food.size());
}
}
