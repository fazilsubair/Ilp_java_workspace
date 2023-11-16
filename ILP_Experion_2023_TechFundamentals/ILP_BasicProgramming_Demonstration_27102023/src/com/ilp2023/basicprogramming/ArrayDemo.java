package com.ilp2023.basicprogramming;

import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int markList[] = new int[5];
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 5 values\n------------------------");
		for (int index = 0; index < 5; index++) {
			markList[index] = scanner.nextInt();
		}
		System.out.println("The 5 values are \n------------------------");
		for (int index = 0; index < 5; index++) {
			System.out.println(markList[index]);
		}
	}

}
