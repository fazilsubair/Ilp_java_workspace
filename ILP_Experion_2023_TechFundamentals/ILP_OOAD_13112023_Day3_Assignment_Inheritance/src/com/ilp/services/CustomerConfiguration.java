package com.ilp.services;

import java.util.ArrayList;
import java.util.Scanner;

import com.ilp.entity.Account;
import com.ilp.entity.Customer;
import com.ilp.entity.Product;
import com.ilp.entity.Services;

public class CustomerConfiguration {
	static Scanner scanner = new Scanner(System.in);

	public static Account createAccount(ArrayList<Product> product) {
		// TODO Auto-generateproductd method stub

		Account account = null;

		//
		System.out.print("Enter Your Account No: ");
		String accountNo = scanner.next();
		//
		System.out.print("Enter the Balance: ");
		String accountBalance = scanner.next();
		int i = 1;
		for (Product productl : product) {
			System.out.println(i + "." + productl.getProductCode() + "\t" + productl.getProductName());
			++i;
		}

		System.out.println("choose one product");
		int productChoice = scanner.nextInt();
		account = new Account(accountNo, accountBalance, product.get(productChoice - 1));

		// Product product = ProductConfiguration.createProduct(null);

		return account;
	}

	public static ArrayList<Customer> createCustomer(ArrayList<Product> product) {

		// Scanner scanner = new Scanner(System.in);
		//
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		ArrayList<Account> accountList = new ArrayList<Account>();
		// if (product == null) {
		//
		System.out.print("Enter the Customer Code: ");
		String customerCode = scanner.next();
		//
		System.out.print("Enter the Customer Name: ");
		String customerName = scanner.next();
		//
		char accountChoice;

		do {
			accountList.add(createAccount(product));
			System.out.println("press y to add more account");
			accountChoice = scanner.next().charAt(0);
		} while (accountChoice == 'y');
		//

		// product = new Customer(customerCode, customerName, accountList);
		// } else {
		// product.getAccountList().add(CustomerConfiguration.createAccount());
		// }
		// for (Account account : product.getAccountList()) {
		// System.out.println("\n" + account.getProduct().getProductName() + " created
		// for "
		// + product.getCustomerName() + " with the following Services ");
		// int i = 0;
		// for (Services services : account.getProduct().getServiceList()) {
		// System.out.println((++i) + " " + services.getServiceName());
		// }
		// }
		// System.out.println("\nAccount is active.!!!!!! ");
		// return product;
		customerList.add(new Customer(customerCode, customerName, accountList));
		return customerList;
	}

	public static void displayCustomer(ArrayList<Customer> customer) {

		System.out.println("*************************Customer-Account Details**************** ");
		System.out.println("CustomerId	 CustomerName		AccountType		  Balance ");
		for (Customer customeri : customer) {

			for (Account account : customeri.getAccountList()) {
				System.out.println(customeri.getCustomerCode() + "\t\t\t" + customeri.getCustomerName() + "\t"
						+ account.getAccountNo() + "\t" + account.getBalance() + "\t");
			}

		}
	}
	// for (Account account : customer.getAccountList()) {
	// System.out.println("\nServices for " +
	// account.getProduct().getProductName());
	// int i = 0;
	// for (Services services : account.getProduct().getServiceList())
	// System.out.println((++i) + " " + services.getServiceName());
	// System.out.println();
	// }
	// }

	public static void transactionBill(ArrayList<Customer> customerList) {

		// Scanner scanner = new Scanner(System.in);
		//
		// System.out.println("Enter the customer Id : ");
		// String customerCode = scanner.next();
		//
		// if (customerCode.equals(customer.getCustomerCode())) {
		// System.out.println(customer.getCustomerName() + " has the following accounts
		// ");
		// int i = 0;
		//
		// for (Account account : customer.getAccountList()) {
		// System.out.println((++i) + " " + account.getProduct().getProductName());
		// }
		//
		// System.out.print("\nEnter your choice : ");
		// int choice = scanner.nextInt();
		//
		// System.out.println("\nChoose the Service you want to use \n");
		//
		// System.out.println("Services available for "
		// + customer.getAccountList().get(choice - 1).getProduct().getProductName() +
		// ":");
		// for (Services service : customer.getAccountList().get(choice -
		// 1).getProduct().getServiceList()) {
		// System.out.println("- " + service.getServiceName());
		// }
		// System.out.println();
		//
		// System.out.println("\n Enter your choice");
		// choice = scanner.nextInt();
		// System.out.println("Enter the rate of transaction ");
		// int rateOfTransaction = scanner.nextInt();
		//
		// } else {
		// System.out.println("Please enter customer Id correctly...");
		// }
		//
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter customer code: ");
		String customerCode = scanner.nextLine();

		int indexs = 0;
		for (Customer customer : customerList) {
			if (customer.getCustomerCode().equals(customerCode)) {

				System.out.println(customer.getCustomerName() + "  has the following accounts ");

				int index = 0;

				for (Account account : customer.getAccountList()) {
					System.out.println((++index) + " " + account.getProduct().getProductName());
				}

				System.out.print("\nEnter your choice : ");
				int choice = scanner.nextInt();

				System.out.println("\nChoose the Service you want to use \n");

				System.out.println("Services available for "
						+ customer.getAccountList().get(choice - 1).getProduct().getProductName() + ":");

				for (Services serv : customer.getAccountList().get(choice - 1).getProduct().getServiceList()) {
					System.out.println(choice);
					System.out.println(serv.getServiceCode() + "\t" + serv.getServiceName() + "\t" + serv.getRate());
				}

				System.out.println();

				System.out.print("\nEnter your choice : ");
				int chooseSevice = scanner.nextInt();

				System.out.print("\nEnter the no. of  transaction: ");
				int noOfTransaction = scanner.nextInt();

				double n = (customer.getAccountList().get(choice - 1).getProduct().getServiceList()
						.get(chooseSevice - 1)
						.getRate());
				double total = noOfTransaction * (n);

				System.out.println("Total : " + total);
			}
			++indexs;
		}

	}

}
