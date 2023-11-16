package com.ilp2023.basicprogramming;

import java.util.Scanner;

public class Service {

	Scanner scanner = new Scanner(System.in);

	Product addProduct() {
		Product product = new Product();
		System.out.println("Enter the product Name");
		product.productName = scanner.nextLine();

		System.out.println("Enter the product code");
		product.productCode = scanner.nextLine();

		System.out.println("Enter the product price");
		product.productPrice = scanner.nextDouble();

		System.out.println("Enter the product quantity");
		product.productQuantity = scanner.nextInt();
		System.out.println("\n-------------------------------------------");

		return product;

	}

	void showProduct(Product product) {
		if (product != null) {
			System.out.println("Product Code:" + product.productCode);
			System.out.println("Product Name:" + product.productName);
			System.out.println("Product Price:" + product.productPrice);
			System.out.println("Product Quantity:" + product.productQuantity);
			System.out.println("\n-------------------------------------------");
		} else {
			System.out.println("No product found!!");
		}

	}

	Product buyProduct(Product product) {
		System.out.println("Enter your age?");
		int age = scanner.nextInt();
		System.out.println("Enter the product quantity ");
		int userQuantiy = scanner.nextInt();

		if (age >= 60) {
			System.out.println("price for " + userQuantiy + " " + product.productName + " is "
					+ userQuantiy * product.productPrice * .9);
			product.productQuantity = (product.productQuantity - userQuantiy);

		} else {
			System.out.println("price for " + userQuantiy + " " + product.productName + " is "
					+ userQuantiy * product.productPrice);
			product.productQuantity = product.productQuantity - userQuantiy;
		}
//		System.out.println("\n-------------------------------------------");
		return product;
	}

}
