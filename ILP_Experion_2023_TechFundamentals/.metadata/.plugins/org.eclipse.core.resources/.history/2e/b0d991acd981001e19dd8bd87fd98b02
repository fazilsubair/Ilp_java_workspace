package com.ilp.service;

import java.util.Scanner;

import com.ilp.entity.Account;

public class AccountService {

	public static Account createAccount() {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter opening balance to be deposited");
		double openningBalance = scanner.nextDouble();
//		account.setAccountBalance(openningBalance);
		Account account = new Account("ACC100","Savings Account" ,openningBalance);
//		account.setAccountNO();
//		account.setAccountName();
		
		

		return account;
	}

	public static void displayAccount(Account account) {
		// TODO Auto-generated method stub
		System.out.println("Account No \tAccountName \tAccountBalance");
		System.out.println(account.getAccountNO()+ "\t"+account.getAccountName()+"\t"+account.getAccountBalance());
	}

}
