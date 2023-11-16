package com.ilp.services;

import java.security.Provider.Service;
import java.util.ArrayList;
import java.util.Scanner;

import com.ilp.entity.Product;
import com.ilp.entity.Services;

public class ProductConfiguration {
	static ArrayList<Services> serviceList = new ArrayList<Services>();
	public static ArrayList<Services> createSevices() {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		Services services = null;
		
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
		Product product = null;

		ArrayList<Product> ProductList = new ArrayList<Product>();
		Scanner scanner = new Scanner(System.in);
		char yes;
		char productChoice ;
do {
	
	ArrayList<Services> addedServiceList = new ArrayList<Services>();
	System.out.println("enter product code");
	String productCode = scanner.nextLine();
	System.out.println("enter product Name");
	String productName = scanner.nextLine();
	
	Services services  = new Services ("pr1","default product",1);
	addedServiceList.add(services);
	
	do {
		for (Services service : serviceList) {
			System.out
					.println(service.getServiceCode() + "\t" + service.getServiceName() + "\t" + service.getRate());
		}

		System.out.println("choice the service");
		int serviceChoice = scanner.nextInt();
		addedServiceList.add(serviceList.get(serviceChoice - 1));
		System.out.println("***********************************");
		for(Services service:addedServiceList) {
			System.out.println(service.getServiceCode()+"\t"+service.getServiceName()+"\t"+service.getRate());
		}
		
		System.out.println("press y to add more");
		yes = scanner.next().charAt(0);
	} while (yes == 'y');
	ProductList.add(new Product(productCode,productName,addedServiceList));
	
	System.out.println("press y to add more product");
	productChoice = scanner.next().charAt(0);
} while (productChoice == 'y');
		

		return ProductList;
	}

}
