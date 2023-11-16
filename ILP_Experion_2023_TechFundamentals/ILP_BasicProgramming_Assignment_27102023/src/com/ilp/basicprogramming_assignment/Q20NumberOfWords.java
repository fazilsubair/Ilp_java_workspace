package com.ilp.basicprogramming_assignment;

import java.util.Scanner;

public class Q20NumberOfWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter a string:");
		String userInputString = scanner.nextLine();
		int wordCount =1 ;
		
		for (int i =0 ; i<userInputString.length();i++) {
			if ( ' ' == userInputString.charAt(i)) {
				wordCount++;
			}
			
		}
		System.out.println(wordCount);
	}

}
