package com.ilp.basicprogramming_assignment;

import java.util.Scanner;

public class Q16FrequencyOfAllNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter limit for array");
		int limit = scanner.nextInt();
		System.out.println("Enter element in an array");

		int userArray[] = new int[limit];

		for (int i = 0; i < limit; i++) {
			userArray[i] = scanner.nextInt();
		}

		int sortedArray[] = new int[limit];
		sortedArray = sort(userArray);
		for (int i = 0; i < limit - 1; i++) {
			int count=1;
			for (int j = i + 1; j < limit ; j++) {
//				System.out.println("i :"+i+",j :"+j);
				if (sortedArray[i] == sortedArray[j]) {
					count++;
					i++;
				}
			}
			System.out.println("count of "+sortedArray[i]+" :"+count);
		}

	}

	static int[] sort(int[] sortedNumberList) {
		for (int i = 0; i < sortedNumberList.length; i++) {
			
			for (int j = i + 1; j < sortedNumberList.length; j++) {
				

				if (sortedNumberList[i] < sortedNumberList[j]) {
					int temp = sortedNumberList[i];
					sortedNumberList[i] = sortedNumberList[j];
					sortedNumberList[j] = temp;

				}

			}

		}
		return sortedNumberList;

	}

}
