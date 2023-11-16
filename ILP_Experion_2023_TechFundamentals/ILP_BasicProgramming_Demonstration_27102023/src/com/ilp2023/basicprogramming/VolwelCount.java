package com.ilp2023.basicprogramming;

import java.util.Scanner;

public class VolwelCount {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char vowelCheck[] = new char[5];
		int count = 0;
		System.out.println("enter 5 characters");

		for (int index = 0; index < vowelCheck.length; index++) {
			vowelCheck[index] = scanner.next().charAt(0);

		}

		for (int index = 0; index < vowelCheck.length; index++) {

			switch (vowelCheck[index]) {
			case 'a':

			case 'e':

			case 'i':

			case 'o':

			case 'u':

				count++;

			}
		}
		System.out.println(count);

	}

}
