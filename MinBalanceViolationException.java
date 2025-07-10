package com.aurionpro.twentyfivejune.Accountsexceptions;

public class MinBalanceViolationException extends RuntimeException {


	 private double amount;
	 
	 public String getMinBalanceMessage() {
			return "your minimum balance criteria should be fulfilled";
		}

		public MinBalanceViolationException(double amount) {
			super();
			this.amount = amount;
		}

		public MinBalanceViolationException() {
			super();
			// TODO Auto-generated constructor stub
		}
	 
	
}
