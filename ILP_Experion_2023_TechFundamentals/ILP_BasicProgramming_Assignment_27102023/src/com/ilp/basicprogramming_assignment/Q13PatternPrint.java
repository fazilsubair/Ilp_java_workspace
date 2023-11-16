package com.ilp.basicprogramming_assignment;

import java.util.Scanner;

public class Q13PatternPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		int limit = scanner.nextInt();

		int upper = (limit - 1) / 2;
		int lower = upper;
		int temp = 1;
		int upperSpace = (limit - 1) / 2;
		int lowerSpace = upperSpace - 1;
		for (int i = 1; i <= upper; i++) {
			for (int j = 1; j <= upperSpace; j++) {
				System.out.print("  ");
			}
			upperSpace--;
			for (int j = 1; j <= temp; j++) {
				System.out.print("* ");
			}
			System.out.println();
			temp = temp + 2;
		}
		for (int i = 1; i <= limit; i++) {

			System.out.print("* ");
		}

		System.out.println();
		temp = limit - 2;
		for (int i = lower; i >= 1; i--) {

			for (int j = 1; j <= lowerSpace; j++) {
				System.out.print("  ");
			}
			lowerSpace++;

			for (int j = 1; j <= temp; j++) {
				System.out.print("* ");
			}
			System.out.println();
			temp = temp - 2;
		}

	}

}
