package com.aurionpro.twentyfivejune;

import com.aurionpro.twentyfivejune.Accountsexceptions.NegativeAmountException;
import com.aurionpro.twentyfivejune.Accountsexceptions.OverdraftLimitReachException;

public class CurrentAccount extends Accounts {

	
	      private int OVERDRAFT_LIMIT = 50000;

	      public CurrentAccount(int accNo, String name, double balance) {
	          super(accNo, name, balance);
	      }


	      
		@Override
		public double debit(double amount){
			if (balance - amount >= -OVERDRAFT_LIMIT) {
	              balance -= amount;
	              System.out.println(" " + amount + " debited. New Balance: " + balance);
	          } else {
	        	  throw new OverdraftLimitReachException(amount);
	              //System.out.println("Debit denied. Overdraft limit exceeded.");
	          }
			return amount;
		}

		@Override
		public double credit(double amount) {
			if(amount<0) {
	    		throw new NegativeAmountException(amount);
	    	}
			balance += amount;
	        System.out.println(" " + amount + " credited. New Balance: " + balance);
			return amount;
		}
	  }