package com.ilp.utility;

import java.security.Provider.Service;
import java.util.Scanner;

import com.ilp.entity.Product;
import com.ilp.service.ProductService;
import com.ilp.service.ServiceService;

public class ProductUtility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product product = null;
		com.ilp.entity.Service service = null;
		Scanner scanner = new Scanner(System.in);

		while(true) {
			System.out.println("1.create product 2. Display Product 3.Create Service 4.Display Service");

			int choice = scanner.nextInt();
			switch (choice) {
			case 1: {
				product = ProductService.createProduct();

				break;
			}
			case 2: {
				ProductService.displayProduct(product);

				break;
			}
			case 3: {
				service = ServiceService.createService();

				break;
			}
			case 4: {
				ServiceService.displayService(service);

				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + choice);
			}
		}
		}

}
