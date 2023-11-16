package com.ilp.entity;

public class Account {

	private String accountNO;
	private String accountName;
	private double accountBalance;

	public Account(String accountNO,String accountName,double accountBalance) {
		this.accountNO= accountNO;
		this.accountName = accountName;
		this.accountBalance= accountBalance;
		
		
	}

	public String getAccountNO() {
		return accountNO;
	}

	public void setAccountNO(String accountNO) {
		this.accountNO = accountNO;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

}
