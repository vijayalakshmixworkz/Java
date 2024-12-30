package com.xworkz.simple.runner;
import com.sun.org.apache.xpath.internal.objects.*;
import java.util.Scanner;
public class PrimeCheck {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("enter the number");

	int number=scanner.nextInt();
	boolean isPrime=true;
	if(number<1) {
		isPrime=false;
	}
	else
	{
		for(int i=2;i<=Math.sqrt(number);i++) {
			if(number%i==0)
			{
				isPrime=false;
				break;
			}
		}
	}
	if(isPrime)
	{
		System.out.println("number is prime"+number);
	}
	else
	{
		System.out.println("number is  not prime"+number);

	}
	scanner.close();
	}
}
