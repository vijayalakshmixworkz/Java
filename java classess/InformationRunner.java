class InformationRunner
{
	public static void main(String[] args)
	{
		System.out.println("Running main in InformationRunner");

		{
			if(args.length==4)
			{
				String name=args[0];
				String manfDate=args[1];
				String price=args[2];
				String quantity=args[3];
				
			
			
			 float convertedPrice=Float.parseFloat(price);
			 int convertedQuantity=Integer.parseInt(quantity);
//int number = Integer.parseInt(numberString);

			 Information.medicineInfo(name,manfDate,convertedPrice,convertedQuantity);
	//public static void medicineInfo(String name, String manfDate, float price, int quantity)

				
			}
		}
		
		
		
	}
}