package com.ilp.entity;

import java.util.ArrayList;

public class Account {
	private String accountNo;
	private double balance;
	private Product product;

	public Account(String accountNo, int balance, Product product) {
		this.accountNo = accountNo;
		this.balance = balance;
		this.product = product;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public void deposit(double Money) {
		// TODO Auto-generated method stub
		this.balance = this.balance + Money;
	}

	public void withdraw(int money) {
		// TODO Auto-generated method stub
		this.balance = this.balance - money;
	}

}
