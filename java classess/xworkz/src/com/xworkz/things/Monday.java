package com.xworkz.things;

public class Monday {
private String name;
private String version;
String owner;
String company;
 Monday(String name,String version)
 {
	 this.name=name;
	 this .version=version;
 }
 // static or non-static
 // static- access using class name
 // non-static create a copy then invoke with references.
 void run()
 {
	 System.out.println("run...");
 }
public void debug()
{
	System.out.println("run........");
}

}
