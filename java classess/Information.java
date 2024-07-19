
//1. Declare a class with below method

//a. Method to take medicine information like name,manf date, price,quantity
//accept from main method and pass as arguments
//b.MEthod to take juice information like name,brand,flavour,price,quantity
//.Accept from main method and pass as arguments


class Information
{
	public static void medicineInfo(String name, String  manfDate, float price, int quantity)
	{   
		System.out.println("Running info in MedicineInformation");
		 System.out.println("Name: " + name);
        System.out.println("Manufacture Date: " + manfDate);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
		

    }
	public static void juiceInfo(String name,String brand,String flavour,int price,int quantity)
	{
		System.out.println("Running juice in JuiceInformation");
		System.out.println("Name :"+name);
		System.out.println("Brand :"+brand);
		System.out.println("Flavour :"+flavour);
		System.out.println("Price :"+price);
		System.out.println("Quantity :"+quantity);
		
	}
}