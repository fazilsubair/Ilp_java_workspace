package com.ilp.service;

import java.util.ArrayList;
import java.util.Scanner;

import com.ilp.entity.Account;
import com.ilp.entity.Customer;

public class CustomerService {

	public static Customer createCustomer(ArrayList<Account> accountList) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter Code of the customer: ");
		String customerCode = scanner.next();
		System.out.print("Enter name of the customer: ");
		String customerName = scanner.next();
		Customer customer = new Customer(customerCode, customerName, accountList);

		return customer;
	}

	public static void displayCustomer(Customer customer) {
		// TODO Auto-generated method stub
		System.out.println("Customer Code" + "\t" + "Customer Name");
		System.out.println(customer.getCustomerCode() + "\t\t" + customer.getCustomerName());
		for (Account account : customer.getAccountList()) {
			System.out.println(account.getAccountBalace() + "\t\t" + account.getAccountName());
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
