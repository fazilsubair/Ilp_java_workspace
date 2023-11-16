package com.ilp.basicprogramming_assignment;

import java.util.Scanner;

public class Q18DuplicateRemove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter limit for array");
		int limit = scanner.nextInt();
		System.out.println("Enter element in an array");

		int userArray[] = new int[limit];
		int sortedArray[] = new int[limit];
		for(int  i = 0; i<limit;i++) {
			userArray[i]=scanner.nextInt();
		}
		
		
		sortedArray=sort(userArray);
		
		int j =1;
		for(int i = 1;i<limit;i++) {
			
			if(sortedArray[i]!=sortedArray[i-1]) {
				sortedArray[j] = sortedArray[i];
				j++;
				
			}
		
		}
		
		
		for(int  i = 0; i<j;i++) {
			System.out.println(sortedArray[i]);
		}
		
		
		

	}

	static int[] sort(int[] sortedNumberList) {
		for (int i = 0; i < sortedNumberList.length; i++) {

			for (int j = i + 1; j < sortedNumberList.length; j++) {

				if (sortedNumberList[i] > sortedNumberList[j]) {
					int temp = sortedNumberList[i];
					sortedNumberList[i] = sortedNumberList[j];
					sortedNumberList[j] = temp;

				}

			}

		}
		return sortedNumberList;

	}
}
