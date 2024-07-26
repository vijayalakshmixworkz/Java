//16 Real World Objects
//Declare below class , add three instance variables in each class
//Declare Explicit const with a Message
//Create the instance Print the default-values for below classes


class ConstructorRunner
{
	public static void main(String[] args)
	{
		System.out.println("Running mainRunner");
		
		//Rupee()
		

		Rupee rupee=new Rupee();
				System.out.println("value :"+rupee.value);
		System.out.println("currency :"+rupee.currency);
		System.out.println("weight :"+rupee.weight);

		rupee.value=5;
		rupee.currency="INR";
		rupee.weight=50;
		System.out.println("value :"+rupee.value);
		System.out.println("currency :"+rupee.currency);
		System.out.println("weight :"+rupee.weight);
		
		//AirCondition() 
		
		
		AirCondition airConditioner=new AirCondition();
		System.out.println("airConditioner :"+airConditioner.brand);
		System.out.println("airConditioner :"+airConditioner.quantity);
		System.out.println("airConditioner :"+airConditioner.price);
		
		airConditioner.brand="WhirlPool";
		airConditioner.quantity=1;
		airConditioner.price=25000;
		System.out.println("airConditioner :"+airConditioner.brand);
		System.out.println("airConditioner :"+airConditioner.quantity);
		System.out.println("airConditioner :"+airConditioner.price);
		
		// class Autorikshaw

	Autorikshaw autorikshaw=new Autorikshaw();
	System.out.println("airConditioner :"+autorikshaw.price);
		System.out.println("airConditioner :"+autorikshaw.vehicleNumber);
		System.out.println("airConditioner :"+autorikshaw.owner);
	
		autorikshaw.price=50;
		autorikshaw.vehicleNumber="HG102";
		autorikshaw.owner="Hemanth";
		System.out.println("airConditioner :"+autorikshaw.price);
		System.out.println("airConditioner :"+autorikshaw.vehicleNumber);
		System.out.println("airConditioner :"+autorikshaw.owner);
	
		//AutoDriver()
		
		AutoDriver autoDriver=new AutoDriver();
		System.out.println("autoDriver:"+autoDriver.name);
		System.out.println("autoDriver:"+autoDriver.age);
		System.out.println("autoDriver:"+autoDriver.contactNumber);
		autoDriver.name="Arun";
		autoDriver.age=34;
		autoDriver.contactNumber=6361;
		System.out.println("autoDriver:"+autoDriver.name);
		System.out.println("autoDriver:"+autoDriver.age);
		System.out.println("autoDriver:"+autoDriver.contactNumber);
		
		//Rapido()
	
		Rapido rapido=new Rapido();
		System.out.println("rapido:"+rapido.id);
		System.out.println("rapido:"+rapido.cost);
		System.out.println("rapido:"+rapido.location);
		rapido.id="vg3456";
		rapido.cost=345;
		rapido.location="vijayanagar";
		System.out.println("rapido:"+rapido.id);
		System.out.println("rapido:"+rapido.cost);
		System.out.println("rapido:"+rapido.location);
		
		//CabCompany()
	

		CabCompany cabCompany=new CabCompany();
				System.out.println("name:"+cabCompany.name);
		System.out.println("income:"+cabCompany.income);
		System.out.println("noOfEmployees:"+cabCompany.noOfEmployees);
		
		cabCompany.name="Uber";
		cabCompany.income=786567;
		cabCompany.noOfEmployees=140;
		System.out.println("name:"+cabCompany.name);
		System.out.println("income:"+cabCompany.income);
		System.out.println("noOfEmployees:"+cabCompany.noOfEmployees);
		
		//BMTC()
		
		BMTC bmtc=new BMTC();
		System.out.println("bmtc noOfBuses:"+bmtc.noOfBuses);
		System.out.println("bmtc officeLocation:"+bmtc.officeLocation);
		System.out.println("bmtc noOfEmployees:"+bmtc.noOfEmployees);
		 
		bmtc.noOfBuses=9591;
		bmtc.officeLocation="Vijayanagar";
		bmtc.noOfEmployees=76594;
		System.out.println("bmtc noOfBuses:"+bmtc.noOfBuses);
		System.out.println("bmtc officeLocation:"+bmtc.officeLocation);
		System.out.println("bmtc noOfEmployees:"+bmtc.noOfEmployees);
		 
		//FoodDeliveryCompany
		 
		FoodDeliveryCompany foodDeliveryCompany=new FoodDeliveryCompany();
		System.out.println("name:"+foodDeliveryCompany.name);
		System.out.println("deliveryCharges:"+foodDeliveryCompany.deliveryCharges);
		System.out.println("location:"+foodDeliveryCompany.location);
		foodDeliveryCompany.name="Swiggy";
		foodDeliveryCompany.deliveryCharges=50;
		foodDeliveryCompany.location="maadavara";
		System.out.println("name:"+foodDeliveryCompany.name);
		System.out.println("deliveryCharges:"+foodDeliveryCompany.deliveryCharges);
		System.out.println("location:"+foodDeliveryCompany.location);



        // Matrimony
		
        Matrimony matrimony = new Matrimony();
        matrimony.owner = "John Doe";
        matrimony.signUpCost = 787989;
        matrimony.numOfSubscribers = 789769;
		
		 System.out.println("owner : " + matrimony.owner); 
		System.out.println("signUpCost: " + matrimony.signUpCost);
		System.out.println("numOfSubscribers : " + matrimony.numOfSubscribers);

		
		//update
		matrimony.owner = "Amith";
		matrimony.signUpCost = 345567;
		matrimony.numOfSubscribers = 5667879;
		
        System.out.println(" update owner : " + matrimony.owner); 
		System.out.println(" update signUpCost: " + matrimony.signUpCost);
		System.out.println(" updated numOfSubscribers : " + matrimony.numOfSubscribers);

        // Application
		
		
        Application application = new Application();
        application.Name = "ChatGPT";
        application.noOfDownloads = 345467;
        application.developerName = "sapna";
		
		System.out.println("Application - Name: " + application.Name);
		System.out.println("noOfDownloads: " + application.noOfDownloads);
		System.out.println("developerName: " + application.developerName);

		
		//update
		application.Name = "Google";
        application.noOfDownloads = 568976;
        application.developerName = "sanju";
		
        System.out.println(" updated Application - Name: " + application.Name);
		System.out.println("updated noOfDownloads: " + application.noOfDownloads);
		System.out.println("updated developerName: " + application.developerName);

        // Fruit
		
        Fruit fruit = new Fruit();
        fruit.name = "Apple";
        fruit.cost = 80;
        fruit.weight = 5;
		 System.out.println("Fruit - Name: " + fruit.name );
		System.out.println("cost: " + fruit.cost );
		System.out.println("Weight: " + fruit.weight + " kg");

		//update
		fruit.name = "Mango";
        fruit.cost = 60;
        fruit.weight = 6;
		
        System.out.println(" updated Fruit - Name: " + fruit.name );
		System.out.println("updated cost: " + fruit.cost );
		System.out.println(" updated Weight: " + fruit.weight + " kg");

        // Juice
		
	
        Juice juice = new Juice();
        juice.flavour = "Orange";
        juice.cost = 250.0;
        juice.quantityInMl = 200;
		 System.out.println("Juice - Flavor: " + juice.flavour);
		System.out.println("cost: " + juice.cost );
		System.out.println("  quantityInMl : " + juice.quantityInMl);

		
		//update
		juice.flavour = "WaterMelon";
        juice.cost = 100.0;
        juice.quantityInMl = 250;
		
        System.out.println(" updated Juice - Flavor: " + juice.flavour);
		System.out.println("updated cost: " + juice.cost );
		System.out.println("  updated quantityInMl : " + juice.quantityInMl);

        // Place
	
        Place place = new Place();
        place.name = "Paris";
        place.address = "France";
        place.distance = 105.4;
		 System.out.println("Place - Name: " + place.name);
		System.out.println("address: " + place.address);
		System.out.println("distance: " + place.distance + "  km");

		
		//place update
		place.name = "IstanBul";
        place.address = "Turkey";
        place.distance = 200;
		
        System.out.println("updated Place - Name: " + place.name);
		System.out.println(" updated address: " + place.address);
		System.out.println("updated distance: " + place.distance + "  km");

        // AlcoholBrand
		
        AlcoholBrand alcoholBrand = new AlcoholBrand();
        alcoholBrand.name = "Jack Daniel's";
        alcoholBrand.quantity = 40;
        alcoholBrand.price = 150;
		 System.out.println("AlcoholBrand - Brand Name: " + alcoholBrand.name);
		System.out.println("Alcohol quantity: " + alcoholBrand.quantity);
		System.out.println("price: " + alcoholBrand.price);

		
		//update
		alcoholBrand.name = "Old Monk";
        alcoholBrand.quantity = 60;
        alcoholBrand.price = 200;
        System.out.println(" updated AlcoholBrand - Brand Name: " + alcoholBrand.name);
		System.out.println(" updated Alcohol quantity: " + alcoholBrand.quantity);
		System.out.println("  updated price: " + alcoholBrand.price);

        // Candy
		
		
        Candy candy = new Candy();
        candy.name = "Snickers";
        candy.quantity = 2;
        candy.flavour = "Chocolate";
		 System.out.println("Candy - Name: " + candy.name);
		System.out.println("quantity: " + candy.quantity );
		System.out.println("Flavour: " + candy.flavour);
		
		//update
		candy.name = "wafers";
        candy.quantity = 3;
        candy.flavour = "Vanilla";
		
        System.out.println(" updated Candy - Name: " + candy.name);
		System.out.println(" updated quantity: " + candy.quantity );
		System.out.println(" updated Flavour: " + candy.flavour);

        // Medicine
		
        Medicine medicine = new Medicine();
        medicine.name = "Aspirin";
        medicine.manfDate = "22/3/22";
        medicine.expDate = "22/3/25";
		 System.out.println("Medicine - Name: " + medicine.name);
		System.out.println("manfDate: " + medicine.manfDate);
		System.out.println("expDate: " + medicine.expDate );
		
		//update
		medicine.name = "Paracetamol";
        medicine.manfDate = "1/6/23";
        medicine.expDate = "2/6/26";
		
        System.out.println(" updated Medicine - Name: " + medicine.name);
		System.out.println(" updated manfDate: " + medicine.manfDate);
		System.out.println(" updated expDate: " + medicine.expDate );

        // Food
		
        Food food = new Food();
        food.name = "Pizza";
        food.price = 25;
        food.calories = 300;
		System.out.println("Food - Name: " + food.name );
		System.out.println("price: " + food.price);
		System.out.println("Calories: " + food.calories );
		
		//update
		food.name = "Burger";
        food.price = 20;
        food.calories = 200;
		
        System.out.println(" update Food - Name: " + food.name );
		System.out.println(" updated price: " + food.price);
		System.out.println(" updated Calories: " + food.calories );
 

	}
}