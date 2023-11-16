package com.ilp.service;

import java.util.Scanner;

import com.ilp.entity.Account;
import com.ilp.entity.CurrentAccount;
import com.ilp.entity.SavingsAccount;

public class AccountService {
	static Scanner scanner = new Scanner(System.in);

	public static Account createAccount() {
		// TODO Auto-generated method stub
Account account = null;
		System.out.print("Enter account Code: ");
		String accountCode = scanner.nextLine();
		System.out.print("Enter account Name: ");
		String accountName = scanner.nextLine();
		System.out.print("Enter opening balance: ");
		double openingBalance = scanner.nextDouble();
		
		
		
		

		System.out.println("1. Savings Account 2. Current Account");

		int choice = scanner.nextInt();
		switch (choice) {
		case 1:

			account = createCurrentAccount(accountCode, accountName, openingBalance);
			break;
		case 2:
			account = createSavingsAccount(accountCode, accountName, openingBalance);
		}
		return account;
	}

	public static void displayAllAccount(Account account) {
		// TODO Auto-generated method stub
		System.out.println("Account No" + "       " + "Account Name" + "     " + "Account Balance");
		SavingsAccount savingsAccount = null;
		CurrentAccount currentAccount = null;
		if (account instanceof SavingsAccount) {
			savingsAccount = (SavingsAccount) account;
//			String roi = savingsAccount.getRoi();
			System.out.println("gg working");
			System.out.println(savingsAccount.getAccountNo() + "\t\t" + savingsAccount.getAccountName() + "     "
					+ savingsAccount.getAccountBalace() + "\t " + savingsAccount.getRoi());

		} else if (account instanceof CurrentAccount) {
			currentAccount = (CurrentAccount) account;
//			String gstNO = currentAccount.getGstNo();
			System.out.println("gg working");
			System.out.println(currentAccount.getAccountNo() + "\t\t" + currentAccount.getAccountName() + "     "
					+ currentAccount.getAccountBalace() + "\t " + currentAccount.getGstNo());

		}

	}

	public static CurrentAccount createCurrentAccount(String accountCode, String accountName, double openingBalance) {
		// TODO Auto-generated method stub
		System.out.println("enter roi number");
		scanner.next();

		String roi = scanner.nextLine();
		CurrentAccount account = new CurrentAccount(accountCode, accountName, openingBalance, roi);
		return account;

	}

	public static Account createSavingsAccount(String accountCode, String accountName, double openingBalance) {
		// TOD) {
		System.out.println("enter gst number");
		scanner.next();

		String gstNo = scanner.nextLine();
		Account account = new CurrentAccount(accountCode, accountName, openingBalance, gstNo);
		return account;
	}

	public static void depositMoney() {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("1.Over the counter \t2.cheqe depsoit \t3.DD depost");
		int choice = scanner.nextInt();
		if (choice==1) {
			DepositService.depositMoney(1000,"Slip100");
		}
		else if (choice==2) {
			DepositService.depositMoney("Slip100");
		}
		else if (choice==3) {
			DepositService.depositMoney("DD100","Technopark");
		}
		
		
		
	}

	

}
