package com.ilp.basicprogramming_assignment;

import java.util.Scanner;

public class Q2AscendingDescending4Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numberList[] = new int[4];

		System.out.println("Enter 4 numbers");
		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < 4; i++) {
			numberList[i] = scanner.nextInt();
		}
		int sortedNumberList[] = new int[4];
		sortedNumberList = numberList;
		
		System.out.println("1.sort ascending \n2.sort descending  ");
		int choice = scanner.nextInt();
		
		switch(choice) {
		case 1:
			ascending(sortedNumberList);
			break;
		case 2 :
			descending(sortedNumberList);
			break;
	
			
		}
		
	}

	static void descending(int[] sortedNumberList) {
		for (int i = 0; i < 4; i++) {
			for (int j = i + 1; j < 4; j++) {

				if (sortedNumberList[i] < sortedNumberList[j]) {
					int temp = sortedNumberList[i];
					sortedNumberList[i] = sortedNumberList[j];
					sortedNumberList[j] = temp;

				}

			}

		}

		for (int i = 0; i < 4; i++) {
			System.out.println(sortedNumberList[i]);
		}
	}
	static void ascending (int[] sortedNumberList) {
		for (int i = 0; i < 4; i++) {
			for (int j = i + 1; j < 4; j++) {

				if (sortedNumberList[i] > sortedNumberList[j]) {
					int temp = sortedNumberList[i];
					sortedNumberList[i] = sortedNumberList[j];
					sortedNumberList[j] = temp;

				}

			}

		}

		for (int i = 0; i < 4; i++) {
			System.out.println(sortedNumberList[i]);
		}
	}

}
