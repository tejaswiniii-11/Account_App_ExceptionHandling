package com.aurionpro.twentyfivejune;

import com.aurionpro.twentyfivejune.Accountsexceptions.MinBalanceViolationException;
import com.aurionpro.twentyfivejune.Accountsexceptions.NegativeAmountException;

public class SavingsAccount extends Accounts {

	private double MIN_BALANCE = 10000;

    public SavingsAccount(int accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    public double credit(double amount) {
    	if(amount<0) {
    		throw new NegativeAmountException(amount);
    	}
        balance += amount;
        System.out.println(" " + amount + " credited. New Balance: " + balance);
        return amount;
    }

    public double debit(double amount) {
    	if(amount<0) {
    		throw new NegativeAmountException(amount);
    	}
        if (balance - amount >= MIN_BALANCE) {
            balance -= amount;
            System.out.println(" " + amount + " debited. New Balance:  " + balance);
        } else {
        	throw new MinBalanceViolationException(amount);
            //System.out.println("Debit denied. Minimum balance did not met.");
        }
        return amount;
    }
}
