package com.xworkz.septwelve.runner;

import com.xworkz.septwelve.things.Palace;

//static block runs only once
public class PalaceRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Palace palace=new Palace();
		new Palace();//copy
		Institute institute=new Institute("rajajinagar");
		System.out.println(institute.branchName);

	}

}