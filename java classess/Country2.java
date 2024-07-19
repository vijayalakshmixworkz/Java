//Declare country class with Below methods

//1. Method to take states: String[] : 29
//2. Methos to take pincode: int[]: 10
//3. Method to take primeminister:String[]: All
//4. Method to take Cabinet ministers:String[]: 30
//5. Method to take political parties:String[]: 5


//Declare country class with Below methods

//1. Method to take states: String[] : 29
//2. Methos to take pincode: int[]: 10
//3. Method to take primeminister:String[]: All
//4. Method to take Cabinetministers:String[]: 30
//5. Method to take political parties:String[]: 5


//Above methods print in backward direction

//Write a class with main method and pass below info

//3. Main to take information of a palace: name,location,builtBy,buildYear

class Country2
{
public static void states()
{
String[] states={
            "Andhra Pradesh", "Arunachal Pradesh", "Assam", "Bihar", "Chhattisgarh", 
            "Goa", "Gujarat", "Haryana", "Himachal Pradesh", "Jharkhand", 
            "Karnataka", "Kerala", "Madhya Pradesh", "Maharashtra", "Manipur", 
            "Meghalaya", "Mizoram", "Nagaland", "Odisha", "Punjab", 
            "Rajasthan", "Sikkim", "Tamil Nadu", "Telangana", "Tripura", 
            "Uttar Pradesh", "Uttarakhand", "West Bengal"
        };
				System.out.println(" STATES OF INDIA:");

		for(int state=states.length-1;state>0;state--)
		{
		String indianStates=states[state];
		System.out.println(" "+indianStates);

		}
}
public static void pincode()
{
int[] pinCodes = {
            110001, 110002, 110003, 110004, 110005, 
            400001, 400002, 400003, 400004, 400005,
            600001, 600002, 600003, 600004, 600005,
            700001, 700002, 700003, 700004, 700005
        };
						System.out.println("PINCODES OF INDIAN STATES:");

		for(int pin=pinCodes.length-1;pin>0;pin--)
		{
		int indianpincodes=pinCodes[pin];
		System.out.println(" "+indianpincodes);

		}
}
public static void primeMinister()
{
String[] primeMinisters = {
            "Jawaharlal Nehru", "Lal Bahadur Shastri", "Indira Gandhi", 
            "Morarji Desai", "Charan Singh", "Rajiv Gandhi", 
            "Vishwanath Pratap Singh", "Chandra Shekhar", "P. V. Narasimha Rao", 
            "Atal Bihari Vajpayee", "H. D. Deve Gowda", "Inder Kumar Gujral", 
            "Manmohan Singh", "Narendra Modi"
        };
						System.out.println("PRIME MINISTERS OF INDIA:");

		for(int minister=primeMinisters.length-1;minister>0;minister--)
		{
		String indianPrimeMinisters=primeMinisters[minister];
		System.out.println(" "+indianPrimeMinisters);

		}
}
public static void cabinetMinisters()
{
String[] cabinetMinisters = {
            "Narendra Modi - Prime Minister",
            "Amit Shah - Minister of Home Affairs",
            "Rajnath Singh - Minister of Defence",
            "Nirmala Sitharaman - Minister of Finance and Corporate Affairs",
            "Subrahmanyam Jaishankar - Minister of External Affairs",
            "Nitin Gadkari - Minister of Road Transport and Highways",
            "Smriti Irani - Minister of Women and Child Development",
            "Prakash Javadekar - Minister of Environment, Forest and Climate Change",
            "Piyush Goyal - Minister of Commerce and Industry, Consumer Affairs, Food and Public Distribution, and Textiles",
            "Dharmendra Pradhan - Minister of Education and Skill Development and Entrepreneurship",
            "Hardeep Singh Puri - Minister of Petroleum and Natural Gas, and Housing and Urban Affairs",
            "Mansukh Mandaviya - Minister of Health and Family Welfare, and Chemicals and Fertilizers"
        };
								System.out.println("CABINET MINISTERS OF INDIA:");

		 for(int cminister=cabinetMinisters.length-1;cminister>0;cminister--)
		{
		String indianCabinetMinisters=cabinetMinisters[cminister];
		System.out.println(" "+indianCabinetMinisters);

		}
}
public static void politicalParties()
{
String[] politicalParties = {
            "Bharatiya Janata Party (BJP)",
            "Indian National Congress (INC)",
            "Aam Aadmi Party (AAP)",
            "Communist Party of India (Marxist) (CPI(M))",
            "Trinamool Congress (TMC)"
        };
								System.out.println("POLITICAL PARTIES:");


      for(int parties=politicalParties.length-1;parties>0;parties--)
		{
		String pParties=politicalParties[parties];
		System.out.println(" "+pParties);

		}
}

}