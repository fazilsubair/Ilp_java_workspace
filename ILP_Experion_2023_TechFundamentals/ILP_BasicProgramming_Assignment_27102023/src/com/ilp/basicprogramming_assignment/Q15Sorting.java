package com.ilp.basicprogramming_assignment;

import java.util.Scanner;

public class Q15Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter limit for array");
		int limit  = scanner.nextInt();
		System.out.println("Enter element in an array");
		
		int userArray[] = new int[limit];

		for (int i = 0; i < limit; i++) {
			userArray[i] = scanner.nextInt();
		}
		System.out.println("Ascending sorted");
		ascending(userArray,limit);
		System.out.println("Descending sorted");

		descending(userArray,limit);
		
		

	}
	static void descending (int[] sortedNumberList,int limit) {
		for (int i = 0; i < limit; i++) {
			for (int j = i + 1; j < limit; j++) {

				if (sortedNumberList[i] < sortedNumberList[j]) {
					int temp = sortedNumberList[i];
					sortedNumberList[i] = sortedNumberList[j];
					sortedNumberList[j] = temp;

				}

			}

		}

		for (int i = 0; i < limit; i++) {
			System.out.println(sortedNumberList[i]);
		}
	}
	static void ascending(int[] sortedNumberList,int limit) {
		for (int i = 0; i < limit; i++) {
			for (int j = i + 1; j < limit; j++) {

				if (sortedNumberList[i] > sortedNumberList[j]) {
					int temp = sortedNumberList[i];
					sortedNumberList[i] = sortedNumberList[j];
					sortedNumberList[j] = temp;

				}

			}

		}

		for (int i = 0; i < limit; i++) {
			System.out.println(sortedNumberList[i]);
		}
	}

}
