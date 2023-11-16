package com.ilp.basicprogramming_assignment;

import java.util.Scanner;

public class Q19FrequecyOFCharReplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter a string:");
		String userInputString = scanner.nextLine();
		System.out.println("enter a character:");

		char userInputChar= scanner.next().charAt(0);
		
		System.out.println("enter a character tobe replaced:");
		char userInputCharToReplaced= scanner.next().charAt(0);
		
		int occurenceOfCharacter=0 ;
		
		
		
		for(int i =0;i<userInputString.length();i++) {
			if(userInputChar == userInputString.charAt(i)) {
				occurenceOfCharacter++;
				
				userInputString = userInputString.substring(0,i) + userInputCharToReplaced +
						userInputString.substring(i+1);
				
			}
		}
		System.out.println("Character Count : "+occurenceOfCharacter +"\nReplaced String:"+ userInputString);

		
	}

}
