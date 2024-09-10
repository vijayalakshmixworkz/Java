package com.xworkz.inherit.things;

public class Toy {
	private int size;
	private int recommendeAge;
	private boolean washable;
	private String sellerName;
	private String description;
	public Toy(int size,int recommendeAge,boolean washable,String sellerName,String description) {
		this.size=size;
		this.recommendeAge=recommendeAge;
		this .washable=washable;
		this.sellerName=sellerName;
		this.description=description;
		
	}
	public boolean equals(Object obj) {
		System.out.println("running equals in Toy ");
		if(obj!=null)
		{
			if(obj instanceof Toy)
			{
				Toy casted=(Toy)obj;
				if(this.size==casted.size&&this.washable==casted.washable)
				{
					System.out.println("this & obj content is matching");
					return true;
				}
			}else {
				System.out.println("obj is not toy");
			}
		}else {
			System.out.println("obj is null");
		}

	return super.equals(obj);

}
	public String toString() {
		return description;
		
	}

}


