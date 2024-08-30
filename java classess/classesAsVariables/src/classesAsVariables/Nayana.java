package classesAsVariables;

//local variable
public class Nayana {
	WashingMachine washingMachine;

	public void have() {

		if (washingMachine != null) {
			washingMachine.rinse();
			washingMachine.show();
			System.out.println(washingMachine.brand);
		} else {

			System.out.println("null pointer exception");
		}

	}

}
