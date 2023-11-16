package com.ilp.utility;

import java.util.Scanner;

import com.ilp.entity.Customer;

import com.ilp.services.CustomerService;

public class BankUtility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		Customer customer = null;
		char goToMainMenu;

		do {
			System.out.println("******Welcome To Bank************\r\n"
					+ "1.Create Accounts\r\n"
					+ "2.Display Accounts\r\n"
					+ "3.Transaction Bill\r\n"
					+ "4.Exit");
			System.out.print("Enter your choice : ");
			int mainMenuChoice = scanner.nextInt();
			switch (mainMenuChoice) {
			case 1:
				
				customer=CustomerService.createCustomer(customer);
				break;
			case 2:
				CustomerService.displayCustomer(customer);
				break;
			case 3:
				CustomerService.transactionBill(customer);
				break;
			case 4:
				System.out.println("Exit");
				break;
			}
			System.out.print("Go back to main menu (y/n) : ");
			goToMainMenu = scanner.next().charAt(0);
		} while (goToMainMenu == 'y');

	}
}
