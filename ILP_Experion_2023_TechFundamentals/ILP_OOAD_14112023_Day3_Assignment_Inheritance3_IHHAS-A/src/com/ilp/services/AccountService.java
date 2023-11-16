package com.ilp.services;

import java.util.ArrayList;
import java.util.Scanner;

import com.ilp.entity.Account;
import com.ilp.entity.Product;

public class AccountService {

	public static Account createAccount() {
		// TODO Auto-generateproductd method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter Your Account No: ");
		String accountNo = scanner.next();
		
		System.out.print("Enter the Balance: ");
		String accountBalance = scanner.next();
		
		
		Product product = ProductService.createProduct();
		
		return new Account(accountNo, accountBalance,product);
	}

}
