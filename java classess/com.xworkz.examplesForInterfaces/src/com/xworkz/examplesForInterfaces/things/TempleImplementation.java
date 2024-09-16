package com.xworkz.examplesForInterfaces.things;

public class TempleImplementation implements IsconTemple {

	@Override
	public void removeFootwear() {
		System.out.println("Rule 1: Please remove your footwear before entering the temple premises.");
    }

	@Override
	public void followDressCode() {
		  System.out.println("Rule 2: A traditional or modest dress code is required inside the temple.");
    }
		


	@Override
	public void maintainSilence() {
		System.out.println("Rule 3: Maintain silence and avoid loud conversations inside the temple.");
    }
		
	

	@Override
	public void noPhotography() {
		System.out.println("Rule 4: Photography or videography is not allowed inside the temple.");
    }
		
	

	@Override
	public void followQueueSystem() {
		System.out.println("Rule 5: Follow the queue system while waiting for darshan (viewing the deity).");
    }
		

	@Override
	public void noLittering() {
		// TODO Auto-generated method stub
		 System.out.println("Rule 6: Do not litter in the temple or its surrounding areas.");
    }
		


	@Override
	public void noTouchingDeities() {
		 System.out.println("Rule 7: Do not touch the idols or deities, unless explicitly allowed.");
    }
		
	

	@Override
	public void respectSanctity() {
		 System.out.println("Rule 8: Respect the sanctity of the temple by behaving respectfully and modestly.");
    }
		
	

	@Override
	public void offerPrayers() {
		System.out.println("Rule 9: Offer prayers with humility and devotion.");
    }
		


	@Override
	public void noOutsideFood() {
		 System.out.println("Rule 10: Do not bring outside food or drinks into the temple.");
    }
		
	

	@Override
	public void Display() {
		System.out.println("TEMPLE RULES IN ISCON TEMPLE");		
	}
	

}
