package com.ilp.services;

import java.util.Scanner;

import com.ilp.entity.Services;

public class ServiceService {

	public static Services createService() {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		Services services =null;
		
		System.out.print("\n\nChoose the Services you want to add \r\n"
				+ "1.Internet Banking \r\n"
				+ "2.Cash Withdrawl \r\n"
				+ "3.Cash Deposit \r\n"
				+ "4.ATM Withdrawl \r\n"
				+ "5.Online Banking\r\n "
				+"Enter your choice : ");
		
		int choice = scanner.nextInt();
		switch(choice) {
		case 1:
			services = new Services("SR1", "Internet Banking", 32);
			break;
		case 2:
			services = new Services("SR1", "Cash Withdrawl", 32);
			break;
		case 3:
			services = new Services("SR1", "Cash Deposit ", 32);
			break;
		case 4:
			services = new Services("SR1", "ATM Withdrawl", 32);
			break;
		case 5:
			services = new Services("SR1", "Online Banking", 32);
			break;
		}
		
		return  services;
	}

}
