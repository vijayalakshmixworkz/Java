package classesAsVariables;


//instance variable
public class Abhishek {
	//private WashingMachine washingMachine;
	//public Abhishek(WashingMachine washingMachine)
	//{
	//	this.washingMachine=washingMachine;
	//}
	//public void rinse()
	//{
	//	if(washingMachine!=null)
		//{
		//	washingMachine.rinse();
			//washingMachine.show();
		//}
		//else
		//{
		//	System.out.println("washingmachine is null");
		//}
	//}
//}


public void Abhishek()
{
	WashingMachine washingMachine=new WashingMachine("heir","cleans",100);
	washingMachine.rinse();
	washingMachine.show();
}

}

