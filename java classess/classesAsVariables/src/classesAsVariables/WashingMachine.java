package classesAsVariables;
//WashingMachine ---> brand,type,capacity, rinse(),show();

//Megha:local var,Lakshmi: paramater,Abhishek :instance variable,Bhukima: return-type ,Nayana: local var

public class WashingMachine {
	String brand;
	private String type;
	private int capacity;

	public WashingMachine(String brand, String type, int capacity) {
		super();
		this.brand = brand;
		this.type = type;
		this.capacity = capacity;
	}

	public WashingMachine() {
		super();
		System.out.println("created washingmachine using no-arg constructor");
	}

	public void rinse() {
		System.out.println("running rinse");
	}

	public void show() {
		System.out.println("brand:" + brand);
		System.out.println("type:" + type);
		System.out.println("capacity:" + capacity);
	}
}
