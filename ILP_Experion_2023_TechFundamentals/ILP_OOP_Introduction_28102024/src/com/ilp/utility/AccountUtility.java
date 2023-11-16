package com.ilp.utility;

import com.ilp.entity.Account;

public class AccountUtility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account account = new Account();

		account.setAccountNumber("ACC100");
		account.setAccountName("Saving Account");
		account.setAccountBalance(10000.00);
		
		System.out.println("Account_Number\t"+"Account_Name\t"+"Account_Balance");
		System.out.println(account.getAccountNumber()+"\t\t"+account.getAccountName()+"\t"+account.getAccountBalance());
//		account.accountName = "Saving Account";
//		account.accountBalance = 10000.00;
		

	}

}
