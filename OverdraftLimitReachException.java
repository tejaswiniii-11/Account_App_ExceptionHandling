package com.aurionpro.twentyfivejune.Accountsexceptions;

public class OverdraftLimitReachException extends RuntimeException{

	 private double amount;
	 
	 public String getOverDraftMessage() {
			return "The amount you entered has reached the overdraft limit";
		}

		public OverdraftLimitReachException(double amount) {
			super();
			this.amount = amount;
		}

		public OverdraftLimitReachException() {
			super();
			// TODO Auto-generated constructor stub
		}
	 
	 
}
