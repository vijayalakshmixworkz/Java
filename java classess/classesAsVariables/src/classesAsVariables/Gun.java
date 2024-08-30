package classesAsVariables;

public class Gun {
	//Gun -->private name,countryMade,type, fire(),display();

	//Soldier:local var,Police: paramater,Dboss :instance variable,Godse: return-type

	public class Gun 
	{
		private String name;
		String countryMade;
		String type;
		
		public void fire()
		{
		System.out.println("fire is running in Gun");	
		}
		
		public void display()
		{
			System.out.println("display is running in Gun");
		}

	}

}
