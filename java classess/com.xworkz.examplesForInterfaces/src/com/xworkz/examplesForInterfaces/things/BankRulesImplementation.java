package com.xworkz.examplesForInterfaces.things;

public class BankRulesImplementation {
	
	public void minimumBalanceRule( ) {
		System.out.println(" minimum balance");
	}
   

    public void loanEligibilityRule( ) {
            System.out.println("You are eligible for a loan.");
    }

    public void interestRateRule( ) {
        System.out.println("The interest rate for your loan");
    }

    public void transactionLimitRule( ) {
            System.out.println("Your transaction exceeds the daily limit of ₹100,000.");
        
    }

    public void accountClosureRule( ) {
            System.out.println("Your account cannot be closed due to an outstanding loan.");
        
    }

    public void overdraftProtectionRule( ) {
            System.out.println("Overdraft protection is enabled on your account.");
        }
   

    
    public void kycRule( ) {
       
            System.out.println("Please complete KYC to continue using banking services.");
        
    }

    public void atmWithdrawalLimitRule( ) {
        
            System.out.println("Withdrawal successful.");
        
    }

    public void complaintHandlingRule( ) {
        System.out.println("Our customer service team will respond within 2 working days.");
    }

    
    public void fraudDetectionRule( ) {
        
            System.out.println("No suspicious activity detected.");
        
    }

    
    public void debitCardIssuanceRule( ) {
        
            System.out.println("Your account is inactive. Activate your account to request a debit card.");
        
    }

    
    public void onlineBankingActivationRule( ) {
        
            System.out.println("Please verify your account to activate online banking.");
        
    }

    
    public void foreignCurrencyExchangeRule(   ) {
        System.out.println("Exchanging at the current exchange rate.");
    }

    
    public void fixedDepositMaturityRule( ) {
        
            System.out.println("Your fixed deposit has not yet reached maturity.");
       
    }

    
    public void mortgageLoanRepaymentRule( ) {
        System.out.println("Your mortgage loan ");
    }

    public void display()
    {
    	System.out.println(" SBI bank");
    }
}
