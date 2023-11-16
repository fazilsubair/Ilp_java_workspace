package com.ilp2023.basicprogramming;

import java.util.Scanner;

public class ProductMain {

	public static void main(String[] args) {

		Service service = new Service();
		Product product = null;
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println(
					"\n-------------------------------------------\nenter your choice\n 1.Add Product\n 2.Show Product\n 3.Buy\n 4.Exit\n-------------------------------------------");
			int choice = scanner.nextInt();
			if (choice == 1) {

				product = service.addProduct();
			}

			else if (choice == 2) {
				service.showProduct(product);
			}

			else if (choice == 3) {
				product = service.buyProduct(product);
			}

			else if (choice == 4) {
				System.out.println("Program Exited !!!!");
				break;
			} else {
				System.out.println("Invalid Choice !!!");
			}

		}

	}

}
