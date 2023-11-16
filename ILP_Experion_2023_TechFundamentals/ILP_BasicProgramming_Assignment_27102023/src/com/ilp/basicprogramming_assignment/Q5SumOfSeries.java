package com.ilp.basicprogramming_assignment;
import java.lang.*;
import java.util.Scanner;

public class Q5SumOfSeries {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		int input = scanner.nextInt();
		int flag =0;
		double sum =0;
		for(int i = 1,k=1; i <=input; i=i+2,k++) {
			
			if ( flag == 0 ) {
				sum = sum + Math.pow(i, k);	
				flag= 1;
				
			}
			else {
				sum = sum-Math.pow(i, k);
				flag= 0;

			}
		}
		
		System.out.println(sum);
	
	}

}
