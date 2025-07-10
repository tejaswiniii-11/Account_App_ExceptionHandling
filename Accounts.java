package com.aurionpro.twentyfivejune;

import java.util.Scanner;

public abstract class Accounts {

	private int accNo;
    private String name;
    protected double balance;

    public Accounts(int accNo, String name, double balance) {
        this.accNo = accNo;
        this.name = name;
        this.balance = balance;
    }

    public void displayDetails() {
        System.out.println("Account Number: " + accNo);
        System.out.println("Name         : " + name);
        System.out.println("Balance      : " + balance);
    }
    
    public abstract double debit(double amount);
    public abstract double credit(double amount);
}
