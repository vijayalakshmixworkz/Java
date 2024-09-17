package com.xworkz.examplesForInterfaces.runner;

import com.xworkz.examplesForInterfaces.things.BankRulesImplementation;

import com.xworkz.examplesForInterfaces.things.SBIBank;
public class BankRulesRunner {
	 public static void main(String[] args) {
	       SBIBank myBank = new BankRulesImplementation();

	        myBank.minimumBalanceRule();
	        myBank.loanEligibilityRule();
	        myBank.interestRateRule();
	        myBank.transactionLimitRule();
	        myBank.accountClosureRule();
	        myBank.overdraftProtectionRule();
	        myBank.kycRule();
	        myBank.atmWithdrawalLimitRule();
	        myBank.complaintHandlingRule();
	        myBank.fraudDetectionRule();
	        myBank.debitCardIssuanceRule();
	        myBank.onlineBankingActivationRule();
	        myBank.foreignCurrencyExchangeRule();
	        myBank.fixedDepositMaturityRule();
	        myBank.mortgageLoanRepaymentRule();
	    }
	}

