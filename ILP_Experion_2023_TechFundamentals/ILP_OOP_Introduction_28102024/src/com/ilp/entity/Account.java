package com.ilp.entity;

public class Account {
	private String accountNumber;
	private String accountName;
	private double accountBalance;

	public String setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
		return accountNumber;
	}

	public String setAccountName(String accountName) {
		this.accountName = accountName;
		return accountName;

	}

	public double setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
		return accountBalance;
	}

	public String getAccountNumber() {
		return accountNumber;

	}

	public String getAccountName() {
		return accountName;

	}

	public double getAccountBalance() {
		return accountBalance;

	}

}
