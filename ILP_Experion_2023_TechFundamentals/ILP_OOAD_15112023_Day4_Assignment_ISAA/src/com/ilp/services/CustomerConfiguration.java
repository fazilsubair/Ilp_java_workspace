package com.ilp.services;

import java.util.ArrayList;
import java.util.Scanner;

import com.ilp.entity.Account;
import com.ilp.entity.Customer;
import com.ilp.entity.LoanAccount;
import com.ilp.entity.Product;
import com.ilp.entity.SavingsMaxAccount;
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
		int accountBalance = scanner.nextInt();
		int i = 1;
		for (Product productl : product) {
			System.out.println(i + "." + productl.getProductName());
			++i;
		}

		System.out.println("choose one product");
		int productChoice = scanner.nextInt();

		if (product.get(productChoice - 1) instanceof SavingsMaxAccount) {

			if (SavingsMaxAccount.minimumBalance(accountBalance)) {

				account = new Account(accountNo, accountBalance, product.get(productChoice - 1));
			} else {
				do {
					System.out.print("re-enter the Balance: ");
					accountBalance = scanner.nextInt();
				} while (!SavingsMaxAccount.minimumBalance(accountBalance));

				account = new Account(accountNo, accountBalance, product.get(productChoice - 1));

			}

		} else {
			account = new Account(accountNo, accountBalance, product.get(productChoice - 1));
		}

		// Product product = ProductConfiguration.createProduct(null);

		return account;
	}

	static ArrayList<Customer> customerList = new ArrayList<Customer>();

	public static ArrayList<Customer> createCustomer(ArrayList<Product> product) {

		ArrayList<Account> accountList = new ArrayList<Account>();

		System.out.print("Enter the Customer Code: ");
		String customerCode = scanner.next();
		System.out.print("Enter the Customer Name: ");
		String customerName = scanner.next();

		char accountChoice;

		do {
			accountList.add(createAccount(product));
			System.out.println("press y to add more account");
			accountChoice = scanner.next().charAt(0);
		} while (accountChoice == 'y');

		customerList.add(new Customer(customerCode, customerName, accountList));
		return customerList;
	}

	public static void displayCustomer(ArrayList<Customer> customer) {

		System.out.println("*************************Customer-Account Details**************** ");
		System.out.println("CustomerId\t\tCustomerName\t\tAccountType\t\tBalance ");
		for (Customer customeri : customer) {

			for (Account account : customeri.getAccountList()) {
				System.out.println(customeri.getCustomerCode() + "\t\t" + customeri.getCustomerName() + "\t\t"
						+ account.getProduct().getProductName() + "\t\t" + account.getBalance());
			}

		}
	}

	public static void transactionBill(ArrayList<Customer> customerList) {

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

				double n = (customer.getAccountList().get(choice - 1).getProduct().getServiceList().get(chooseSevice)
						.getRate());
				double total = noOfTransaction * (n);

				System.out.println("Total : " + total);
			}
			++indexs;
		}

	}

	public static void manageAccount(ArrayList<Customer> customer) {
		// TODO Auto-generated method stub
		int index = 1;
		System.out.println("enter the customer id to be searched");
		// scanner.next();
		String customerIdInput = scanner.next();

		for (Customer customerIndex : customer) {
			if (customerIdInput.compareToIgnoreCase(customerIndex.getCustomerCode()) == 0) {

				System.out.println(customerIndex.getCustomerName() + " has the following accounts");

				for (Account accountIndex : customerIndex.getAccountList()) {

					System.out.println(index + "." + accountIndex.getProduct().getProductName());
				}

				System.out.println("enter your choice");
				int accountchoice = scanner.nextInt();
				char yesForDeposit;
				do {
					System.out.println("1.Deposit \n2.Withdraw Money \n3.Display Balance");
					System.out.println("choose option : ");
					int chooseManageOption = scanner.nextInt();
					int Money;
					switch (chooseManageOption) {
						case 1: {
							System.out.println("enter the money to be depositer:");
							Money = scanner.nextInt();
							if (Money > 0) {
								if (customerIndex.getAccountList().get(accountchoice - 1)
										.getProduct() instanceof LoanAccount) {
									customerIndex.getAccountList().get(accountchoice - 1).deposit(Money * 0.97);

								} else {

									customerIndex.getAccountList().get(accountchoice - 1).deposit(Money);
								}

							}
							break;
						}
						case 2: {
							System.out.println("enter the money to be Withdrawed:");
							Money = scanner.nextInt();

							if (customerIndex.getAccountList().get(accountchoice - 1)
									.getProduct() instanceof SavingsMaxAccount) {
								if (SavingsMaxAccount.minimumBalance(
										customerIndex.getAccountList().get(accountchoice - 1).getBalance() - Money)) {

									customerIndex.getAccountList().get(accountchoice - 1).withdraw(Money);
								} else {
									customerIndex.getAccountList().get(accountchoice - 1).withdraw(Money);
								}
								;
							}
							break;
						}
						case 3: {

							System.out.println("*************************Customer-Account Details****************");
							System.out.println("CustomerId \tCustomerName \tAccountType \tBalance ");
							for (Account account : customerIndex.getAccountList()) {

								System.out.println(customerIndex.getCustomerCode() + " \t"
										+ customerIndex.getCustomerName() + " \t"
										+ account.getProduct().getProductName() + "\t" + account.getBalance());
							}

							break;
						}

					}
					System.out.println("press y to do more transactions");
					yesForDeposit = scanner.next().charAt(0);
				} while (yesForDeposit == 'y');
			}

		}
	}

}
