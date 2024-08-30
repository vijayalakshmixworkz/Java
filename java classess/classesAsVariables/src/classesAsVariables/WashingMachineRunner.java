package classesAsVariables;



public class WashingMachineRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Abhishek abhishek = new Abhishek();
	abhishek.washingMachine();

	Lakshmi lakshmi = new Lakshmi();
	WashingMachine washingMachine = new WashingMachine("samsung", "nnnn", 150);
	lakshmi.wash(washingMachine);

	
	
	Bhumika bhumika = new Bhumika();
	washingMachine ref = bhumika.use();
	if (ref != null) {
		ref.show();
		ref.rinse();
}

	}
}
