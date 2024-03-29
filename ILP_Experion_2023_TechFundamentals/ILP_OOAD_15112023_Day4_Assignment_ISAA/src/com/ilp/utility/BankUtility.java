package com.ilp.utility;
 
import java.util.ArrayList;
import java.util.Scanner;
 
import com.ilp.entity.Customer;
import com.ilp.entity.Product;
import com.ilp.entity.Services;
import com.ilp.services.CustomerConfiguration;
import com.ilp.services.ProductConfiguration;
 
public class BankUtility {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Scanner scanner = new Scanner(System.in);
		ArrayList<Customer> customer = null;
		ArrayList<Services> serviceList = new ArrayList<Services>();
		ArrayList<Product> product = null;
		char goToMainMenu;
 
		do {
			System.out.println("******Welcome To Bank************\r\n"
					+ "1.Create Services\r\n"
					+ "2.Create Products\r\n"
					+ "3.Create Accounts\r\n"
					+ "4.Display Accounts\r\n"
					+ "5.Transaction Bill\r\n"
					+ "6.Exit\r\n"
					+ "7.Manage Account\r\n");
			
			System.out.print("Enter your choice : ");
			int mainMenuChoice = scanner.nextInt();
			switch (mainMenuChoice) {
			case 1:
				serviceList=ProductConfiguration.createSevices();
				break;
			case 2:
				product=ProductConfiguration.createProduct(serviceList);
				break;
			case 3:
				customer=CustomerConfiguration.createCustomer(product);
				break;
			case 4:
				CustomerConfiguration.displayCustomer(customer);
				break;
			case 5:
				CustomerConfiguration.transactionBill(customer);
				break;
			case 6:
				System.out.println("Exit");
				break;
			case 7:
				CustomerConfiguration.manageAccount(customer);
				break;
			}
			System.out.print("Go back to main menu (y/n) : ");
			goToMainMenu = scanner.next().charAt(0);
		} while (goToMainMenu == 'y');
 
	}
}