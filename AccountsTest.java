package com.aurionpro.twentyfivejuneTest;

import com.aurionpro.twentyfivejune.*;
import com.aurionpro.twentyfivejune.Accountsexceptions.*;

import java.util.Scanner;

import com.aurionpro.twentyfivejune.*;

public class AccountsTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		CurrentAccount currentaccount = new CurrentAccount(2110, "Kim Taeyung", 10000);
		SavingsAccount savingsaccount = new SavingsAccount(2120, "Kim Taeyung", 50000);
		
		try {
		int choice;
		do {
			System.out.println("\n===== Bank Menu =====");
			System.out.println("1. Display Current Account Details");
			System.out.println("2. Display Savings Account Details");
			System.out.println("3. Credit to Current Account");
			System.out.println("4. Debit from Current Account");
			System.out.println("5. Credit to Savings Account");
			System.out.println("6. Debit from Savings Account");
			System.out.println("0. Exit");
			System.out.print("Enter choice: ");
			choice = scanner.nextInt();

			switch (choice) {
			case 1:
				currentaccount.displayDetails();
				break;
			case 2:
				savingsaccount.displayDetails();
				break;
			case 3:
				System.out.print("Enter amount to credit: ");
				currentaccount.credit(scanner.nextDouble());
				break;
			case 4:
				System.out.print("Enter amount to debit: ");
				currentaccount.debit(scanner.nextDouble());
				break;
			case 5:
				System.out.print("Enter amount to credit: ");
				savingsaccount.credit(scanner.nextDouble());
				break;
			case 6:
				System.out.print("Enter amount to debit: ");
				savingsaccount.debit(scanner.nextDouble());
				break;
			case 0:
				System.out.println("Exit");
				break;
			default:
				System.out.println("Invalid choice. Try again.");
			}
		} while (choice != 0);
		}
		catch(NegativeAmountException e) {
			System.out.println(e.getMessage());
		}
		catch(OverdraftLimitReachException e) {
			System.out.println(e.getOverDraftMessage());
		}
		catch(MinBalanceViolationException e) {
			System.out.println(e.getMinBalanceMessage());
		}

	}

}
