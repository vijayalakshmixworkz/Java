//16 Real World Objects
//Declare below class , add three instance variables in each class
//Declare Explicit const with a Message
//Create the instance Print the default-values for below classes


class ConstructorRunner
	public static void main(String[] args)
	{
		System.out.println("Running mainRunner");
		
		//Rupee()
		

		Rupee rupee=new Rupee();
		rupee.value="5";
		rupee.currency="INR";
		rupee.weight=50;
		System.out.println("value :"+rupee.value);
		System.out.println("currency :"+rupee.currency);
		System.out.println("weight :"+rupee.weight);
		
		//AirCondition() 
		
		
		AirCondition airConditioner=new AirCondition();
		airConditioner.brand="WhirlPool";
		airConditioner.quantity=1;
		airConditioner.price=25000;
		System.out.println("airConditioner :"+airConditioner.brand);
		System.out.println("airConditioner :"+airConditioner.quantity);
		System.out.println("airConditioner :"+airConditioner.price);
		
		// class Autorikshaw

	Autorikshaw autorikshaw=new Autorikshaw();
		autorikshaw.price=50;
		autorikshaw.vehicleNumber="HG102";
		autorikshaw.owner="Hemanth";
		System.out.println("airConditioner :"+autorikshaw.price);
		System.out.println("airConditioner :"+autorikshaw.vehicleNumber);
		System.out.println("airConditioner :"+autorikshaw.owner);
	
		//AutoDriver()
		
		AutoDriver autoDriver=new AutoDriver();
		autoDriver.name="Arun";
		autoDriver.age=34;
		autoDriver.contactNumber=6361971359;
		System.out.println("autoDriver:"+autoDriver.name);
		System.out.println("autoDriver:"+autoDriver.age);
		System.out.println("autoDriver:"+autoDriver.contactNumber);
		
		//Rapido()
	
		Rapido rapido=new Rapido();
		rapido.id="vg3456";
		rapido.cost=345;
		rapido.location="vijayanagar";
		System.out.println("rapido:"+rapido.id);
		System.out.println("rapido:"+rapido.cost);
		System.out.println("rapido:"+rapido.location);
		
		//CabCompany()
	

		CabCompany cabCompany=new CabCompany();
		cabCompany.name="Uber";
		cabCompany.income=786567;
		cabCompany.noOfEmployees=140;
		System.out.println("name:"+cabCompany.name);
		System.out.println("income:"+cabCompany.income);
		System.out.println("noOfEmployees:"+cabCompany.noOfEmployees);
		
		//BMTC()
		
		BMTC bmtc=new BMTC();
		bmtc.noOfBuses=9591;
		bmtc.officeLocation="Vijayanagar";
		bmtc.noOfEmployees=76594;
		System.out.println("bmtc noOfBuses:"+bmtc.noOfBuses);
		System.out.println("bmtc officeLocation:"+bmtc.officeLocation);
		System.out.println("bmtc noOfEmployees:"+bmtc.noOfEmployees);
		 
		//FoodDeliveryCompany
		 
		FoodDeliveryCompany foodDeliveryCompany=new FoodDeliveryCompany();
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
		
        System.out.println("owner : " + matrimony.owner); 
		System.out.println("signUpCost: " + matrimony.signUpCost);
		System.out.println("numOfSubscribers : " + matrimony.numOfSubscribers);

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
        application.developer = "sanju";
		
        System.out.println("Application - Name: " + application.Name);
		System.out.println("noOfDownloads: " + application.noOfDownloads);
		System.out.println("developerName: " + application.developerName);

        // Fruit
		String name;
	float weight;
	double cost;
        Fruit fruit = new Fruit();
        fruit.name = "Apple";
        fruit.cost = "Red";
        fruit.weight = 0.15;
		 System.out.println("Fruit - Name: " + fruit.name );
		System.out.println("cost: " + fruit.cost );
		System.out.println("Weight: " + fruit.weight + " kg");

		//update
		fruit.name = "Mango";
        fruit.cost = "Yellow";
        fruit.weight = 0.20;
		
        System.out.println("Fruit - Name: " + fruit.name );
		System.out.println("cost: " + fruit.cost );
		System.out.println("Weight: " + fruit.weight + " kg");

        // Juice
        Juice juice = new Juice();
        juice.flavor = "Orange";
        juice.volume = 250.0;
        juice.isCold = true;
		
		//updatejuice.flavor = "WaterMelon";
        juice.volume = 100.0;
        juice.isCold = false;
		
        System.out.println("Juice - Flavor: " + juice.flavor);
		System.out.println("Volume: " + juice.volume );
		System.out.println(" ml, Is Cold: " + juice.isCold);

        // Place
        Place place = new Place();
        place.name = "Paris";
        place.country = "France";
        place.area = 105.4;
		
		//place
		place.name = "IstanBul";
        place.country = "Turkey";
        place.area = 200;
		
        System.out.println("Place - Name: " + place.name);
		System.out.println("Country: " + place.country);
		System.out.println("Area: " + place.area + " sq km");

        // AlcoholBrand
        AlcoholBrand alcoholBrand = new AlcoholBrand();
        alcoholBrand.brandName = "Jack Daniel's";
        alcoholBrand.alcoholPercentage = 40.0;
        alcoholBrand.originCountry = "USA";
		
		//update
		alcoholBrand.brandName = "Old Monk";
        alcoholBrand.alcoholPercentage = 60.0;
        alcoholBrand.originCountry = "London";
        System.out.println("AlcoholBrand - Brand Name: " + alcoholBrand.brandName);
		System.out.println("Alcohol Percentage: " + alcoholBrand.alcoholPercentage);
		System.out.println("Origin Country: " + alcoholBrand.originCountry);

        // Candy
        Candy candy = new Candy();
        candy.name = "Snickers";
        candy.weight = 0.05;
        candy.flavor = "Chocolate";
		
		//update
		candy.name = "wafers";
        candy.weight = 0.10;
        candy.flavor = "Vanilla";
		
        System.out.println("Candy - Name: " + candy.name);
		System.out.println("Weight: " + candy.weight+ " kg");
		System.out.println("Flavor: " + candy.flavor);

        // Medicine
        Medicine medicine = new Medicine();
        medicine.name = "Aspirin";
        medicine.usage = "Pain relief";
        medicine.dosage = 500.0;
		
		//update
		medicine.name = "Paracetamol";
        medicine.usage = "Fever Tablet";
        medicine.dosage = 600.0;
		
        System.out.println("Medicine - Name: " + medicine.name);
		System.out.println("Usage: " + medicine.usage);
		System.out.println("Dosage: " + medicine.dosage + " mg");

        // Food
        Food food = new Food();
        food.name = "Pizza";
        food.type = "Fast Food";
        food.calories = 300.0;
		
		//update
		food.name = "Burger";
        food.type = "Junk";
        food.calories = 200.0;
		
        System.out.println("Food - Name: " + food.name );
		System.out.println("Type: " + food.type);
		System.out.println("Calories: " + food.calories + " kcal");
    }
}
	}
}