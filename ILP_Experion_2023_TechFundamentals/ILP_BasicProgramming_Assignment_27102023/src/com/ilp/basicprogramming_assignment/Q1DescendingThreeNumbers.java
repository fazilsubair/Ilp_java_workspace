package com.ilp.basicprogramming_assignment;

import java.util.Scanner;

public class Q1DescendingThreeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numb[] = new int[3];
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 3 number");

		for (int i = 0; i < 3; i++) {

			numb[i] = scanner.nextInt();

		}

		for (int i = 0; i < 3; i++) {
			for (int j = i + 1; j < 3; j++) {

				if (numb[i] < numb[j]) {
					int temp = numb[i];
					numb[i] = numb[j];
					numb[j] = temp;

				}

			}

		}

		System.out.println("after swap");
		for (int index = 0; index < 3; index++) {

			System.out.println(numb[index]);

		}

	}
//
//	void swap(int numb1, int numb2) {
//		int temp = numb1;
//		numb1 = numb2;
//		numb1 = temp;
//		
//
//	}
}
