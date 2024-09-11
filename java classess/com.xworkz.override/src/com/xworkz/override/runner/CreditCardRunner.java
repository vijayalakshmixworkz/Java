package com.xworkz.override.runner;

import com.xworkz.override.things.CrediCard.CreditCard;

public class CreditCardRunner {
	 public static void main(String[] args) {
	        CreditCard card1 = new CreditCard("1234567890123456", "Rahul Sharma", "12/26", "HDFC", 500000, "Visa");
	        CreditCard card2 = new CreditCard("1234567890123456", "Rahul Sharma", "12/26", "HDFC", 700000, "Visa");

	        System.out.println(card1.equals(card2)); // true
	    }

}
