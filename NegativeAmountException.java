package com.aurionpro.twentyfivejune.Accountsexceptions;

public class NegativeAmountException extends RuntimeException {

	private double amount;
	
	public String getMessage() {
		return "The amount you entered is incorrect";
	}

	public NegativeAmountException(double amount) {
		super();
		this.amount = amount;
	}

	public NegativeAmountException() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
