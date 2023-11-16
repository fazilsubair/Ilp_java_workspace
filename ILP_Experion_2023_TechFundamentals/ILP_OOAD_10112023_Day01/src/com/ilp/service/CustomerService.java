package com.ilp.service;

import java.util.Scanner;

import com.ilp.entity.Customer;

public class CustomerService {

//		Customer customer = new Customer();

		public static Customer createCustomer() {
			Scanner scanner = new Scanner(System.in);
			System.out.println("enter the customer name ");
			String CustomerNameInput = scanner.nextLine() ;
//			customer.setCustomerName(CustomerNameInput);
//			System.out.println("create customer working");
			Customer customer = new Customer("cus100",CustomerNameInput);
//			customer.setCustomerCode();
			
			return customer;
		}

		public static void displayCustomer(Customer customer) {
			// TODO Auto-generated method stub
			
			
			System.out.println("Customer Code: /tCustomer Name");
			System.out.println(customer.getCustomerCode()+"\t"+customer.getCustomerName());
			
			
		}
	
}
