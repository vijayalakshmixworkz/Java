package classesAsVariables;

public class Gun {
	//Gun -->private name,countryMade,type, fire(),display();

	//Soldier:local var,Police: paramater,Dboss :instance variable,Godse: return-type

//	public class Gun 
//	{
		private String name;
		String countryMade;
		String type;
		
		public Gun(String name, String countryMade, String type) {
			this.name=name;
			this.countryMade=countryMade;
			this.type=type;
		}
		
		public Gun(String name, String countryMade) {
			// TODO Auto-generated constructor stub
			this.name=name;
			this.countryMade=countryMade;
		}

		public static void fire()
		{
		System.out.println("fire is running in Gun");	
		}
		
		public void display()
		{
			System.out.println("display is running in Gun");
			System.out.println("name : "+ name + " ");
		}

	}


