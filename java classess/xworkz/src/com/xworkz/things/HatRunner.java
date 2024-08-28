package com.xworkz.things;

public class HatRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Upendra upendra=new Upendra();
		upendra.wear();
		
		Yash yash=new Yash();
		Hat hat= new Hat();
		yash.tear(hat);
		
		Puneeth puneeth=new Puneeth();
		puneeth.hat=new Hat();
		
				puneeth.fold();

	}

}
