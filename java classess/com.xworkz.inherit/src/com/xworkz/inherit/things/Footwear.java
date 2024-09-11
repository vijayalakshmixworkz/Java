package com.xworkz.inherit.things;

public class Footwear {
private String gender;
private int size;
private double price;
private String color;
private String type;
private double discount;
public Footwear(String gender,int size, double price, String color,String type,double discount) {
	super();
	this.gender=gender;
	this.size=size;
	this.price=price;
	this.type=type;
	this.color=color;
	this.discount=discount;
}
public Footwear(String gender,int size, double price, String color,String type,double discount) {
	super();
	this.gender=gender;
	this.size=size;
	this.price=price;
	this.type=type;
	this.color=color;
	this.discount=discount;
}
@Override
public String toString() {
	return "Footwear [gender=" + gender + ", size=" + size + ", price=" + price + ", color=" + color + ", type=" + type
			+ ", discount=" + discount + "]";
}
public boolean equals(Object obj) {
	System.out.println("running equals in footwear");
	if(obj!=null) {
		if(obj instanceof Footwear)
		{
			Footwear casted= (Footwear)obj;
			
				if(this.size==casted.size) {
					
					return true;
			}
		}
	}
}
public void setColor(String color) {
	this.color=color;
}
public void setType(String type) {
	this.type=type;


}
public void setDiscount(String discount) {
	this.discount=discount;
}
}
