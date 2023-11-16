package com.ilp.service;

import java.util.ArrayList;
import java.util.Scanner;

import com.ilp.entity.Account;

public class AccountService {

	public static Account createAccount() {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter account Code: ");
		String accountCode = scanner.nextLine();
		System.out.print("Enter account Name: ");
		String accountName = scanner.nextLine();
		System.out.print("Enter opening balance: ");
		double openingBalance = scanner.nextDouble();

		return new Account(accountCode, accountName, openingBalance);
	}

	public static void displayAllAccount(ArrayList<Account> accountList) {
		// TODO Auto-generated method stub
		System.out.println("Account No" + "       " + "Account Name" + "     " + "Account Balance");

		for (Account account : accountList) {

//			if(accno.compareTo(account.getAccountNo())==0) 
			System.out.println(
					account.getAccountNo() + "\t\t" + account.getAccountName() + "     " + account.getAccountBalace());
		}
	}
}
