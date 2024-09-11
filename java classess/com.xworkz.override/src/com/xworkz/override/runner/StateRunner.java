package com.xworkz.override.runner;

import com.xworkz.override.things.State;

public class StateRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		        State state1 = new State("Karnataka", "Bengaluru", 67562686, 191791, "India", "Kannada");
		        State state2 = new State("Tamil Nadu", "Chennai", 77841267, 130058, "India", "Tamil");

		        System.out.println(state1.equals(state2)); // false
		    }

	}


