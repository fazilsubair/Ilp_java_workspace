package com.ilp.services;

import java.util.ArrayList;
import java.util.Scanner;

import com.ilp.entity.CurrentAccount;
import com.ilp.entity.LoanAccount;
import com.ilp.entity.Product;
import com.ilp.entity.SavingsMaxAccount;
import com.ilp.entity.Services;

public class ProductConfiguration {
	public static ArrayList<Services> createSevices() {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		Services services = null;
		ArrayList<Services> serviceList = new ArrayList<Services>();
		char goBack;
		do {

			System.out.print("Enter the Service code : ");
			String serviceCode = scanner.next();
			System.out.print("Enter the Service Name : ");
			String serviceName = scanner.next();
			System.out.print("Enter the Service rate : ");
			double rate = scanner.nextDouble();

			services = new Services(serviceCode, serviceName, rate);

			System.out.println("Do you want to add more services : (y/n)");
			goBack = scanner.next().charAt(0);
			serviceList.add(services);
		} while (goBack == 'y');

		return serviceList;
	}

	public static ArrayList<Product> createProduct(ArrayList<Services> serviceList) {
		// TODO Auto-generated method stub
		// Product product = null;
		SavingsMaxAccount savingsMaxAccount = null;
		CurrentAccount currentAccount = null;
		LoanAccount loanAccount = null;
		// String Try = CurrentAccount;

		ArrayList<Product> ProductList = new ArrayList<Product>();
		Scanner scanner = new Scanner(System.in);
		char yes;
		char productChoice;
		int productNameChoice;
		do {

			ArrayList<Services> addedServiceList = new ArrayList<Services>();
			int indexForServices = 1;
			do {
				System.out.println(
						"Choose the product to be created \n1.Savings account \n2.current Account \n3.Loan Account");
				productNameChoice = scanner.nextInt();
				for (Services service : serviceList) {
					System.out.println(indexForServices + "." +
							service.getServiceCode() + "\t" + service.getServiceName() + "\t" + service.getRate());
					indexForServices++;
				}

				System.out.println("choice the service");
				int serviceChoice = scanner.nextInt();
				addedServiceList.add(serviceList.get(serviceChoice - 1));
				System.out.println("***********************************");
				int index = 1;
				for (Services service : addedServiceList) {
					System.out.println(index + "." +
							service.getServiceCode() + "\t" + service.getServiceName() + "\t" + service.getRate());
					++index;
				}

				System.out.println("press y to add more");
				yes = scanner.next().charAt(0);
			} while (yes == 'y');

			switch (productNameChoice) {
				case 1:
					ProductList.add(new SavingsMaxAccount("savings1", "Savings Max Account", addedServiceList));
					break;
				case 2:
					ProductList.add(new CurrentAccount("current1", "Current Account", addedServiceList));
					break;
				case 3:
					ProductList.add(new LoanAccount("loan1", "Current Account", addedServiceList));
					break;
			}
			System.out.println("press y to add more product");
			productChoice = scanner.next().charAt(0);
		} while (productChoice == 'y');

		return ProductList;
	}

}
