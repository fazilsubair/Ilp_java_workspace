package com.ilp.utility;

import java.util.ArrayList;
import java.util.Scanner;

import com.ilp.entity.Account;
import com.ilp.service.AccountService;
import com.ilp.service.DepositService;


public class AccountUtility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account account = null;
//		Account account = new Account();
		ArrayList<Account> accountList = new ArrayList<Account>();
		
		
		Scanner scanner = new Scanner(System.in);
		char goToMainMenu;
		do {
			System.out.println("1. Create Account 2. Display account 3.deposit money");
			int mainMenuChoice = scanner.nextInt();
			switch (mainMenuChoice) {
			case 1:
//				account = AccountService.createAccount();
//				accountList.add(account);
				
				account = AccountService.createAccount();
				break;
			case 2:
//				scanner.nextLine();
//				System.out.println("enter the accoutn no to be searched");
//				String accno = scanner.nextLine();
				AccountService.displayAllAccount(account);
				break;
				
			case 3:
//				scanner.nextLine();
//				System.out.println("enter the accoutn no to be searched");
//				String accno = scanner.nextLine();
				AccountService.depositMoney();
//				DepositService.depositMoney();
				break;
			}
			System.out.print("Go back to main menu (y/n) : ");
			goToMainMenu = scanner.next().charAt(0);

		} while (goToMainMenu == 'y');
	}

}
