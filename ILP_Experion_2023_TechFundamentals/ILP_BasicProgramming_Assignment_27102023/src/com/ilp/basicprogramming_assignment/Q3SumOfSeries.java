package com.ilp.basicprogramming_assignment;

import java.util.Scanner;

public class Q3SumOfSeries {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		int input = scanner.nextInt();
		int flag =0,sum =0;
		for(int i = 1; i <=input; i=i+2) {
			
			if ( flag == 0 ) {
				sum = sum + i;	
				flag= 1;
				
			}
			else {
				sum = sum-i;
				flag= 0;

			}
		}
		
		System.out.println(sum);
	
	}

}
