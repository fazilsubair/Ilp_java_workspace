package com.ilp.service;
 
import java.util.ArrayList;
import java.util.Scanner;

import com.ilp.entity.Account;
import com.ilp.entity.Customer;
//import com.ilp.service.AccountService;

 
public class CustomerService {
 
	public static Customer createCustomer() {
		// TODO Auto-generated method stub
		ArrayList <Account> accountList = new ArrayList <Account>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter name");
		String customerName = scanner.nextLine();
		System.out.println("Enter customer code");
		String customerCode = scanner.nextLine();
		char addaccount;
		Account account =new Account("0","0",0) ;
		do {
			account = AccountService.createAccount();
			accountList.add(account);
			System.out.println("Add more account (y/n)");
			addaccount = scanner.next().charAt(0);
		}while(addaccount == 'y');
		Customer customer = new Customer(customerCode,customerName, accountList);
 		return customer;
	}
 
	public static void displayCustomer(ArrayList <Customer> customerList) {
		// TODO Auto-generated method stub
//		System.out.print("displayCUstomer ");
		System.out.println("Enter customer code:");
		Scanner scanner = new Scanner(System.in);
		String customerSearchCode = scanner.nextLine();
		for(Customer customer: customerList)
		{	if(customer.getCustomerCode().equalsIgnoreCase(customerSearchCode))
			{ 	System.out.println("Customer Code"+"    "+"Customer Name"+"  " );
				System.out.println(customer.getCustomerCode()+"      "+customer.getCustomerName() + "    "   );
				for(Account account:customer.getAccountList())
					System.out.println(account.getAccountBalance()+ "  " + account.getAccountNo());
			}
		}
	}
	public static void displayAllCustomer(ArrayList <Customer> customerList) {
		// TODO Auto-generated method stub
		for(Customer customer:customerList)
		{   System.out.println("Customer Code"+"    "+"Customer Name"+"  ");
			System.out.println(customer.getCustomerCode()+"      "+customer.getCustomerName() + "    "   );
			AccountService.displayAccount(customer.getAccountList());
				
	     }
	}
}
