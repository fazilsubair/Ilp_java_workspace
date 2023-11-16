package com.ilp.services;

import java.util.ArrayList;
import java.util.Scanner;

import com.ilp.entity.Account;
import com.ilp.entity.Customer;
import com.ilp.entity.Services;

public class CustomerService {

	public static Customer createCustomer(Customer customer) {

		Scanner scanner = new Scanner(System.in);

		if (customer == null) {

			System.out.print("Enter the Customer Code: ");
			String customerCode = scanner.next();

			System.out.print("Enter the Customer Name: ");
			String customerName = scanner.next();

			ArrayList<Account> accountList = new ArrayList<Account>();
			accountList.add(AccountService.createAccount());

			customer = new Customer(customerCode, customerName, accountList);
		} else {
			customer.getAccountList().add(AccountService.createAccount());
		}
		for (Account account : customer.getAccountList()) {
			System.out.println("\n" + account.getProduct().getProductName() + " created for "
					+ customer.getCustomerName() + " with the following Services ");
			int i = 0;
			for (Services services : account.getProduct().getServiceList()) {
				System.out.println((++i) + " " + services.getServiceName());
			}
		}
		System.out.println("\nAccount is active.!!!!!! ");
		return customer;
	}

	public static void displayCustomer(Customer customer) {

		System.out.println("*************************Customer-Account Details**************** ");
		System.out.println("CustomerId	 CustomerName		AccountType		  Balance ");
		for (Account account : customer.getAccountList()) {
			System.out.println(customer.getCustomerCode() + "\t\t\t" + customer.getCustomerName() + "\t\t"
					+ account.getProduct().getProductName() + "\t" + account.getBalance());

		}
		for (Account account : customer.getAccountList()) {
			System.out.println("\nServices for " + account.getProduct().getProductName());
			int i = 0;
			for (Services services : account.getProduct().getServiceList())
				System.out.println((++i) + " " + services.getServiceName());
			System.out.println();
		}
	}

	public static void transactionBill(Customer customer) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the customer Id : ");
		String customerCode = scanner.next();

		if (customerCode.equals(customer.getCustomerCode())) {
			System.out.println(customer.getCustomerName() + "  has the following accounts ");
			int i = 0;

			for (Account account : customer.getAccountList()) {
				System.out.println((++i) + " " + account.getProduct().getProductName());
			}

			System.out.print("\nEnter your choice : ");
			int choice = scanner.nextInt();

			System.out.println("\nChoose the Service you want to use \n");

			System.out.println("Services available for "
					+ customer.getAccountList().get(choice - 1).getProduct().getProductName() + ":");
			for (Services service : customer.getAccountList().get(choice - 1).getProduct().getServiceList()) {
				System.out.println("- " + service.getServiceName());
			}
			System.out.println();

		} else {
			System.out.println("Please enter customer Id correctly...");
		}

	}

}
