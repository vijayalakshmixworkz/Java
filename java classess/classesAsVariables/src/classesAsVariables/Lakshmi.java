package classesAsVariables;


//parameter
public class Lakshmi {
	public void wash(WashingMachine washingMachine)
	{
		if(washingMachine !=null)
		{
			washingMachine.rinse();
			washingMachine.show();
		}else
		{
			System.out.println("washingmachine is null");
		}
	}

}
