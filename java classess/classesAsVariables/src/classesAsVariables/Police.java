package classesAsVariables;
//parameter
public class Police {
	public void use(Gun gun)
	{
		if(gun !=null)
		{
			gun.fire();
			gun.display();
		}else
		{
			System.out.println("gun is null");
		}
	}

}
