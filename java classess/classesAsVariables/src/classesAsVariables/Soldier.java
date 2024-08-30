package classesAsVariables;
// local variable
public class Soldier {
	Gun gun;
	public void use()
	{
		if(gun!=null) {
			Gun.fire();
			Gun.display();
		}else {
			System.out.println("null pointer exception");
		}
	}

}
	
	
	
