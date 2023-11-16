package com.ilp.basicprogramming_assignment;

import java.util.Scanner;

public class Q17SumOfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter limit for array");
		int limit = scanner.nextInt();
		System.out.println("Enter element in an array");

		int userArray[] = new int[limit];
		int sortedArray[] = new int[limit];
		for (int i = 0; i < limit; i++) {
			userArray[i] = scanner.nextInt();
		
		}
		sortedArray = sort(userArray);
		int i=0,j=limit-1;
		int sum  =8,temp= 0 ;
		while (i<limit/2) {
			temp =  sortedArray[i]+sortedArray[j];
		if (sum>temp ) {
				j--;
			}
			else if (sum<temp ) {
				i++;
			}
			else if (sum==temp) {
				System.out.println(sortedArray[j] +" "+ sortedArray[i]);
				i++;
				temp=0;
			}
			
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
