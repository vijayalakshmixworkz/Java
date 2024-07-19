class JuiceRunner
{
	public static void main(String[] args)
	{
		System.out.println("Running main in JuiceRunner");

		
		//	public static void juiceInfo(String name,String brand,String flavour,int price,int quantity)

			if(args.length==5)
			{
				String name=args[0];
				String brand=args[1];
				String flavour=args[2];//into float :info
				String price=args[3];
				String quantity=args[4];

				
			
			//wrapper class
			 int convertedPrice=Integer.parseInt(price);
			 int convertedQuantity=Integer.parseInt(quantity);
//int number = Integer.parseInt(numberString);

			 Information.juiceInfo(name,brand, flavour,convertedPrice,convertedQuantity);
	//public static void medicineInfo(String name, String manfDate, float price, int quantity)

				
			}
		
		
		
		
	}
}