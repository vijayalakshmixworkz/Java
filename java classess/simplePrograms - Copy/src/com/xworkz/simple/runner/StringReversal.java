package com.xworkz.simple.runner;

import java.util.Scanner;

public class StringReversal {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("enter the string");
	String input=scanner.nextLine();
	String reversed="";
	for(int i=input.length()-1;i>=0;i--) {
		reversed+=input.charAt(i);
	}
	System.out.println("reversed string is "+reversed);
	scanner.close();
	
}
}
