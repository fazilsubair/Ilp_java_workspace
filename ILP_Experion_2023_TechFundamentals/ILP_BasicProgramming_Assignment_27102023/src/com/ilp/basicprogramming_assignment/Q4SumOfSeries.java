package com.ilp.basicprogramming_assignment;

import java.util.Scanner;

public class Q4SumOfSeries {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		
		int userInput,firstNumber=0,secondNumber=1,temp;
		int sum = 1;
		userInput = scanner.nextInt();
//		System.out.println(start);
		for (int i =1;i<userInput;i++) {
			
			temp = firstNumber + secondNumber;
			firstNumber = secondNumber;
			secondNumber = temp;
			sum = sum +(secondNumber*secondNumber*secondNumber);
			
			
			
		}
		System.out.println(sum);
		
		
		
		

	}

}
