package com.xworkz.august.things;

public class ToothPaste {
private String company;
private boolean salt;
public ToothPaste(String company)
{
	this.company=company;
	System.out.println("running String cons in toothpaste");
}
public ToothPaste(String company,boolean salt)
{
	this.company=company;
	this.salt=salt;
}
public void display()
{
	System.out.println("display from toothpaste");
	System.out.println("comapany"+this.company);
	System.out.println("salt"+this.salt);
}
}
