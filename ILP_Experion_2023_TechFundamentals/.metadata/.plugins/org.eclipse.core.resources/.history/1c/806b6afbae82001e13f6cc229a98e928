package com.ilp.utility;
 
import java.util.ArrayList;
import java.util.Scanner;

import com.ilp.entity.Account;
import com.ilp.entity.Customer;
import com.ilp.service.CustomerService;
 
public class BankUtility  {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		ArrayList <Account> accountList = new ArrayList<Account>();
		ArrayList <Customer> customerList = new ArrayList<Customer>();
		Customer customer = null;
		Scanner scanner = new Scanner(System.in);
		char goToMainMenu;
		do {
			System.out.println(" 3.Create Customer 4. Display Customer 5.Display all customers");
			int mainMenuChoice = scanner.nextInt();
			switch (mainMenuChoice) {
//			case 1:
//				accountList.add(AccountService.createAccount());
//				break;
//			case 2:
//				AccountService.displayAccount(accountList);
//				break;
			case 3:
				customerList.add(CustomerService.createCustomer());
				break;
			case 5:
				CustomerService.displayAllCustomer(customerList);
				break;
			case 4:
				
				CustomerService.displayCustomer(customerList);
				break;
			}
			System.out.println("Go back to main menu (y/n)");
			goToMainMenu = scanner.next().charAt(0);
		}while(goToMainMenu == 'y');
	}
 
}