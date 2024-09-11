package com.xworkz.override.things;

public class CrediCard {
	public class CreditCard {
	    private String cardNumber;
	    private String cardHolderName;
	    private String expiryDate;
	    private String bank;
	    private double creditLimit;
	    private String cardType;

	    public CreditCard(String cardNumber, String cardHolderName, String expiryDate, String bank, double creditLimit, String cardType) {
	        this.cardNumber = cardNumber;
	        this.cardHolderName = cardHolderName;
	        this.expiryDate = expiryDate;
	        this.bank = bank;
	        this.creditLimit = creditLimit;
	        this.cardType = cardType;
	    }

	    @Override
	    public String toString() {
	        return "CreditCard{" +
	                "cardNumber='" + cardNumber + '\'' +
	                ", cardHolderName='" + cardHolderName + '\'' +
	                ", expiryDate='" + expiryDate + '\'' +
	                ", bank='" + bank + '\'' +
	                ", creditLimit=" + creditLimit +
	                ", cardType='" + cardType + '\'' +
	                '}';
	    }

	    @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (o == null || getClass() != o.getClass()) return false;
	        CreditCard card = (CreditCard) o;
	        return cardNumber.equals(card.cardNumber) && expiryDate.equals(card.expiryDate) && bank.equals(card.bank);
	    }

	   
	}


}
