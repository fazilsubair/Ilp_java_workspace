package com.ilp.basicprogramming_assignment;

import java.util.Scanner;

public class Q14FrequencyOfElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter limit for array");
		int limit  = scanner.nextInt();
		System.out.println("Enter element in an array");
		
		int arrayFrequecny[] = new int[limit];

		for (int i = 0; i < limit; i++) {
			arrayFrequecny[i] = scanner.nextInt();
		}

		

		System.out.println("Enter a number ");
		int choice = scanner.nextInt();
		int count = 0;

		for (int i = 0; i < limit; i++) {
			if (choice == arrayFrequecny[i]) {
				count++;
			}
		}
		System.out.println(count);




}

}
