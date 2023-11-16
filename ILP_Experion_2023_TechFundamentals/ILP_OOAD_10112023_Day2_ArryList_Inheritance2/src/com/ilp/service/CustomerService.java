package com.ilp.service;

import java.util.ArrayList;
import java.util.Scanner;

import com.ilp.entity.Account;
import com.ilp.entity.Customer;

public class CustomerService {

	public static Customer createCustomer() {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

//		 accountList.add(AccountService.createAccount());

		Account account = null;
		ArrayList<Account> localAccountList = new ArrayList<Account>();
		System.out.print("Enter Code of the customer: ");
		String customerCode = scanner.next();
		System.out.print("Enter name of the customer: ");
		String customerName = scanner.next();
		System.out.println("Add account details");
		localAccountList.add(AccountService.createAccount());

		System.out.println("Do you want to add more account");
		char choice = scanner.next().charAt(0);

		while ('y' == choice) {
			System.out.println("Add account details");
			localAccountList.add(AccountService.createAccount());
			System.out.println("Do you want to add more account");
			choice = scanner.next().charAt(0);

		}
		Customer customer = new Customer(customerCode, customerName, localAccountList);
		return customer;
	}

	public static void displayCustomer(ArrayList<Customer> customerList) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the customer code to be searched");
		String searchCode  = scanner.nextLine();
		for (Customer customer : customerList) {
			
			if(searchCode.compareTo(customer.getCustomerCode())==0) {
				System.out.println("customercode \tcustomername");
				System.out.println(customer.getCustomerCode() + "\t" + customer.getCustomerName());
				for (Account account : customer.getAccountList()) {
					System.out.println(account.getAccountNo() + "\t" + account.getAccountName() + "\t"
							+ account.getAccountBalace() + "\t");
				}
			}
		}

	}

	public static void displayAllCustomer(ArrayList<Customer> customerList, String cusno) {
		// TODO Auto-generated method stub

		System.out.println("Customer Code" + "\t" + "Customer Name");
		for (Customer customer : customerList) {
//			if(cusno.compareTo(customer.getCustomerCode())==0) {
			System.out.println(customer.getCustomerCode() + "\t\t" + customer.getCustomerName());
		}
	}

}
