package com.ilp.basicprogramming_assignment;

import java.util.Scanner;

public class Q6SumOfSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		int userInput = scanner.nextInt();
		float sum  = 0;
		
		for(int i  =1 ;i<=userInput;i++) {
			sum = sum + i/fact(i);
		}
		System.out.println(sum);

		

	}

	static float fact(float number) {
		float sumOfFact = 1;
		for (int i = 1; i <= number; i++) {
			sumOfFact = sumOfFact * i;
		}
		return sumOfFact;
	}

}
